package cgd.pt.springcgdtest;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression expression, String toCurrency) {
        return expression.reduce(this, toCurrency);
    }

    public int rate(String from, String to) {
        return rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
