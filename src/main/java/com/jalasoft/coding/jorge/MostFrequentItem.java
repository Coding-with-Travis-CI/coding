package com.jalasoft.coding.jorge;

public final class MostFrequentItem {
    private MostFrequentItem() {
        //Def. Construct.
    }

    /**
     * max variable represents the frequency.
     */
    private static int max = 0;
    /**
     * count variable will be for store counted times of element.
     */
    private static int count = 0;
    /**
     * item will be for storage finally the most frequent element.
     */
    private static int item = 0;

    /**
     * @param array defined
     * @return most frequent item
     */
    public static int search(final int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
                if (max < count) {
                    max = count;
                    item = array[i];
                }
            }
            count = 0;
        }
        return item;
    }

    /**
     * @param array defined.
     * @return time of frequent item appeared.
     */
    public static int counter(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) {
                count++;
            }
        }
        return count;
    }
}
