package javaStudy.problem02;

public class Main {

  public static void main(String[] args) {
    String[] expressions = {"3 + 4", "12 * 4", "8 / 2", "10 - 2"};

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

    if (arith == "+") {
      return new Add();
    } else if (arith == "-") {
      return new Sub();
    } else if (arith == "*") {
      return new Mul();
    } else if (arith == "/") {
      return new Div();
    } else {
      System.out.println("잘못된 접근입니다");
    }

    return null;
  }
}
