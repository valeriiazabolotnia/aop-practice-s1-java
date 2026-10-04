package ua.edu.aop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOddNumbersInIntervalRangeTest {

    private final CountOddNumbersInIntervalRange solution =
            new CountOddNumbersInIntervalRange();

    @Test
    void countsOddsInSimpleRange() {
        assertEquals(3, solution.countOdds(3, 7));
    }

    @Test
    void countsOddsInRangeWithOneOddNumber() {
        assertEquals(1, solution.countOdds(8, 10));
    }

    @Test
    void countsOddsWhenBoundsAreEqual() {
        assertEquals(1, solution.countOdds(5, 5));
        assertEquals(0, solution.countOdds(4, 4));
    }
}
