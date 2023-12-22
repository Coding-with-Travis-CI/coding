package com.jalasoft.coding.magdalena;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @version 1.1
 * @author Magdalena
 */
public class ReverseWordsInStringTest {

    /**
     * Test to no word is reverse when all words of string has less 4 letters.
     */
    @Test
    public void reverseStringNOWordHasMore5Letters() {
        String input = "Hi! have a nice day";
        String actual = ReverseWordsInString.reverseWordOfString(input);
        String expected = "Hi! have a nice day";
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to word is reverse in the string when it has 5 letters or more.
     */
    @Test
    public void reverseStringWithWordHasMore5Letters() {
        String input = "Good morning! have a nice day";
        String actual = ReverseWordsInString.reverseWordOfString(input);
        String expected = "Good !gninrom have a nice day";
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to all words are reverse in the string when it has 5 letters or more.
     */
    @Test
    public void reverseAllWordsOfStringWithMore5Letters() {
        String input = "Morning! happiness including positive emotions ranging";
        String actual = ReverseWordsInString.reverseWordOfString(input);
        String expected = "!gninroM ssenippah gnidulcni evitisop snoitome gnignar";
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test to empty string.
     */
    @Test
    public void reverseEmptyString() {
        String input = "";
        String actual = ReverseWordsInString.reverseWordOfString(input);
        String expected = "";
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }

}
