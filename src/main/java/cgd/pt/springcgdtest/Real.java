package cgd.pt.springcgdtest;

public class Real extends Money {

    public Real(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {

        return Money.real(amount * multiplier);
    }

}
