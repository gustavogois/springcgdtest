package cgd.pt.springcgdtest;

public class Euro {

    public int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }
}
