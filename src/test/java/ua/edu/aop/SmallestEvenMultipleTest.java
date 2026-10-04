package ua.edu.aop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestEvenMultipleTest {

    private final SmallestEvenMultiple solution = new SmallestEvenMultiple();

    @Test
    void returnsDoubleForOddNumber() {
        assertEquals(10, solution.smallestEvenMultiple(5));
    }

    @Test
    void returnsSameNumberForEvenNumber() {
        assertEquals(6, solution.smallestEvenMultiple(6));
    }

    @Test
    void worksForOne() {
        assertEquals(2, solution.smallestEvenMultiple(1));
    }
}
