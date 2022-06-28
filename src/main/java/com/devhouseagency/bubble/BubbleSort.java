package com.devhouseagency.bubble;

public class BubbleSort {
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

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
