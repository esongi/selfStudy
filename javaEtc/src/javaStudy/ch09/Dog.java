package javaStudy.ch09;

public class Dog extends Animal {

	@Override
	void cry() {
		for (int i = 0; i < 5; i++) {
			System.out.println("港港");
		}
	}
}

class Cat extends Animal {

	@Override
	void cry() {
		for (int j = 0; j < 5; j++) {
			System.out.println("具克");
		}
	}
}
