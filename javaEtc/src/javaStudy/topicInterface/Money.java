package javaStudy.topicInterface;

public interface Money {
	abstract void give(int money, String date);
	abstract void receive(int money, String date);
}

interface Work{
	abstract void work(int salary, String date);
}
