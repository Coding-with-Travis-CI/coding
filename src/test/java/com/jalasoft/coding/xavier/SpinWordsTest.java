package com.jalasoft.coding.xavier;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class SpinWordsTest {
    /**
     * Test to spin empty string.
     */
    @Test
    public void spinWordsEmptyStringTest() {
        String input = "";
        String actual = SpinWords.spinWords(input);
        String expected = "";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Test to spin single word string with less than 5 of length.
     */
    @Test
    public void spinWordsSingleWordLessThan5Test() {
        String input = "Word";
        String actual = SpinWords.spinWords(input);
        String expected = "Word";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Test to spin single word string with more than 5 of length.
     */
    @Test
    public void spinWordsSingleWordMoreThan5Test() {
        String input = "Spinword";
        String actual = SpinWords.spinWords(input);
        String expected = "drownipS";
        Assert.assertEquals(actual, expected);
    }
    /**
     * Test to spin multiple words string.
     */
    @Test
    public void spinWordsMultipleWordsTest() {
        String input = "Hello this is Shayra's tests";
        String actual = SpinWords.spinWords(input);
        String expected = "olleH this is s'aryahS stset";
        Assert.assertEquals(actual, expected);
    }
}
