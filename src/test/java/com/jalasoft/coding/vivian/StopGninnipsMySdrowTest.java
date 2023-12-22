package com.jalasoft.coding.vivian;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StopGninnipsMySdrowTest {
    /**
     * Test to a single word with 2 letters.
     */
    @Test
    public void spinningSingleWordHiTest() {
        String input = "Hi";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "Hi";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a single word with 3 letters.
     */
    @Test
    public void spinningSingleWordFixTest() {
        String input = "Fix";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "Fix";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a single word with 5 letters.
     */
    @Test
    public void spinningSingleWordLinuxTest() {
        String input = "Linux";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "xuniL";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a single phrase with words with 4 letters or less.
     */
    @Test
    public void spinningSinglePhraseTest() {
        String input = "This is a test";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "This is a test";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a regular phrase with words with 3 letters or more.
     */
    @Test
    public void spinningRegularPhraseTest() {
        String input = "Hey fellow warriors";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "Hey wollef sroirraw";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to an advanced phrase with words with 5 letters or more.
     */
    @Test
    public void spinningAdvancedPhraseTest() {
        String input = "Welcome gentlemen ladies";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "emocleW nemeltneg seidal";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a phrase with some number.
     */
    @Test
    public void spinningNoNumbersTest() {
        String input = "You are the number 1";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "Numbers are not allowed. You must enter only letters.";
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to a phrase with empty string.
     */
    @Test
    public void spinningEmptyTest() {
        String input = "";
        String actual = StopGninnipsMySdrow.spinWords(input);
        String expected = "You must enter one or more words.";
        Assert.assertEquals(actual, expected);
    }
}
