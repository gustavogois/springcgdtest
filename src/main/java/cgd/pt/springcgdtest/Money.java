package cgd.pt.springcgdtest;

import java.util.Objects;

public abstract class Money {

    protected int amount;
    protected String currency;

    public abstract String currency();

    public abstract Money times(int amount);

    public static Euro euro(int amount) {
        return new Euro(amount, "€");
    }

    public static Real real(int amount) {
        return new Real(amount, "R$");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

}
