package cgd.pt.springcgdtest;

public class Bank {
    public Money reduce(Expression expression, String toCurrency) {
        Sum sum = (Sum) expression;
        return new Money(sum.first.amount + sum.second.amount, toCurrency);
    }
}
