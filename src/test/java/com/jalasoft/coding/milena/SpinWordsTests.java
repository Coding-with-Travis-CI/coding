package com.jalasoft.coding.milena;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */

public class SpinWordsTests {
    /**
     * Test to spin empty string.
     */
    @Test
    public void spinWordsEmptyStringTest() {
        var spinWords = new SpinWords("");
        String input = "";
        String actual = spinWords.spinWords(input);
        String expected = "";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin is not executed with a word with a single letter.
     */

    @Test
    public void spinWordSingleLetterTest() {
        var spinWords = new SpinWords("");
        String input = "A";
        String actual = spinWords.spinWords(input);
        String expected = "A";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin is not executed with a word with two Characters.
     */
    @Test
    public void spinWordOnlyTwoLetterTest() {
        var spinWords = new SpinWords("");
        String input = "Se";
        String actual = spinWords.spinWords(input);
        String expected = "Se";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin is not executed for a word less than 5 characters.
     */
    @Test
    public void spinWordsSingleWordLessThan5Test() {
        var spinWords = new SpinWords("");
        String input = "Test";
        String actual = spinWords.spinWords(input);
        String expected = "Test";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin string with a word with more than 5 characters.
     */
    @Test
    public void spinWordsSingleWordMoreThan5Test() {
        var spinWords = new SpinWords("");
        String input = "Follow";
        String actual = spinWords.spinWords(input);
        String expected = "wolloF";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to spin a phrase with multiple words string.
     */
    @Test
    public void spinWordsPhraseTest() {
        var spinWords = new SpinWords("");
        String input = "Hey fellow warriors";
        String actual = spinWords.spinWords(input);
        String expected = "Hey wollef sroirraw";
        Assert.assertEquals(actual, expected);
    }
}
