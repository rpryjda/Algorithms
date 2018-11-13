package com.pryjda.sorting_algorithms;

import com.pryjda.exercises.ExercisesPart2;

public class BubbleSort implements SortingAlgorithm {

    ExercisesPart2 instance;


    @Override
    public Integer[] sort(Integer[] input) {

        instance = new ExercisesPart2();
        for (int j = 0; j < input.length; j++) {

            for (int i = 0; i < input.length - 1; i++) {
                if (input[i + 1] < input[i]) {
                    instance.swap(i, i + 1, input);
                }
            }
        }
        return input;
    }

}
