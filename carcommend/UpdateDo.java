package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class UpdateDo implements ExcuteCommend {

	@Override
	public void excuteCommend() {
		System.out.println("차량정보 수정 실행");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("수정할 자동차 타입(A,B,C) 입력");
		String car_type = scn.next();

		System.out.println("수정할 계약일(20220629) 입력");
		String car_last_check_date = scn.next();

		System.out.println("수정할 출차일(20220629) 입력");
		String car_expire_date = scn.next();
		
		System.out.println("수정할 자동차 등록번호 입력");
		String car_no = scn.next();
		
		CarDao dao = CarDao.getInstance();
		int rs = dao.updateDo(car_no, car_type, car_last_check_date, car_expire_date);
		
		if (rs != 1) {
			System.out.println("차량정보수정 실패");
		} else {
			System.out.println("차량정보수정 성공");
		}
		
	}
	
}
