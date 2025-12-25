package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddPositive() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testAddNegative() {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.add(2, -3));
    }
}

