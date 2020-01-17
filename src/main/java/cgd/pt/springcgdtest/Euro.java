package cgd.pt.springcgdtest;

public class Euro {

    public int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    public Euro times(int multiplier) {

        return new Euro(amount * multiplier);

    }
}
