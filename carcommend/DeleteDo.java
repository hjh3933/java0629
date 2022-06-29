package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class DeleteDo implements ExcuteCommend {

	@Override
	public void excuteCommend() {
		System.out.println("자동차삭제 실행");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("삭제할 데이터의 자동차 등록번호 입력");
		String car_no = scn.next(); 
		
		CarDao dao = CarDao.getInstance();
		int rs = dao.deleteDo(car_no);
		
		System.out.println(rs);
		if (rs != 1) {
			System.out.println("자동차 삭제 실패");
		} else {
			System.out.println("자동차 정보 삭제 성공");
		}

		
	}
	
}
