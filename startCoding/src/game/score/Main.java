package game.score;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("==== �޴� =====");
			System.out.println(" 1. score ��ȸ");
			System.out.println(" 2. score �߰�");
			System.out.println("==============");
		
			int menuNum = scanner.nextInt();
			
			switch (menuNum) {
			case 1:
				Score.list();
				break;
			case 2:
				System.out.println("�̸��� �Է��ϼ���");
				String name = scanner.next();
				System.out.println("������ �Է��ϼ���");
				int score = scanner.nextInt();				
				Score.add(name, score);
				Score.list();
				break;
			}
		}
		
	}
}
