package javaStudy.ch11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// �ڵ� Boxing(�⺻Ÿ�Կ��� ��������)
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// ���Խ� �ڵ� unboxing(����Ÿ�Կ��� �⺻Ÿ������)
		int value = obj;
		System.out.println("value: " + value);

		// ���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}