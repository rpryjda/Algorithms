package com.pryjda.exercises;

public class ExercisesPart3 {

    public Integer[] findMinimumValueAndIndex(Integer[] input) {

        Integer placeInArray = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < input[placeInArray]) {
                placeInArray = i;
            }
        }
        return new Integer[]{input[placeInArray], placeInArray};
    }

    public Integer[] findMinimumValueFromAtoBandIndex(Integer a, Integer b, Integer[] input){

        Integer placeInArray = a;
        for (int i = a; i <= b; i++) {
            if (input[i] < input[placeInArray]) {
                placeInArray = i;
            }
        }
        return new Integer[]{input[placeInArray], placeInArray};
    }
}
