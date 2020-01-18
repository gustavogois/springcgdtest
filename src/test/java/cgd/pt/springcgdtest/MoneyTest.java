package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void multiplicationTestEuro() {

        Euro cinco = Money.euro(5);

        assertEquals(Money.euro(10), cinco.times(2));

        assertEquals(Money.euro(15), cinco.times(3));

    }

    @Test
    void equalTestEuro() {
        assertEquals(Money.euro(10), Money.euro(10));
        assertNotEquals(Money.euro(10), Money.euro(20));
    }

    @Test
    void multiplicationTestReal() {

        Real cinco = new Real(5);

        assertEquals(new Real(10), cinco.times(2));

        assertEquals(new Real(15), cinco.times(3));

    }

    @Test
    void equalTestReal() {
        assertEquals(new Real(10), new Real(10));
        assertNotEquals(new Real(10), new Real(20));
    }

    @Test
    void equalTestRealEuro() {
        assertNotEquals(new Real(10), new Euro(10));
    }

}
