package com.pryjda.exercises;

import java.util.Arrays;

public class ExercisesPart2 {

    public void swap(Integer indexA, Integer indexB, Integer[] input) {
        Integer keptValue = input[indexA];
        input[indexA] = input[indexB];
        input[indexB] = keptValue;
    }

    /**
     * Metoda wypisująca wartości w tablicy razem z numerem indeksu.
     * Przykład:
     * [0:123, 1:22, 2:98]
     */
    public void displayArrayValuesWithIndex(Integer[] input) {
        String[] output = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = i + ":" + input[i];
        }
        System.out.println(Arrays.toString(output));
    }

    /**
     * Metoda wypisująca wartości w tablicy razem z numerem indeksu.
     * Wypisuje tyle wierszy ile tablica posiada elementów.
     * Przykład:
     * [0:123, 1:22, 2:98]
     * [0:123, 1:22, 2:98]
     * [0:123, 1:22, 2:98]
     */
    public void displayArrayValuesWithIndexManyTimes(Integer[] input) {
        String[] output = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = i + ":" + input[i];
        }
        for (int j = 0; j < input.length; j++) {
            System.out.println(Arrays.toString(output));
        }
    }

    /**
     * Metoda roszerzająca metodę:
     * displayArrayValuesWithIndexManyTimes(Integer[] input).
     * Element znajdujący się pod indeksem nr 0 przesuwa się
     * z każdym wyświetleniem o jedno miejsce w prawo.
     * Przykład:
     * [0:123, 1:22, 2:98]
     * [0:22, 1:123, 2:98]
     * [0:22, 1:98, 2:123]
     */
    public void displayManyTimesArrayWithSwappedElements(Integer[] input) {
        String[] output = new String[input.length];
        for (int j = 0; j < input.length; j++) {
            if (j > 0) {
                this.swap(j - 1, j, input);
            }
            for (int i = 0; i < input.length; i++) {
                output[i] = i + ":" + input[i];
            }
            System.out.println(Arrays.toString(output));
        }
    }
}
