package javaStudy.ch11;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		// �Է� Ŭ������ ��ü�� ��� sc��� ������, Ű���忡�� �Է¹޴� Scanner Ŭ������ ��ü�� ���� �����Ͽ� ����
		Scanner sc = new Scanner(System.in);

		// ���ڿ� ���� ��� name��� ������ sc���� nextLine() �޼��带 ȣ���Ͽ� ���ڿ��� ���� ���� �о� �ͼ� ����(enterŰ��
		// �ٹٲ��ϱ� ������)
		System.out.println("name:");
		String name = sc.nextLine();

		// ���� ���� ��� i��� ������ sc���� nextInt()�޼��带 ȣ���Ͽ� ������ ���� ���� �о�ͼ� ����(spaceŰ�� ���� ������)
		System.out.println("age:");
		int age = sc.nextInt();

		System.out.println("***ȸ������***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("***********");
	}
}
