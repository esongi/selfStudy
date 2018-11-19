package javaStudy.ch11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 Boxing(기본타입에서 포장으로)
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 대입시 자동 unboxing(포장타입에서 기본타입으로)
		int value = obj;
		System.out.println("value: " + value);

		// 연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}