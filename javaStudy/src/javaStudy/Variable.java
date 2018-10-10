package javaStudy;

public class Variable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		Integer num3 = new Integer(10);
		Integer num4 = new Integer(10);

		System.out.println("숫자 두 내용값: " + num3.equals(num4));

		if (num3 == num4) {
			System.out.println("참조값이 같다");
		} else {
			System.out.println("참조값이 다르다");
		}

		System.out.println("===================");

		String word1 = "JAVA";
		String word2 = "JAVA";

		System.out.println("문자열 두 내용값: " + word1.equals(word2));

		if (word1 == word2) {
			System.out.println("참조값이 같다");
		} else {
			System.out.println("참조값이 다르다");
		}

		System.out.println("==================");

		String word3 = new String("JAVA");
		String word4 = new String("JAVA");

		System.out.println("문자열 두 내용값: " + word3.equals(word4));

		if (word3 == word4) {
			System.out.println("참조값이 같다");
		} else {
			System.out.println("참조값이 다르다");
		}

		System.out.println("==================");

		String str = "example";
		System.out.println(str);
		
		str = "example";
		System.out.println(str);
		
		// 처음 생성한 example 이라는 문자열은 그대로 남아있고 
		// 다시 선언한 문자열을 생성한다는 것이 불변의 속성. 
		// 그래서 처음에 생성한 인스턴스는 gc(가비지컬렉션)이 회수한다
		
		String word11 = null;
		String word12 = null;
		
		if (word11 != null && word11.equals(word12)) {
			System.out.println("asdf");
		} else {
			System.out.println("아님");
		}
		
		System.out.println("확인");
	}
}
