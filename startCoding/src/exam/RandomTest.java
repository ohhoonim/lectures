package exam;

import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		/*
		double ran = Math.random();
		// ==> 0 ~ 1 ������ ������ ���ڸ� �������ش�. 
		System.out.println(ran);
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		
		for (int i = 0 ; i < 100; i++) {
			int result = (int)(Math.random() * 6) + 1;
			System.out.println(result);
		}
		*/
		
		// (����) �ֻ��� ����
		// ����ڰ� 1 ~ 6������ ���ڸ� �Է��ϰ� �����ϸ�
		// �������� ������(1~6������ ����) ���ڿ� ���Ͽ� 
		// ������Է� ���ڰ� ũ�� ��, ������ ��
		// ������ ������ ������ �� ������, ���д� �����Ͽ� ����� �����ش�. 
		
//		int[] resultCnt = new int[3]; // 0:��, 1:��, 2:��
		// �¹��� ��������� �����ϴ� �迭
		int[] resultCnt = {0, 0, 0}; // 0:��, 1:��, 2:��
		// ** �Է��� �߸��� ��쿡 ���Ͽ��� ó������ ����. (��) ���ڸ� �Է����� ��� ��
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1 ~ 6������ ���ڸ� �Է��ϼ���");
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
				
			System.out.println(resultCnt[0] + "��"
					+ resultCnt[1] + "�� " + resultCnt[2] + "��");
		}
		
		
	}
}





