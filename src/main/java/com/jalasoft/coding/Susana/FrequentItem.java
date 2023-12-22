package com.jalasoft.coding.Susana;

import java.util.Arrays;

public final class FrequentItem {

    /**
     * Constructor.
     */
    private FrequentItem() {
    }

    /**
     * Gets most frequent item into an array.
     *
     * @param inputArray array of values.
     * @return frequency value.
     */
    public static int mosFrequentItem(final int[] inputArray) {
        int count = 1;
        int indice = 0;
        int value = 0;
        int[] frequentItem = new int[inputArray.length];
        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                count++;
            } else {
                i = i++;
                frequentItem[indice] = count;
                indice = indice + 1;

                if (i == inputArray.length - 2) {
                    if (count == 1) {
                        frequentItem[indice] = 1;
                        break;
                    }
                    if (count > 1) {
                        break;
                    }
                }
                count = 1;
            }
        }

        Arrays.sort(frequentItem);
        value = frequentItem[frequentItem.length - 1];

        return value;
    }
}

