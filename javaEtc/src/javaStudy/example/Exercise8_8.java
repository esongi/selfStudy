package javaStudy.example;

import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			try {
				count++;
				System.out.print("1�� 100 ������ ���� �Է��ϼ���: ");

				input = new Scanner(System.in).nextInt();

				if (answer > input) {
					System.out.println(input + "���� �� ū ���� �Է��ϼ���.");
				} else if (answer < input) {
					System.out.println(input + "���� �� ���� ���� �Է��ϼ���");
				} else {
					System.out.println("�����Դϴ�");
					System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�");
					break;
				}
			} catch (Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է��ϼ���");
			}

		} while (true);
	}
}
