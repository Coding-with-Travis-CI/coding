package com.jalasoft.coding.Susana;

public final class ReverseString {

    /**
     * Constructor.
     */
    private ReverseString() {
    }

    /**
     * Spins words with more than 4 letters.
     *
     * @param input words.
     * @return spin words.
     */
    public static String reverse(final String input) {
        String[] split = input.split("\\s+");
        final int lengthWordsRequired = 4;
        String spinWords = "";

        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > lengthWordsRequired) {
                String reverse = new StringBuilder(split[i]).reverse().toString();
                if (i == split.length - 1) {
                    spinWords = spinWords + reverse;
                } else {
                    spinWords = spinWords + reverse + " ";
                }
            } else {
                if (i == split.length - 1) {
                    spinWords = spinWords + split[i];
                } else {
                    spinWords = spinWords + split[i] + " ";
                }
            }
        }
        return spinWords;
    }
}
