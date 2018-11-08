package com.pryjda.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ExercisesTest {

    static Exercises exe;

    @BeforeAll
    static void setup() {
        exe = new Exercises();
    }

    @Test
    void shouldFindMiddleItemInArray() {
        //given (arrange)
        Integer[] arrayOne = {1, 4, 6, 7, 7, 9};
        Integer[] arrayTwo = {2, 5, 7, 9, 0, 1, 3};

        Integer expected1 = 6;
        Integer expected2 = 9;

        //when (act)
        Integer result1 = exe.findMiddleItemInArray(arrayOne);
        Integer result2 = exe.findMiddleItemInArray(arrayTwo);

        //then (assert)
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }

    @Test
    void shouldFindPartOfArrayToParticularIndex() {
        //given (arrange)
        Integer[] array = {1, 4, 6, 7, 7, 9};
        Integer[] expectedArray = {1, 4, 6};

        //when (act)
        Integer[] resultArray = exe.findPartOfArrayToParticularIndex(2, array);

        //then (assert)
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void shouldFindPartOfArrayFromParticularIndex() {
        //given (arrange)
        Integer[] array = {1, 4, 6, 7, 7, 9};
        Integer[] expectedArray = {7, 7, 9};

        //when (act)
        Integer[] resultArray = exe.findPartOfArrayFromParticularIndex(3,array);

        //then (assert)
        assertArrayEquals(expectedArray, resultArray);
    }
}