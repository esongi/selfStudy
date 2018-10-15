package javaStudy.ch11;

import java.io.Serializable;

// ��ü ��ü�� ����ȭ�� ������ Ŭ�����κ��� ������ ��ü���� �Ѵ�
// ����ȭ Ŭ������ Serializable �������̽��� �޾Ƽ� ���� �� �ִ�
// Ŭ���� �� ���ǵ� �����ڳ� �޼���� ����ȭ ����� ���� �ʰ� ������, �� �ʵ常 ����ȭ ���
class StuInfo implements Serializable {
	
	// �ʵ� ����ȭ O
	String name;
	int age;

	// ������ ����ȭ X
	StuInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// �޼��� ����ȭ X
	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}
