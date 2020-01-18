package cgd.pt.springcgdtest;

import java.util.Objects;

public class Euro {

    public int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    public Euro times(int multiplier) {

        return new Euro(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return amount == euro.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
