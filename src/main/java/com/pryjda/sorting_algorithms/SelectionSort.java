package com.pryjda.sorting_algorithms;

import com.pryjda.exercises.ExercisesPart2;

public class SelectionSort implements SortingAlgorithm {

    private ExercisesPart2 exe = new ExercisesPart2();

    @Override
    public Integer[] sort(Integer[] input) {
        for (int j = 0; j < input.length; j++) {
            Integer indexForMinValue = j;
            for (int i = j; i < input.length; i++) {
                if (input[indexForMinValue] > input[i]) {
                    indexForMinValue = i;
                }
            }
            exe.swap(j,indexForMinValue,input);
        }
        return new Integer[0];
    }
}
