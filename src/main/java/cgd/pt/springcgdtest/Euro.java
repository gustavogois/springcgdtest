package cgd.pt.springcgdtest;

public class Euro extends Money {

    public Euro(int amount) {
        this.amount = amount;
    }

    @Override
    public String currency() {
        return "€";
    }

    public Money times(int multiplier) {

        return new Euro(amount * multiplier);
    }

}
