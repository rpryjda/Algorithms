package com.pryjda.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesPart2Test {

    ExercisesPart2 exe;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        exe = new ExercisesPart2();
    }

    @Test
    void shouldSwapValuesIntoArrays() {
        //given (arrange)
        Integer[] array = {3, 7, 2, 0, -11};
        Integer[] expectedArray = {3, 0, 2, 7, -11};
        //when (act)
        exe.swap(1, 3, array);

        //then (assert)
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void shouldDisplayArrayValuesWithIndex() {
        //given (arrange)
        Integer[] array = {123, 22, 98};
        System.setOut(new PrintStream(outContent));
        String expected = "[0:123, 1:22, 2:98]" + System.getProperty("line.separator");

        //when (act)
        exe.displayArrayValuesWithIndex(array);
        String result = outContent.toString();

        //then (assert)
        assertEquals(expected, result);
    }

    @Test
    void shouldDisplayArrayValuesWithIndexManyTimes() {
        //given (arrange)
        Integer[] array = {123, 22, 98};
        System.setOut(new PrintStream(outContent));
        String expected = "[0:123, 1:22, 2:98]" + System.getProperty("line.separator") +
                "[0:123, 1:22, 2:98]" + System.getProperty("line.separator") +
                "[0:123, 1:22, 2:98]" + System.getProperty("line.separator");

        //when (act)
        exe.displayArrayValuesWithIndexManyTimes(array);
        String result = outContent.toString();

        //then (assert)
        assertEquals(expected, result);
    }

    @Test
    void shouldDisplayManyTimesArrayWithSwappedElements() {
        //given (arrange)
        Integer[] array = {123, 22, 98};
        System.setOut(new PrintStream(outContent));
        String expected = "[0:123, 1:22, 2:98]" + System.getProperty("line.separator") +
                "[0:22, 1:123, 2:98]" + System.getProperty("line.separator") +
                "[0:22, 1:98, 2:123]" + System.getProperty("line.separator");

        //when (act)
        exe.displayManyTimesArrayWithSwappedElements(array);
        String result = outContent.toString();

        //then (assert)
        assertEquals(expected, result);
    }

    @Test
    void shouldDisplayManyTimesArrayWithIgnoredLastElement() {
        //given (arrange)
        Integer[] array = {123, 22, 98};
        System.setOut(new PrintStream(outContent));
        String expected = "[0:123, 1:22, 2:98]" + System.getProperty("line.separator") +
                "[0:123, 1:22]" + System.getProperty("line.separator") +
                "[0:123]" + System.getProperty("line.separator");

        //when (act)
        exe.displayManyTimesArrayWithIgnoredLastElement(array);
        String result = outContent.toString();

        //then (assert)
        assertEquals(expected, result);
    }
}