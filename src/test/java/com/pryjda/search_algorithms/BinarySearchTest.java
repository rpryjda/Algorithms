package com.pryjda.search_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    SearchAlgorithm searchAlgorithm;

    @BeforeEach
    void setUp() {
        searchAlgorithm = new BinarySearch();
    }

    @ParameterizedTest(name = "{index} => expected = {0}, value = {1}")
    @MethodSource("numbersProvider")
    void search(Integer expected, Integer value) {
        //given (arrange)
        Integer[] array = {1, 4, 6, 7, 8, 9, 33, 55, 78};

        //when (act)
        Integer result = searchAlgorithm.search(value, array);

        //then (assert)
        assertEquals(expected, result);
    }

    private static Stream<Arguments> numbersProvider() {
        return Stream.of(
                Arguments.of(7, 55),
                Arguments.of(1, 4),
                Arguments.of(-1, 111)
        );
    }
}