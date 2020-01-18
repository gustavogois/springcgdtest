package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void multiplicationTestEuro() {

        Money cinco = Money.euro(5);

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

        Money cinco = Money.real(5);

        assertEquals(Money.real(10), cinco.times(2));

        assertEquals(Money.real(15), cinco.times(3));

    }

    @Test
    void equalTestReal() {
        assertEquals(Money.real(10), Money.real(10));
        assertNotEquals(Money.real(10), Money.real(20));
    }

    @Test
    void equalTestRealEuro() {
        assertNotEquals(Money.real(10), Money.euro(10));
    }

}
