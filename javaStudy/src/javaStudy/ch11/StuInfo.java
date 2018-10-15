package javaStudy.ch11;

import java.io.Serializable;

// 객체 자체가 직렬화가 가능한 클래스로부터 생성된 객체여야 한다
// 직렬화 클래스는 Serializable 인터페이스를 받아서 만들 수 있다
// 클래스 내 정의된 생성자나 메서드는 직렬화 대상이 되지 않고 데이터, 즉 필드만 직렬화 대상
class StuInfo implements Serializable {
	
	// 필드 직렬화 O
	String name;
	int age;

	// 생성자 직렬화 X
	StuInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메서드 직렬화 X
	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}
