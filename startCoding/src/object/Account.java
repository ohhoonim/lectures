package object;

public class Account {
	
	private int balance;  // �ܾ�
	
	Account (int balance) {
		this.balance = balance;
	}		
	// �Ա�
	void deposit(int money) {
		this.balance += money;
	}	
	// ���
	boolean withdraw(int money) {
		boolean isWithdraw = false;
		if (this.balance >= money) {
			this.balance -= money;
			isWithdraw = true;
		} 	
		return isWithdraw;
	}
	// �ܾ���ȸ
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
