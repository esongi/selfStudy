package javaStudy.topicInterface;

class Citizen extends Person implements Money, Work {

	@Override
	public void work(int salary, String date) {
		System.out.println(date + "] + " + salary);
	}

	@Override
	public void give(int money, String date) {
		System.out.println(date + " ] + " + money);
	}

	@Override
	public void receive(int money, String date) {
		System.out.println(date + " ] + " + money);
	}
}

class Life {
	public static void main(String args[]) {
		Citizen c = new Citizen();
		c.give(1000, "2015-05-01");
		c.receive(25000, "2015-05-02");
		c.work(300000, "2015-05-25");
	}
}