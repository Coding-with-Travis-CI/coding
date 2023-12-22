package com.jalasoft.coding.naira;

/**
 *Reverse the words that has five or more characters from string.
 */
public final class ReverseWord {
    private ReverseWord() { }

    /**
     * Method to return a reverse string when has more than 5 characters.
     * @param string
     * @return string
     **/
    public static String reverse(final String string) {
        String revString = "";
        final int maxLength = 5;

        if (!string.isEmpty()) {
            String[] words = string.split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String revWord = "";
                if (word.length() >= maxLength) {
                    for (int j = word.length() - 1; j >= 0; j--) {
                        revWord = revWord + word.charAt(j);
                    }

                    revString = revString + revWord + " ";
                } else {
                    revString = revString + word + " ";
                }
            }

            revString = revString.replaceFirst(".$", "");
            System.out.println(revString);
        }

        return revString;
    }
}
