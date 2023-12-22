package com.jalasoft.coding.Susana;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Spin Words test class.
 */
public final class SpinWordsTest {

    /**
     * Constructor.
     */
    private SpinWordsTest() {
    }

    /**
     * Verify spin words with "Hey fellow warriors" sentence.
     */
    @Test
    public static void test1SpinWordsMethod() {
        String input = "Hey fellow warriors";
        String actual = ReverseString.reverse(input);
        String expected = "Hey wollef sroirraw";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Verify spin words with "This is a test" sentence.
     */
    @Test
    public static void test2SpinWordsMethod() {
        String input = "This is a test";
        String actual = ReverseString.reverse(input);
        String expected = "This is a test";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Verify spin words with "This is another test" sentence.
     */
    @Test
    public static void test3SpinWordsMethod() {
        String input = "This is another test";
        String actual = ReverseString.reverse(input);
        String expected = "This is rehtona test";
        Assert.assertEquals(actual, expected);
    }
}
