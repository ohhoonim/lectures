package controlStatement;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		if (a == b) {
			System.out.println("a�� b�� ����");
		} else if (a < b) {
			System.out.println("a�� b���� �۴�");
		} else if (a > b) {
			System.out.println("a�� b���� ũ��");
		}
		////////////////////////////////////
		if (a == b) {
			System.out.println("a�� b�� ����");
		} 
		if (a < b) {
			System.out.println("a�� b���� �۴�");
		} 
		if (a > b) {
			System.out.println("a�� b���� ũ��");
		}
		System.out.println("====================");
		
		/*
		 *    90�̻� A
		 *    80�̻� B
		 *    70�̻� C
		 *    ������ D
		 */
		//Scanner scanner = new Scanner(System.in);
		
		int score = 23;//scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		System.out.println("====================");
		if (score >= 90) {
			System.out.println("A");
		} 
		if (score >= 80) {
			System.out.println("B");
		} 
		if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		///switch ///////////////////////////////
		System.out.println("====================");
		
		// 1 : ��, 2: ȭ.....
		
		int weekNum = 2;
		// ���ǻ��� : jdk 1.5���������� ���ڿ��� switch������ ����� �� ����. 
		switch (weekNum) {  
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("ȭ");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		}
		
		String strA = "C";
		
		switch(strA) {
		case "Z":
			System.out.println("Z�Դϴ�.");
			break;
		case "A":
			System.out.println("A�Դϴ�.");
			break;
		default:
			System.out.println("A�� Z�� �ƴմϴ�.");	
		}
		
		
		
	}
}













