package javaStudy.problem03;

import static org.junit.Assert.fail;

public class Main {

  public static void main(String[] args) {
    Money five = new Money(5);
    Money two = new Money(2);
    Money three = new Money(3);
    Money ten = new Money(10);

    if (five.equals(two.add(three)) && three.equals(five.minus(two))
        && ten.equals(five.multiply(two)) && two.equals(ten.devide(five))) {
      System.out.println("Money Class 구현 완료");
    }

    Money t1 = new Money(10);
    if(t1.equals(null) != false) {
        fail();
    }

    Money t2 = new Money(10);
    if(t1.hashCode() != t2.hashCode()) {
        fail();
    }
  }
}
