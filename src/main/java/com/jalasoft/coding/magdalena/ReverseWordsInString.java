package com.jalasoft.coding.magdalena;

/**
 * @author Magdalena
 * @version 1.1
 */
public final class ReverseWordsInString {

    /**
     * Variable created to indicate the minimum number of letters to revert.
     */
    static final int SIZE_OF_WORD = 5;

    /**
     *  Default constructor of the class.
     */
    private ReverseWordsInString() {
        // default constructor
    }

    /**
     * Reverses words with size of 5 or more letter of a String.
     *
     * @param input input string
     * @return string with some reversed words
     */
    public static String reverseWordOfString(final String input) {
        String[] splitInput = input.split(" ");
        String[] res = new String[splitInput.length];

        for (int i = 0; i <= (splitInput.length) - 1; i++) {

            if (splitInput[i].length() >= SIZE_OF_WORD) {
                res[i] = new StringBuilder(splitInput[i]).reverse().toString();
            } else {
                res[i] = splitInput[i];
            }
        }

        return String.join(" ", res);
    }
}
