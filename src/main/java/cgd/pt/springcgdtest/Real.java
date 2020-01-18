package cgd.pt.springcgdtest;

public class Real extends Money {

    public Real(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {

        return Money.real(amount * multiplier);
    }

}
