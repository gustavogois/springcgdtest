package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testSimpleAddition() {
        Expression expression = new Sum(Money.euro(5), Money.euro(5));
        Bank bank = new Bank();
        Money reduced = bank.reduce(expression, "€");

        assertEquals(10, reduced);
    }

    @Test
    void testStructureSum() {
        Money five = Money.euro(5);
        Expression expression = five.plus(7);
        Sum sum = (Sum) expression;

        assertEquals(5, sum.first);
        assertEquals(7, sum.second);
    }

    @Test
    void testReduceMoney() {
        Money five = Money.euro(1);
        Bank bank = new Bank();
        Money result = bank.reduce(five, "€");

        assertEquals(Money.euro(1), result);
    }

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

    @Test
    void testCurrency() {
        assertEquals("€", Money.euro(1).currency());
        assertEquals("R$", Money.real(1).currency());
    }
}
