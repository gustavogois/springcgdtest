package cgd.pt.springcgdtest;

import java.util.Objects;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money euro(int amount) {
        return new Money(amount, "€");
    }

    public static Money real(int amount) {
        return new Money(amount, "R$");
    }

    public Money times(int multiplier) {

        return new Money(amount * multiplier, this.currency);
    }

    public String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.currency != ((Money)o).currency) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Expression plus(int amount) {
        return null;
    }
}
