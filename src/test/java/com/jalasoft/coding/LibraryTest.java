package com.jalasoft.coding;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Library test class.
 */
public class LibraryTest {

    /**
     * Verify some library method.
     */
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        Assert.assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
