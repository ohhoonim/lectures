package exam;

import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		/*
		double ran = Math.random();
		// ==> 0 ~ 1 사이의 랜덤한 숫자를 추출해준다. 
		System.out.println(ran);
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		
		for (int i = 0 ; i < 100; i++) {
			int result = (int)(Math.random() * 6) + 1;
			System.out.println(result);
		}
		*/
		
		// (문제) 주사위 게임
		// 사용자가 1 ~ 6까지의 숫자를 입력하고 실행하면
		// 랜덤으로 추출한(1~6사이의 숫자) 숫자와 비교하여 
		// 사용자입력 숫자가 크면 승, 작으면 패
		// 게임은 여러번 실행할 수 있으며, 승패는 누적하여 결과를 보여준다. 
		
//		int[] resultCnt = new int[3]; // 0:승, 1:무, 2:패
		// 승무패 누적결과를 저장하는 배열
		int[] resultCnt = {0, 0, 0}; // 0:승, 1:무, 2:패
		// ** 입력을 잘못한 경우에 대하여는 처리하지 않음. (예) 문자를 입력했을 경우 등
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1 ~ 6까지의 숫자를 입력하세요");
			int input = scanner.nextInt();
			int ranNum = (int)(Math.random() * 6) + 1;
			
			if (input > ranNum) {
				System.out.println("you win!");
				resultCnt[0]++;
			} else if (input < ranNum) {
				System.out.println("you lose.");
				resultCnt[2]++;
			} else if (input == ranNum) {
				System.out.println("draw");
				resultCnt[1]++;
			}
				
			System.out.println(resultCnt[0] + "승"
					+ resultCnt[1] + "무 " + resultCnt[2] + "패");
		}
		
		
	}
}





