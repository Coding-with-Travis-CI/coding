package com.jalasoft.coding.jonathan;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class ReverseWordsTest {
    /**
     * This test should reverse an empty string.
     */
    @Test
    public void reverseEmptyString() {
        String input = "";
        String actual = ReverseWords.reverse(input);
        String expected = "";
        Assert.assertEquals(actual, expected);
    }

    /**
     * This test should reverse any word that has 5 letters or more.
     */
    @Test
    public void reverseFiveLettersOrMore() {
        String input = "The expected place of the test is satisfactory";
        String actual = ReverseWords.reverse(input);
        String expected = "The detcepxe ecalp of the test is yrotcafsitas";
        Assert.assertEquals(actual, expected);
    }
}
