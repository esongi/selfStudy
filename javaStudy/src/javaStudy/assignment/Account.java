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
		System.out.println("[���¹�ȣ:" + account_num + "] +" + money + ", �ܾ�" + balance);
	}

	void withdraw(int money) {
		if (this.balance - money < 0) {
			System.out.println("�ܾ��� �����մϴ�");
		} else {
			this.balance -= money;
			System.out.println("[���¹�ȣ:" + account_num + "] -" + money + ", �ܾ�" + balance);
		}
	}

	void checkBalance() {
		System.out.println("[���¹�ȣ:" + account_num + "] �ܾ�:" + balance);
	}
}
