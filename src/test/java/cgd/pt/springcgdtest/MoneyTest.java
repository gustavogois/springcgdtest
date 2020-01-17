package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void multiplicationTest() {

        Euro cinco = new Euro(5);

        Euro result = cinco.times(2);

        assertEquals(10, result.amount);

        result = cinco.times(3);

        assertEquals(15, result.amount);

    }
}
