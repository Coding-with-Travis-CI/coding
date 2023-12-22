/*
package com.jalasoft.coding.jorge;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class SpinWords {
    private SpinWords() {
        //Constructor
    }

    */
/**
     * Set the delimiter for string.
     *//*

    public static final int MAX_LENGHT = 5;

    */
/**
     * @param input it is the variable that receives the string from tests.
     * @return input reversed in methods.
     *//*

    public static String reverse(final String input) {
        String res = "";
        if (input.isEmpty()) {
            return res;
        }
        res = Pattern.compile(" +").splitAsStream(input)
                .map(word -> word.length() < MAX_LENGHT ? word : new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        return res;
    }
}
*/
