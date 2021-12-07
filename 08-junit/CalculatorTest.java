package put.io.testing.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    void test_add() {
        assertTrue(calculator.add(2,2) == 4);
        assertTrue(calculator.add(-1,3) == 2);
    }

    @Test
    void test_multiply() {
        assertTrue(calculator.multiply(2,2) == 4);
        assertTrue(calculator.multiply(-1,3) == -3);
    }

    @Test
    void addPositiveNumbers() {
        //assertTrue(calculator.addPositiveNumbers(-2, 3) == 1);
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           calculator.addPositiveNumbers(-2,3);
        });
    }
}