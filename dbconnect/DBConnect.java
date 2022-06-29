package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("driver OK");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 OK");
		} catch (ClassNotFoundException e) {
			System.out.println("driver No");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 fall");
			e.printStackTrace();
		}
		
		//finally하지 말 것
		
		
		
		return conn;
	}
}
