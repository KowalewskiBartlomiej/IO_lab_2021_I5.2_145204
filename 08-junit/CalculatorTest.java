package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

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
}