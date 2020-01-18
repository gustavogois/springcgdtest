package cgd.pt.springcgdtest;

public class Euro extends Money {

    private String currency;

    public Euro(int amount) {
        this.amount = amount;
        this.currency = "€";
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {

        return new Euro(amount * multiplier);
    }

}
