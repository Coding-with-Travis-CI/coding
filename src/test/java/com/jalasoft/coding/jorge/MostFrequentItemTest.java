package com.jalasoft.coding.jorge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MostFrequentItemTest {
    /**
     * Empty Array Test.
     */
    @Test
    public void emptyArrayTest() {
        /*
        int array[] = {};
        int actual = MostFrequentItem.search(array);
        int expected[] = {};
        Assert.assertEquals(actual, expected);
        */
        int[] inputArray = new int[0];
        int actual = MostFrequentItem.search(inputArray);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test Frequent Item.
     */
    @Test
    public void frequentItemTest() {
        final int[] array = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actual = MostFrequentItem.search(array);
        int expected = -1;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test Counted times of frequent Item.
     */
    @Test
    public void occurrencesCount() {
        final int[] array = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actual = MostFrequentItem.counter(array);
        final int expected = 5;
        Assert.assertEquals(actual, expected);
    }
}
