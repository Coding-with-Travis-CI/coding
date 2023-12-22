package com.jalasoft.coding.shayra;

public final class SpinWords {

    private SpinWords() {
        //Default constructor
    }

    /**
     * Public static int which has the Limit value for word's length to reverse.
     */
    public static final int LIMIT = 5;

    /**
     * Takes in a string of one or more words, with all five or more letter words reversed.
     *
     * @param input input string.
     * @return spun string.
     */
    public static String spinWords(final String input) {

        String res = "";
        String[] stringSplited = input.split(" ");
        if (input.isEmpty()) {
            return res;
        }
        for (int i = 0; i < stringSplited.length; i++) {
            if (stringSplited[i].length() >= LIMIT) {
                stringSplited[i] = new StringBuilder(stringSplited[i]).reverse().toString();
            }
        }
        res = String.join(" ", stringSplited);
        return res;
    }
}
