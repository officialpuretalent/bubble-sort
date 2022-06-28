package com.devhouseagency.bubble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BubbleSortTest {
    @Test
    void canSortArrayWithTwoElements() {
        assertEquals(4, BubbleSort.sort(new int[] {5, 4})[0]);
        assertEquals(5, BubbleSort.sort(new int[] {5, 4})[1]);
    }

    @Test
    void canReturnOneElement() {
        assertNotEquals(21, BubbleSort.sort(new int[] {10})[0]);
        assertEquals(10, BubbleSort.sort(new int[] {10})[0]);
    }
}
