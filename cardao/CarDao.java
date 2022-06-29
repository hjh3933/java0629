package org.project.cardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.project.dbconnect.DBConnect;

public class CarDao {
	// ½Ì±ÛÅæ
	private static final CarDao INSTANCE = new CarDao();

	private CarDao() {
		System.out.println("CarDao");
	}

	public static CarDao getInstance() {
		return INSTANCE;
	}

	// Â÷·®µî·Ï ¸Þ¼­µå
	public int insertDo(String car_no, String car_type,
			
			String car_last_check_date, String car_expire_date) {
		int rs = 0;

		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into car  values(?,?,?,?) ";
						
			
			pstm = conn.prepareStatement(query);

			pstm.setString(1, car_no);
			pstm.setString(2, car_type);
			pstm.setString(3, car_last_check_date);
			pstm.setString(4, car_expire_date);

			rs = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


		return rs;
	}

	public int updateDo(String car_no, String car_type, String car_last_check_date, String car_expire_date) {
		int rs = 0;

		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update car set car_type = ?, car_last_check_date = ?, "
					+ " car_expire_date = ? where car_no = ?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, car_type);
			pstm.setString(2, car_last_check_date);
			pstm.setString(3, car_expire_date);
			pstm.setString(4, car_no);

			rs = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rs;
	}

	public int deleteDo(String car_no) {
		int rs = 0;

		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from car where car_no = ?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, car_no);

			rs = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rs;
	}
}
