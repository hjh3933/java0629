package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class UpdateDo implements ExcuteCommend {

	@Override
	public void excuteCommend() {
		System.out.println("�������� ���� ����");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������ �ڵ��� Ÿ��(A,B,C) �Է�");
		String car_type = scn.next();

		System.out.println("������ �����(20220629) �Է�");
		String car_last_check_date = scn.next();

		System.out.println("������ ������(20220629) �Է�");
		String car_expire_date = scn.next();
		
		System.out.println("������ �ڵ��� ��Ϲ�ȣ �Է�");
		String car_no = scn.next();
		
		CarDao dao = CarDao.getInstance();
		int rs = dao.updateDo(car_no, car_type, car_last_check_date, car_expire_date);
		
		if (rs != 1) {
			System.out.println("������������ ����");
		} else {
			System.out.println("������������ ����");
		}
		
	}
	
}
