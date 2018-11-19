package javaStudy.ch11;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		// 포장 객체는 내부 값을 비교하기 위해 ==와 != 연산자 사용 불가
		// 값을 언박싱해 비교하거나, equals() 메소드로 내부 값 비교할 것
		System.out.println("[-128~127 초과값일 경우]");
		
		// 자동 박싱(포장 클래스 타입에 기본값이 대입될 때): 기본 타입의 값을 포장 객체로 만드는 과정
		Integer obj1 = 300;  
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후  == 결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과:" + obj1.equals(obj2));
		System.out.println();

		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}
}
