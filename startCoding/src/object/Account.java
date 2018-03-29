package object;

public class Account {
	
	int balance;  // 잔액
	
	Account (int balance) {
		this.balance = balance;
	}		
	// 입금
	void deposit(int money) {
		this.balance += money;
	}	
	// 출금
	boolean withdraw(int money) {
		boolean isWithdraw = false;
		if (this.balance >= money) {
			this.balance -= money;
			isWithdraw = true;
		} 	
		return isWithdraw;
	}
	// 잔액조회
	int showBalance() {
		return this.balance;
	}
	
}
