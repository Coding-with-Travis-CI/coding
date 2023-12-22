package com.jalasoft.coding.vivian;

public final class StopGninnipsMySdrow {
    private StopGninnipsMySdrow() {
        // Default constructor.
    }

    /**
     * Takes in a string of one or more words, and returns the same string,
     * but with all five or more letter words reversed.
     *
     * @param word string
     * @return Specific message or processed string
     */
    public static String spinWords(final String word) {
        if (word.length() > 0) {
            for (int j = 0; j < word.length(); j++) {
                if (Character.isDigit(word.charAt(j))) {
                    String message = "Numbers are not allowed. You must enter only letters.";
                    return message;
                }
            }
            final int quantityLetters = 5;
            String[] arr = word.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() >= quantityLetters) {
                    arr[i] = new StringBuffer(arr[i]).reverse().toString();
                }
            }
            return String.join(" ", arr);
        } else {
            String message = "You must enter one or more words.";
            return message;
        }

    }
}
