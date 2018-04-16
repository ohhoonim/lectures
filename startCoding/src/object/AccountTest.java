package object;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		// ���°輳 : 10000��
		Account acc = new Account(10000);
		System.out.println("���°��� �� �ܾ�: " + acc.showBalance());
		// �޴�...
		// 1. �Ա�
		// 2. ���
		// 3. �ܾ���ȸ
		while(true) {
			System.out.println("====== �޴��� �����ϼ���");
			System.out.println(" 1. �Ա�");
			System.out.println(" 2. ���");
			System.out.println(" 3. �ܾ���ȸ");
			System.out.println("====================");
			Scanner scanner = new Scanner(System.in);
			int selectedMenu = scanner.nextInt();
			int money = 0;
			switch(selectedMenu) {
			case 1:  // �Ա�
				System.out.println("�Ա� �� �ܾ� : " + acc.showBalance());
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
				money = scanner.nextInt();
				
				acc.deposit(money);
				System.out.println("�Ա� �� �ܾ� : " + acc.showBalance());
				break;
			case 2:  // ���
				System.out.println("��� �� �ܾ� : " + acc.showBalance());
				System.out.println("����� �ݾ��� �Է��ϼ���");
				money = scanner.nextInt();
				//acc.balance -= money;
				if(acc.withdraw(money)) {
					System.out.println("����� �Ǿ����ϴ�.");
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				System.out.println("��� �� �ܾ� : " + acc.showBalance());
				break;
			case 3: // �ܾ���ȸ
				System.out.println("�ܾ� : " + acc.showBalance());
				break;
			}
			
		}
		
		
	}
}





