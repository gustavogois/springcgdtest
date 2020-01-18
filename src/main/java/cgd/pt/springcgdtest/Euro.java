package cgd.pt.springcgdtest;

public class Euro extends Money {

    public Euro(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {

        return Money.euro(amount * multiplier);
    }

}
