package javaStudy.ch11;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println("===¹Ú½Ì===");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println("===¾ð¹Ú½Ì===");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
