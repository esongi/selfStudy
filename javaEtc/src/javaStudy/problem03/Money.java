package javaStudy.problem03;

public class Money {

  private int amount;

  // 생성자
  public Money(int amount) {
    this.amount = amount;
  }

  // 값을 확인하기 위한 메서드
  public int printAmount() {
    return this.amount;
  }

  public Money add(Money money) {
    return new Money(this.amount + money.amount);
  }

  public Money minus(Money money) {
    return new Money(this.amount - money.amount);
  }

  public Money multiply(Money money) {
    return new Money(this.amount * money.amount);
  }

  public Money devide(Money money) {
    return new Money(this.amount / money.amount);
  }

  public boolean equals(Money money) {
    if (money != null) {
      return this.amount == money.amount;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return this.amount;
  }
}
