package com.jalasoft.coding.jonathan;

public final class ReverseWords {
    /**
     * Class' default constructor.
     */
    private ReverseWords() {
        // constructor
    }

    /**
     * MINIMUM states the number of letters necessary for reversing the string.
     */
    static final int MINIMUM = 5;

    /**
     * Reverses words with size of 5 or more letter of a String.
     *
     * @param input input string.
     * @return string with words reversed depending on the amount of letters.
     */
    public static String reverse(final String input) {
        String[] splitInput = input.split(" ");
        String[] res = new String[splitInput.length];
        for (int i = 0; i <= (splitInput.length) - 1; i++) {
            if (splitInput[i].length() >= MINIMUM) {
                res[i] = new StringBuilder(splitInput[i]).reverse().toString();
            } else {
                res[i] = splitInput[i];
            }
        }
        return String.join(" ", res);
    }
    //sorry for the delay, Marcos
}
