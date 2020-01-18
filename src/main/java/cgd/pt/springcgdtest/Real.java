package cgd.pt.springcgdtest;

public class Real extends Money {

    public Real(int amount) {
        this.amount = amount;
    }

    @Override
    public String currency() {
        return "R$";
    }

    public Money times(int multiplier) {

        return new Real(amount * multiplier);
    }

}
