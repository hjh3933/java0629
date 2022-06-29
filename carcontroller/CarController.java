package org.project.carcontroller;

import java.util.Scanner;

import org.project.carcommend.DeleteDo;
import org.project.carcommend.ExcuteCommend;
import org.project.carcommend.InsertDo;
import org.project.carcommend.SelectDo;
import org.project.carcommend.UpdateDo;

public class CarController {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		ExcuteCommend commend;
		
		while (true) {
			System.out.println("쿼리문을 입력하세요 insert.do, select.do, update.do, delete.do");
			String queryDo = scn.next();
			String query = queryDo.substring(0, queryDo.length() - 3);
			System.out.println("query: " + query);
			
			if (query.equals("insert")) {
				commend = new InsertDo();
				commend.excuteCommend();
			} 
			//	else if(query.equals("select")) {
//				System.out.println("query: " + query);
//				commend = new SelectDo();
//				commend.excuteCommend();
//			} else if(query.equals("update")) {
//				System.out.println("query: " + query);
//				commend = new UpdateDo();
//				commend.excuteCommend();
//			} else if(query.equals("delete")) {
//				System.out.println("query: " + query);
//				commend = new DeleteDo();
//				commend.excuteCommend();
//			} 	else if (queryDo.equals("exit")) {
//				System.out.println("입력값: " + queryDo);
//				System.out.println("종료합니다");
//				break;
//			} else {
//				System.out.println("쿼리문 입력오류");
//			}
		}
//		scn.close();
		
		
		
	}
}
