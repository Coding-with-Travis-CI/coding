package com.jalasoft.coding.vivian;

public final class MostFrequentItem {
    private MostFrequentItem() {
        // Default constructor.
    }

    /**
     * Find the count of the most frequent item of an array.
     *
     * @param item int array
     * @return int Return the count of the most frequent item
     */
    public static int frequentItem(final int[] item) {
        if (item.length == 0) {
            return 0;
        } else {
            int popular = 0;
            for (int i = 0; i < item.length; i++) {
                int popularQuantity = 0;
                int candidate = item[i];
                for (int j = 0; j < item.length; j++) {
                    if (candidate == item[j]) {
                        popularQuantity++;
                    }
                }
                if (popularQuantity > popular) {
                    popular = popularQuantity;
                }
            }
            return popular;
        }
    }
}
