package com.odebar.jUnitLearn;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {4, 12, -17, 3};
        int[] expected = {-17, 3, 4, 12};
        ArraysMain.bubbleSort(arr);
        assertArrayEquals(expected,arr);
    }
}
