package cgd.pt.springcgdtest;

public class Sum implements Expression {

    Money first;
    Money second;

    public Sum(Money first, Money second) {
        this.first = first;
        this.second = second;
    }
}
