package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class DeleteDo implements ExcuteCommend {

	@Override
	public void excuteCommend() {
		System.out.println("�ڵ������� ����");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������ �������� �ڵ��� ��Ϲ�ȣ �Է�");
		String car_no = scn.next(); 
		
		CarDao dao = CarDao.getInstance();
		int rs = dao.deleteDo(car_no);
		
		System.out.println(rs);
		if (rs != 1) {
			System.out.println("�ڵ��� ���� ����");
		} else {
			System.out.println("�ڵ��� ���� ���� ����");
		}

		
	}
	
}
