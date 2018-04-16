package object;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		// 계좌계설 : 10000원
		Account acc = new Account(10000);
		System.out.println("계좌개설 후 잔액: " + acc.showBalance());
		// 메뉴...
		// 1. 입금
		// 2. 출금
		// 3. 잔액조회
		while(true) {
			System.out.println("====== 메뉴를 선택하세요");
			System.out.println(" 1. 입금");
			System.out.println(" 2. 출금");
			System.out.println(" 3. 잔액조회");
			System.out.println("====================");
			Scanner scanner = new Scanner(System.in);
			int selectedMenu = scanner.nextInt();
			int money = 0;
			switch(selectedMenu) {
			case 1:  // 입금
				System.out.println("입금 전 잔액 : " + acc.showBalance());
				System.out.println("입금할 금액을 입력하세요");
				money = scanner.nextInt();
				
				acc.deposit(money);
				System.out.println("입금 후 잔액 : " + acc.showBalance());
				break;
			case 2:  // 출금
				System.out.println("출금 전 잔액 : " + acc.showBalance());
				System.out.println("출금할 금액을 입력하세요");
				money = scanner.nextInt();
				//acc.balance -= money;
				if(acc.withdraw(money)) {
					System.out.println("출금이 되었습니다.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				System.out.println("출금 후 잔액 : " + acc.showBalance());
				break;
			case 3: // 잔액조회
				System.out.println("잔액 : " + acc.showBalance());
				break;
			}
			
		}
		
		
	}
}





