package com.jalasoft.coding.milena;

/**
 * This class permits to spin the word that have more than 5 characters.
 */
public class SpinWords {
    /**
     * This is the limit of words that should be spin.
     */
    private static final int SPIN_WORD_LIMIT = 5;

    /**
     * This is the default constructor.
     * @param copyPhrase this is the phrase to be Spin.
     */
    SpinWords(final String copyPhrase) {


    }

    /**
     * Spin the characters for a phrase.
     * @param phrase this is the phrase to be Spin
     * @return the spin phrase
     */
    public String spinWords(final String phrase) {

        String words = "";
        /* Here  splits a string in several strings based on the
         * delimiter by space
         */
        String[] phaseSplited = phrase.split(" ");
        // If the Phrase is empty

        if (phrase.isEmpty()) {
            return words;
        }
        // Here we spin the word only if the characters are more than 5
        for (int i = 0; i < phaseSplited.length; i++) {
            if (!(phaseSplited[i].length() <= SPIN_WORD_LIMIT)) {
                phaseSplited[i] = new StringBuilder(phaseSplited[i]).reverse().toString();
            }
        }
        words = String.join(" ", phaseSplited);
        return words;
    }
}
