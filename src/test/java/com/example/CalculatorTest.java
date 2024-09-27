package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 should equal 0");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        // Intentionally causing this test to fail
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1"); // This should be 1, but we expected 2
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
    }
}
