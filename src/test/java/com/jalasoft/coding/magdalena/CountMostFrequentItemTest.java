package com.jalasoft.coding.magdalena;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Magdalena
 * @version 1.1
 */
public class CountMostFrequentItemTest {
    /**
     * Test to find the count the most frequent when array only has 1 number.
     */
    @Test
    public void countMostFrequentWithOneNumber() {
        final int[] input = {10};
        int mostFrequent = CountMostFrequentItem.countTheFrequent(input);
        int expected = 1;
        Assert.assertEquals(mostFrequent, expected);
    }

    /**
     * Test to find the count the most frequent when 2 numbers has the same frequency.
     */
    @Test
    public void countMostFrequent2numbersWithMostFrequent() {
        final int[] input = {10, 2, 5, 14, 2, 5, 2, 5};
        int mostFrequent = CountMostFrequentItem.countTheFrequent(input);
        System.out.println(mostFrequent);
        final int expected = 3;
        Assert.assertEquals(mostFrequent, expected);
    }

    /**
     * Test to find the count the most frequent with empty array.
     */
    @Test
    public void countMostFrequentInEmptyArray() {
        int[] input = {};
        int mostFrequent = CountMostFrequentItem.countTheFrequent(input);
        int expected = 0;
        Assert.assertEquals(mostFrequent, expected);
    }

    /**
     * Test to count the most frequent from an array.
     */
    @Test
    public void countMostFrequentOfArray() {
        final int[] input = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int mostFrequent = CountMostFrequentItem.countTheFrequent(input);
        System.out.println(mostFrequent);
        final int expected = 5;
        Assert.assertEquals(mostFrequent, expected);
    }

}
