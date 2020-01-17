package cgd.pt.springcgdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void somaTest() {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.soma(3, 5);

        assertEquals(8, soma);
    }

    @Test
    void subtrairTest() {
        Calculadora calculadora = new Calculadora();

        int subtrair = calculadora.subtrair(8, 3);

        assertEquals(5, subtrair);
    }
}