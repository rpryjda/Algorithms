package com.pryjda.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesPart4Test {

    ExercisesPart4 exe;

    @BeforeEach
    void setUp() {
        exe = new ExercisesPart4();
    }

    @Test
    void shouldDivideArrayIntoTwoPieces() {
        //given (arrange)
        Integer[] array = {43, 56, 11, 77, 99, 2, -44, 11};
        Integer[] expectedFirstArray = {43, 56, 11, 77};
        Integer[] expectedSecondArray = {99, 2, -44, 11};

        //when (act)
        Object[] twoArrays = exe.divideArrayIntoTwoPieces(array);
        Integer[] resultFirstArray = (Integer[]) twoArrays[0];
        Integer[] resultSecondArray = (Integer[]) twoArrays[1];

        //then (assert)

        assertArrayEquals(expectedFirstArray, resultFirstArray);
        assertArrayEquals(expectedSecondArray, resultSecondArray);
    }

    @Test
    void shouldCombineTwoArraysWithTheSameLength() {
        //given (arrange)
        Integer[] firstArray = {43, 56, 11, 77};
        Integer[] secondArray = {99, 2, -44, 11};
        Integer[] expected = {43, 99, 56, 2, 11, -44, 77, 11};

        //when (act)
        Integer[] result = exe.combineTwoArraysWithTheSameLength(firstArray, secondArray);

        //then (assert)
        assertArrayEquals(expected, result);
    }


    @ParameterizedTest(name = "{index} => firstArray={0}, secondArray={1}, expectedArray={2}")
    @MethodSource("valueProvider")
    void shouldCombineTwoArraysWithDifferentLength(Integer[] firstInput, Integer[] secondInput, Integer[] expectedOutput) {
        //given (arrange)

        //when (act)
        Integer[] result = exe.combineTwoArraysWithDifferentLength(firstInput, secondInput);

        //then (assert)
        assertArrayEquals(expectedOutput, result);
    }

    private static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{43, 56, 11, 77}, new Integer[]{99, 2, -44, 11}, new Integer[]{43, 99, 56, 2, 11, -44, 77, 11}),
                Arguments.of(new Integer[]{43, 56}, new Integer[]{99, 2, -44, 11}, new Integer[]{43, 99, 56, 2, -44, 11}),
                Arguments.of(new Integer[]{43, 56, 11}, new Integer[]{99}, new Integer[]{43, 99, 56, 11})
        );
    }
}