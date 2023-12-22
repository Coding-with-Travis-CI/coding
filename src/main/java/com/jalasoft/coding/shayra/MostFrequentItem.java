package com.jalasoft.coding.shayra;


import java.util.Arrays;

public final class MostFrequentItem {
    private MostFrequentItem() {
        //Default constructor
    }

    /**
     * Finds the count of the most frequent item of an integer array.
     * @param inputArray integer inputArray.
     * @return count(number) of the most frequent item.
     */
    public static int mostFrequentItem(final int[] inputArray) {
        if (inputArray.length == 0) {
            return 0;
        } else {
            Arrays.sort(inputArray);
            int count = 1;
            int countTemp = 1;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] == inputArray[i + 1]) {
                    countTemp++;
                    if (countTemp > count) {
                        count = countTemp;
                    }
                } else {
                    countTemp = 1;
                }
            }
            return count;
        }
    }
}
