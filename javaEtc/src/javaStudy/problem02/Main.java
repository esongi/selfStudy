package javaStudy.problem02;

public class Main {

	public static void main(String[] args) {
		String[] expressions = { "3 + 4", "12 * 4", "8 / 2", "10 - 2" };

		for (String expression : expressions) {
			String[] tokens = expression.split(" ");

			String arith = tokens[1];
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);

			// num1, num2, arith 세 개의 변수와 getInstance 메소드를 사용하여
			// 문제의 결과화면에 맞게 출력하는 계산기 나머지 코드를 아래에 완성 하십시오.
			// 주어진 코드는 수정하지 않습니다.
		}

		System.out.println(getInstance("+").calculate(3, 4));
		System.out.println(getInstance("*").calculate(12, 4));
		System.out.println(getInstance("/").calculate(8, 2));
		System.out.println(getInstance("-").calculate(10, 2));


	}

	public static Arithmetic getInstance(String arith) {

		// 메소드 구현을 완성 하십시오.
		// problem02.Main.getInstance("+").calculate(3, 4));

		// getInstance(arith).calculate(a, b);
		//int num1;
		//int num2;

		//String arr[] =  new String[arith.length()];
		//String test = arr[1];
		//int num1 = Integer.parseInt(arr[0]);
		//int num2 = Integer.parseInt(arr[2]);


		if (arith == "+") {
			return new Add();
			//return add.calculate(num1, num2);
			//add.calculate(a, b);
		} else if (arith == "-") {
		    	return new Sub();
			//return sub.calculate(a, b);
		} else if (arith == "*") {
		    	return new Mul();
			//return mul.calculate(a, b);
		} else if (arith == "/") {
		    	return new Div();
			//return div.calculate(a, b);
		}

		return null;
	}
}