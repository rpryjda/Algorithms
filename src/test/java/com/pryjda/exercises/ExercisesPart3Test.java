package com.pryjda.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesPart3Test {

    ExercisesPart3 exe;

    @BeforeEach
    void setUp() {
        exe = new ExercisesPart3();
    }

    @Test
    void shouldFindMinimumValueAndIndex() {
        //given (arrange)
        Integer[] array = {43, 56, 11, 77, 99, 2, -44, 11};
        Integer[] expected = {-44, 6};

        //when (act)
        Integer[] result = exe.findMinimumValueAndIndex(array);

        //then(assert)
        assertArrayEquals(expected, result);
    }

    @ParameterizedTest(name = "{index} => expectedArray = {0}, parameterA = {1}, parameterB = {2}")
    @MethodSource("valueProvider")
    void shouldFindMinimumValueFromAtoBAndIndex(Integer[] expectedArray, Integer a, Integer b) {
        //given (arrange)
        Integer[] array = {43, 56, 11, 77, 99, 2, -44, 11};
        Integer[] expected = expectedArray;

        //when (act)
        Integer[] result = exe.findMinimumValueFromAtoBandIndex(a, b, array);

        //then (assert)
        assertArrayEquals(expectedArray, result);
    }

    private static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{-44, 6}, 0, 7),
                Arguments.of(new Integer[]{77, 3}, 3, 4),
                Arguments.of(new Integer[]{2, 5}, 0, 5),
                Arguments.of(new Integer[]{-44, 6}, 3, 7)
        );
    }

}