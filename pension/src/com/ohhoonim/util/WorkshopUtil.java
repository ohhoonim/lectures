package com.ohhoonim.util;

import java.util.Scanner;

public class WorkshopUtil {
	public static String getUserInput(String msg) {
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);		
		return sc.nextLine();
	};
	
	public static void printHeader() {
		System.out.println("======<< �� ��� ���� �ý���>>======");
		System.out.println("1. ��ü �� ��ȸ");
		System.out.println("2. �Խ�");
		System.out.println("3. ���");
		System.out.println("0. ����");
		System.out.println("===============================");
	}
}
