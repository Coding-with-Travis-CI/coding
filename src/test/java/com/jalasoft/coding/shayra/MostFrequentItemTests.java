package com.jalasoft.coding.shayra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MostFrequentItemTests {

    /**
     * Public static int array which is used for testing purpose.
     */
    public static final int[] INPUTARRAY = {5, 5, 5, 1, -1, -1, -1, -1};

    /**
     * Public static int which is the expected result for the testing input INPUTARRAY.
     */
    public static final int EXPECTED = 4;

    /**
     * Test to find the count of most frequent item in an Empty Array.
     */
    @Test
    public void mostFrequentItemEmptyArrayTest() {
        int[] inputArray = new int[0];
        int actual = MostFrequentItem.mostFrequentItem(inputArray);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to find the count of most frequent item in an Array.
     */
    @Test
    public void mostFrequentItemArrayTest() {
        int actual = MostFrequentItem.mostFrequentItem(INPUTARRAY);
        Assert.assertEquals(actual, EXPECTED);
    }
}
