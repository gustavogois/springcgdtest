package cgd.pt.springcgdtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void beforeEach() {
        calculadora = new Calculadora();
    }

    @Test
    void somaTest() {

        int soma = calculadora.soma(3, 5);

        assertEquals(8, soma);
    }

    @Test
    void subtrairTest() {

        int subtrair = calculadora.subtrair(8, 3);

        assertEquals(5, subtrair);
    }
}