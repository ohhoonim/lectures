package controlStatement;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		if (a == b) {
			System.out.println("a와 b는 같다");
		} else if (a < b) {
			System.out.println("a는 b보다 작다");
		} else if (a > b) {
			System.out.println("a는 b보다 크다");
		}
		////////////////////////////////////
		if (a == b) {
			System.out.println("a와 b는 같다");
		} 
		if (a < b) {
			System.out.println("a는 b보다 작다");
		} 
		if (a > b) {
			System.out.println("a는 b보다 크다");
		}
		System.out.println("====================");
		
		/*
		 *    90이상 A
		 *    80이상 B
		 *    70이상 C
		 *    나머지 D
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
		
		// 1 : 월, 2: 화.....
		
		int weekNum = 2;
		// 주의사항 : jdk 1.5버전까지는 문자열을 switch문에서 사용할 수 없다. 
		switch (weekNum) {  
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		case 7:
			System.out.println("일");
			break;
		}
		
		String strA = "C";
		
		switch(strA) {
		case "Z":
			System.out.println("Z입니다.");
			break;
		case "A":
			System.out.println("A입니다.");
			break;
		default:
			System.out.println("A도 Z도 아닙니다.");	
		}
		
		
		
	}
}













