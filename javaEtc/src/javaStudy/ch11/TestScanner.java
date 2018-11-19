package javaStudy.ch11;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		// 입력 클래스의 객체를 담는 sc라는 변수에, 키보드에서 입력받는 Scanner 클래스의 객체를 새로 생성하여 저장
		Scanner sc = new Scanner(System.in);

		// 문자열 값을 담는 name라는 변수에 sc안의 nextLine() 메서드를 호출하여 문자열로 다음 값을 읽어 와서 저장(enter키로
		// 줄바꿈하기 전까지)
		System.out.println("name:");
		String name = sc.nextLine();

		// 정구 값을 담는 i라는 변수에 sc안의 nextInt()메서드를 호출하여 정수로 다음 값을 읽어와서 저장(space키로 띄어쓰기 전까지)
		System.out.println("age:");
		int age = sc.nextInt();

		System.out.println("***회원정보***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("***********");
	}
}
