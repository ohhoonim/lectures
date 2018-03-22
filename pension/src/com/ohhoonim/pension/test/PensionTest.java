package com.ohhoonim.pension.test;

import com.ohhoonim.pension.biz.IPensionBiz;
import com.ohhoonim.pension.biz.PensionBiz;
import com.ohhoonim.util.WorkshopUtil;

public class PensionTest {
	public static void main(String[] args) {
		IPensionBiz biz = new PensionBiz();
		biz.initiallizeRoomData();
		while (true) {
			try {
				WorkshopUtil.printHeader();			
				String input = WorkshopUtil.getUserInput("# �޴��� �Է��ϼ��� >> ");
				
				switch(input) {
				case "0": // ����
					System.out.println("Bye~ Bye");
					System.exit(0);
					break;
				case "1": // ��ü �� ��ȸ
					biz.roomList();
					break;
				case "2": // �Խ�
					String inRoomId = WorkshopUtil.getUserInput("�����Ͻ� �� ��ȣ�� �Է��ϼ���. >>");
					String custName = WorkshopUtil.getUserInput("������ �̸��� �Է��ϼ��� >> ");
					String custPhone = WorkshopUtil.getUserInput("������ ��ȭ��ȣ�� �Է��ϼ��� >> ");
					biz.checkIn(inRoomId, custName, custPhone);
					break;
				case "3": // ���
					String outRoomId = WorkshopUtil.getUserInput("����Ͻ� �� ��ȣ�� �Է��ϼ���. >>");
					biz.checkOut(outRoomId);
					break;
				default:
					System.out.println("�޴��� �����ϴ�.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
		}
	}
}
