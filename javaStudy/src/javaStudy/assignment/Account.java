package javaStudy.assignment;

public class Account {
	String account_num;
	String depositor;
	String date;
	int balance;

	Account(String account_num, String depositor, int balance) {
		super();
		this.account_num = account_num;
		this.depositor	 = depositor;
		this.balance	 = balance;
	}

	public Account() {

	}
	void deposit(int money) {
		this.balance += money;
		System.out.println("[°èÁÂ¹øÈ£:" + account_num + "] +" + money + ", ÀÜ¾×" + balance);
	}

	void withdraw(int money) {
		if (this.balance - money < 0) {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù");
		} else {
			this.balance -= money;
			System.out.println("[°èÁÂ¹øÈ£:" + account_num + "] -" + money + ", ÀÜ¾×" + balance);
		}
	}

	void checkBalance() {
		System.out.println("[°èÁÂ¹øÈ£:" + account_num + "] ÀÜ¾×:" + balance);
	}
}
