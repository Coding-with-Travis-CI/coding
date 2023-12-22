package com.jalasoft.coding.jonathan;

public final class MostFrequentItem {
    /**
     * Class' default constructor.
     */
    private MostFrequentItem() {
        // constructor
    }

    /**
     * @param collection
     * @return will return the amount of times the most frequent item is present in the array.
     */
    public static int mostFrequentItemCount(final int[] collection) {
        int max = 0;
        int counter = 0;
        for (int i : collection) {
            counter = 0;
            for (int j : collection) {
                if (j == i) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }
}
