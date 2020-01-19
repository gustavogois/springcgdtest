package cgd.pt.springcgdtest;

public class Bank {

    public Money reduce(Expression expression, String toCurrency) {
        return expression.reduce(toCurrency);
    }

    public int rate(String from, String to) {
        return (from.equals("R$") && to.equals("€")) ? 5 : 1;
    }
}
