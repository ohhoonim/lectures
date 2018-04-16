package object;

public class Account {
	
	private int balance;  // ÀÜ¾×
	
	Account (int balance) {
		this.balance = balance;
	}		
	// ÀÔ±Ý
	void deposit(int money) {
		this.balance += money;
	}	
	// Ãâ±Ý
	boolean withdraw(int money) {
		boolean isWithdraw = false;
		if (this.balance >= money) {
			this.balance -= money;
			isWithdraw = true;
		} 	
		return isWithdraw;
	}
	// ÀÜ¾×Á¶È¸
	int showBalance() {
		return this.balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
