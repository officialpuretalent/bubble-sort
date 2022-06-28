package com.devhouseagency.bubble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BubbleSortTest {
    @Test
    void canSortArrayWithTwoElements() {
        // Given that I pass an unordered array in sort method
        // when I get the first element in the list I must
        // get 4
        assertEquals(4, BubbleSort.sort(new int[] {5, 4})[0]);
        assertEquals(5, BubbleSort.sort(new int[] {5, 4})[1]);
    }

    @Test
    void canReturnOneElement() {
        // Given that I pass an array with one element I should
        // get the element as the returned value.
        assertNotEquals(21, BubbleSort.sort(new int[] {10})[0]);
        assertEquals(10, BubbleSort.sort(new int[] {10})[0]);
    }
}
