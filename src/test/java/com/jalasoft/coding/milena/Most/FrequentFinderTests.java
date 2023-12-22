package com.jalasoft.coding.milena.Most;

import com.jalasoft.coding.milena.MostFrequentFinder;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class FrequentFinderTests {
    /**
     * This test verify that the most frequent item for collection is returned.
     */

    @Test
    public void findMostFrequentNumberInArrayTest() {
        final int[] input = new int[]{3, -1, -1, -1, 2, 3, 3, -1, 2, 4, 9, 3};
        var finder = new MostFrequentFinder();
        int result = finder.findMostFrequentItem(input);
        final int expected = 4;
        assertEquals(expected, result);

    }


    /**
     * Test to Verify the most frequent item in an Empty Array.
     */
    @Test
    public void findMostFrequentNumberEmptyArrayTest() {
        final int[] input = new int[0];
        var finder = new MostFrequentFinder();
        int result = finder.findMostFrequentItem(input);
        int expected = 0;
        assertEquals(expected, result);
    }

}
