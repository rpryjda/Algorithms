package com.pryjda.sorting_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    SortingAlgorithm sortingInstance;

    @BeforeEach
    void setUp() {
        sortingInstance = new BubbleSort();
    }

    @Test
    void shouldSortInputArray() {
        //given (arrange)
        Integer[] array = {3, 55, 7, 99, 2, 5, -13, 44};
        Integer[] expectedArray = {-13, 2, 3, 5, 7, 44, 55, 99};

        //when (act)
        Integer[] resultArray = sortingInstance.sort(array);

        //then (assert)
        assertArrayEquals(expectedArray,resultArray);
    }
}