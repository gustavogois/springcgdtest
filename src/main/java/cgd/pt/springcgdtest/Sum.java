package cgd.pt.springcgdtest;

public class Sum implements Expression {

    Money first;
    Money second;

    public Sum(Money first, Money second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = first.amount + second.amount;
        return new Money(amount, to);
    }
}
