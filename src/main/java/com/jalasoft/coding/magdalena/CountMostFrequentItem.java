package com.jalasoft.coding.magdalena;

/**
 * @author Magdalena
 * @version 1.1
 */
public final class CountMostFrequentItem {

    /**
     * Default constructor of the class.
     */
    private CountMostFrequentItem() {
        // default constructor
    }

    /**
     * Count the most frequent number of an Array.
     *
     * @param input input Int[]
     * @return string with some reversed words
     */
    public static int countTheFrequent(final int[] input) {

        int response = 0;
        for (int i = 0; i <= (input.length - 1); i++) {
            int counter = 0;
            int numToCount = input[i];
            if (input.length > 1) {
                for (int j = 1; j < input.length; j++) {
                    if (numToCount == input[j]) {
                        counter = counter + 1;
                    }
                }
                if (counter > response) {
                    response = counter;
                }
            } else {
                response = 1;
            }
        }
        return response;
    }
}
