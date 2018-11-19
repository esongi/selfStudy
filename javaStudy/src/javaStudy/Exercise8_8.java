package javaStudy;

import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			try {
				count++;
				System.out.print("1과 100 사이의 값을 입력하세요: ");

				input = new Scanner(System.in).nextInt();

				if (answer > input) {
					System.out.println(input + "보다 더 큰 수를 입력하세요.");
				} else if (answer < input) {
					System.out.println(input + "보다 더 작은 수를 입력하세요");
				} else {
					System.out.println("정답입니다");
					System.out.println("시도 횟수는 " + count + "번 입니다");
					break;
				}
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력하세요");
			}

		} while (true);
	}
}
