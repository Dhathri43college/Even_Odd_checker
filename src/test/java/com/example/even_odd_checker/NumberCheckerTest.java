package com.example.even_odd_checker;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", NumberChecker.check(4));
        assertEquals("Even", NumberChecker.check(0));
        assertEquals("Even", NumberChecker.check(-2));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", NumberChecker.check(7));
        assertEquals("Odd", NumberChecker.check(-3));
    }
}
