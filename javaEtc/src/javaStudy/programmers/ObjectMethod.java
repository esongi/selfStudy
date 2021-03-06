package javaStudy.programmers;

public class ObjectMethod {

	public static void main(String[] args) {
		Object intObj = 1234;
		Integer intInteger = 1234;
		int intTemp = 1234;

		System.out.println("오브젝트와 래퍼 값은 :" + intObj.equals(intInteger));
		System.out.println("본질은: " + (intObj == intInteger));

		System.out.println("래퍼클래스와 기본형 값은 :" + intInteger.equals(intTemp));
		System.out.println("본질은: " + (intInteger == intTemp));

		System.out.println("getSimpleName메서드: " + intObj.getClass().getSimpleName());
		Object arrayObj = new int[3];
		System.out.println("isArray 메서드는 배열인지 확인: " + arrayObj.getClass().isArray());
	}
}
