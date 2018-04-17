package game.score;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("==== 메뉴 =====");
			System.out.println(" 1. score 조회");
			System.out.println(" 2. score 추가");
			System.out.println("==============");
		
			int menuNum = scanner.nextInt();
			
			switch (menuNum) {
			case 1:
				Score.list();
				break;
			case 2:
				System.out.println("이름을 입력하세요");
				String name = scanner.next();
				System.out.println("점수를 입력하세요");
				int score = scanner.nextInt();				
				Score.add(name, score);
				Score.list();
				break;
			}
		}
		
	}
}
