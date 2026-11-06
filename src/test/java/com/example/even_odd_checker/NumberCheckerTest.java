package com.example.even_odd_checker;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", NumberChecker.check(4));
       
    }

    @Test
    public void testOddNumber() {
        assertEquals("Even", NumberChecker.check(7));
    }
}
