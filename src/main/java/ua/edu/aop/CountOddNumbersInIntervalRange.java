package ua.edu.aop;

/**
 * LeetCode 1523. Count Odd Numbers in an Interval Range.
 */
public class CountOddNumbersInIntervalRange {

    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
