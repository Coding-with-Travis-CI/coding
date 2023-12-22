package com.jalasoft.coding.jonathan;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class MostFrequentItemTest {
    /**
     * This test should count and retrieve the amount of times the most frequent item is present in the array.
     */
    @Test
    public void testSomeLibraryMethod() {
        final int[] frequentItemArray = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actual = MostFrequentItem.mostFrequentItemCount(frequentItemArray);
        final int expected = 5;

        Assert.assertEquals(actual, expected);
    }
}
