package com.devhouseagency.bubble;

/*
* BubbleSort class encapsulate the algorithms to sort
* and swap.
* */
public class BubbleSort {
    /**
     * Sort method takes an unordered array and sort the
     * array by using a swap method.
     * @param array data to be sorted.
     * @return sorted array.
     * */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array.length - 1; y++) {
                if (array[y] > array[y + 1]) {
                    swap(array, y, y + 1);
                }
            }
        }

        return array;
    }

    /**
     * Swap method is responsible for swapping elements
     * @param array contains data that we want to swap
     * @param a the value that we want to move to the right.
     * @param b the value that we want to move to the left.
     * */
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
