package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void multiplicationTestEuro() {

        Euro cinco = new Euro(5);

        assertEquals(new Euro(10), cinco.times(2));

        assertEquals(new Euro(15), cinco.times(3));

    }

    @Test
    void equalTestEuro() {
        assertEquals(new Euro(10), new Euro(10));
        assertNotEquals(new Euro(10), new Euro(20));
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
