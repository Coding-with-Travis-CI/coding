package com.jalasoft.coding.vivian;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MostFrequentItemTest {
    /**
     * Test to a single array.
     */
    @Test
    public void frequentItemSingleArray() {
        final int numberEight = 8;
        int[] inputArray = new int[]{numberEight};
        int actual = MostFrequentItem.frequentItem(inputArray);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a single array with two items.
     */
    @Test
    public void frequentItemSingle2Array() {
        final int numberEight = 8;
        final int numberNegativeTwo = -2;
        int[] inputArray = new int[]{numberEight, numberNegativeTwo };
        int actual = MostFrequentItem.frequentItem(inputArray);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a regular array with three or more items.
     */
    @Test
    public void frequentItemRegularArray() {
        final int numberEight = 8;
        final int numberNegativeTwo = -2;
        final int numberThree = 3;
        int[] inputArray = new int[]{numberEight, numberNegativeTwo, numberEight, numberThree};
        int actual = MostFrequentItem.frequentItem(inputArray);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to an empty array.
     */
    @Test
    public void frequentItemEmptyArray() {
        int[] inputArray = new int[0];
        int actual = MostFrequentItem.frequentItem(inputArray);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to an array with negative numbers.
     */
    @Test
    public void frequentItemNegativeArray() {
        final int numberEight = 8;
        final int numberNegativeTwo = -2;
        final int numberFive = 5;
        final int numberFour = 4;
        int[] inputArray = new int[]{numberEight, numberNegativeTwo, numberEight,
                                    1, numberNegativeTwo, numberNegativeTwo, numberFive, numberNegativeTwo};
        int actual = MostFrequentItem.frequentItem(inputArray);
        int expected = numberFour;
        Assert.assertEquals(actual, expected);
    }

}
