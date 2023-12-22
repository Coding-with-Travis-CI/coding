package com.jalasoft.coding.Susana;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Library test class.
 */
public class FrequentItemTest {

    /**
     * Verify some library method.
     */
    @Test
    public void testSomeLibraryMethod() {
        final int[] frequentItemArray = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actualValue = FrequentItem.mosFrequentItem(frequentItemArray);
        final int expectedValue = 5;

        Assert.assertEquals(actualValue, expectedValue);
    }
}
