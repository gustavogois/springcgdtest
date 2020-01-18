package cgd.pt.springcgdtest;

public class Real extends Money {

    private String currency;

    public Real(int amount) {
        this.amount = amount;
        this.currency = "R$";
    }

    @Override
    public String currency() {
        currency = "R$";
        return currency;
    }

    public Money times(int multiplier) {

        return new Real(amount * multiplier);
    }

}
