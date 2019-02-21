package javaStudy.problem03;

public class Money {

    private int amount;

    public Money(int amount) {
	this.amount = amount;
    }

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
	// TODO Auto-generated method stub
	return this.amount;
    }
}