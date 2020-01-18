package cgd.pt.springcgdtest;

public class Real extends Money {

    public Real(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {

        return new Real(amount * multiplier);
    }

}
