package com.pryjda.search_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    SearchAlgorithm searchAlgorithm;

    @BeforeEach
    void setUp() {
        searchAlgorithm = new LinearSearch();
    }

    @Test
    void shouldSearchIndex() {
        //given (arrange)
        Integer[] array = {1, 4, 6, 7, 7, 9, 11};
        Integer expected = 5;
        Integer expected2 = -1;

        //when (act)
        Integer result = searchAlgorithm.search(9, array);
        Integer result2 = searchAlgorithm.search(77, array);

        //then (assert)
        assertAll(
                () -> assertEquals(expected, result),
                () -> assertEquals(expected2, result2)
        );
    }
}