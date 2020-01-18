package cgd.pt.springcgdtest;

import java.util.Objects;

public abstract class Money {

    protected int amount;

    public static Euro euro(int amount) {
        return new Euro(amount);
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
