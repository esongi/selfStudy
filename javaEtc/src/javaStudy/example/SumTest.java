package javaStudy.example;

public class SumTest {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;

		while (true) {
			num = num / 10;
			sum = sum + num;
			if (num / 10 == 0) {
				break;
			}
		}
		
		
		System.out.println(sum);
	}
}
