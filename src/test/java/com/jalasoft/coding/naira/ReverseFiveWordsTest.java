package com.jalasoft.coding.naira;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unitest.
 */
public class ReverseFiveWordsTest {

    /**
     * Test for reverseOneWordTest.
     * */
    @Test
    public void reverseOneWordTest() {
        String input = "Naira";
        String actual = ReverseWord.reverse(input);
        String expected = "ariaN";

        Assert.assertEquals(actual, expected);
    }

    /**
     * Test for reverseTwoWordTest.
     * */
    @Test
    public void reverseTwoWordTest() {
        String input = "Hey fellow warriors";
        String actual = ReverseWord.reverse(input);
        String expected = "Hey wollef sroirraw";

        Assert.assertEquals(actual, expected);
    }

    /**
     * Test for reverseStringNoConditionTest.
     * */
    @Test
    public void reverseStringNoConditionTest() {
        String input = "This is a test ";
        String actual = ReverseWord.reverse(input);
        String expected = "This is a test";

        Assert.assertEquals(actual, expected);
    }

    /**
     * Test for reverseWithOneWordTest.
     * */
    @Test
    public void reverseWithOneWordTest() {
        String input = "This is another test";
        String actual = ReverseWord.reverse(input);
        String expected = "This is rehtona test";

        Assert.assertEquals(actual, expected);
    }
}
