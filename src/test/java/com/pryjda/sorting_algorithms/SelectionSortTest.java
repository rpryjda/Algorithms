package com.pryjda.sorting_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    SortingAlgorithm sortingInstance;

    @BeforeEach
    void setUp() {
        sortingInstance = new SelectionSort();
    }

    @Test
    void shouldSortInputArray() {
        //given (arrange)
        Integer[] array = {43, 56, 11, 77, 99, 2, -44, 11};
        Integer[] expected = {-44, 2, 11, 11, 43, 56, 77, 99};

        //when (act)
        sortingInstance.sort(array);

        //then (assert)
        assertArrayEquals(expected,array);
    }
}