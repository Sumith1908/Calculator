package com.example.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final InputStream originalSystemIn = System.in;

    @Before
    public void setUpStreams() {
        // Redirect System.in to provide input for Scanner during testing
        String input = "1\n5\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @After
    public void restoreStreams() {
        // Restore original System.in after testing
        System.setIn(originalSystemIn);
    }

    @Test
    public void testAddition() {
        assertEquals(8.0, calculator.add(3.0, 5.0), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(15.0, calculator.multiply(3.0, 5.0), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(1.6667, calculator.divide(5.0, 3.0), 0.0001);
    }
}
