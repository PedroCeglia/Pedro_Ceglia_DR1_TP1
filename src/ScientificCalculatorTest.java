import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    private ScientificCalculator calc;

    @BeforeEach
    void configurar() {
        calc = new ScientificCalculator();
    }

    // Exercício 2
    @Test
    void testAddition() {
        double resultado = calc.add(3.0, 5.0);
        assertEquals(8.0, resultado, "3.0 + 5.0 deve ser igual a 8.0");
    }

    // Exercício 3
    @Test
    void testSubtract() {
        double resultado = calc.subtract(10.0, 4.0);
        assertEquals(6.0, resultado, "10.0 - 4.0 precisa ser igual a 6.0");
    }

    // Exercício 5
    @Test
    void testSquareRootPositive() {
        double resultado = calc.squareRoot(16.0);
        assertEquals(4.0, resultado, "Raiz quadrada de 16.0 prceicisa ser 4.0");
    }

    // Exercício 6
    @Test
    void testSquareRootNegative() {
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4.0);
        });
        assertEquals("Negative number", excecao.getMessage());
    }

    // Exercício 7
    @Test
    void testDivideByZero() {
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10.0, 0.0);
        });
        assertEquals("Division by zero", excecao.getMessage());
    }

    // Exercício 8
    @Test
    void deveCalcularLogaritmoCorretamente() {
        double resultado = calc.log(Math.E); // ln(e) = 1
        assertEquals(1.0, resultado, 1e-10, "Logaritmo de e deve ser 1.0");
    }

    // Exercício 8: Teste do método sin
    @Test
    void deveCalcularSenoCorretamente() {
        double resultado = calc.sin(90.0); // sin(90°) = 1
        assertEquals(1.0, resultado, 1e-10, "Seno de 90 graus deve ser 1.0");
    }
}