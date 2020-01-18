package cgd.pt.springcgdtest;

import java.util.Objects;

public class Real {

    private int amount;

    public Real(int amount) {
        this.amount = amount;
    }

    public Real times(int multiplier) {

        return new Real(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Real euro = (Real) o;
        return amount == euro.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
