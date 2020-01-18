package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void multiplicationTest() {

        Euro cinco = new Euro(5);

        Euro result = cinco.times(2);

        assertEquals(new Euro(10), result);

        result = cinco.times(3);

        assertEquals(new Euro(15), result);

    }

    @Test
    void equalTest() {
        assertEquals(new Euro(10), new Euro(10));
        assertNotEquals(new Euro(10), new Euro(20));
    }

}
