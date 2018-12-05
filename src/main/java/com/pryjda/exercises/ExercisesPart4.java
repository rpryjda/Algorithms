package com.pryjda.exercises;

public class ExercisesPart4 {

    public Object[] divideArrayIntoTwoPieces(Integer[] input) {

        Integer middleIndex = (input.length - 1) / 2;

        Integer[] outputFirst = new Integer[middleIndex + 1];
        Integer[] outputSecond = new Integer[input.length - outputFirst.length];

        for (int i = 0; i < input.length; i++) {
            if (i <= middleIndex) {
                outputFirst[i] = input[i];
            } else {
                outputSecond[i - middleIndex - 1] = input[i];
            }
        }
        return new Object[]{outputFirst, outputSecond};
    }

    /**
     * Metoda łącząca dwie tablice takiego samego rozmiaru
     * (a1, a2) => a1[0], a2[0], a1[1], a2[1], itd.
     */
    public Integer[] combineTwoArraysWithTheSameLength(Integer[] inputFirst, Integer[] inputSecond) {

        Integer[] combinedArray = new Integer[inputFirst.length + inputSecond.length];
        for (int i = 0; i < combinedArray.length; i++) {
            if (i % 2 == 0) {
                combinedArray[i] = inputFirst[i / 2];
            } else {
                combinedArray[i] = inputSecond[i / 2];
            }
        }
        return combinedArray;
    }

    /**
     * Metoda łącząca dwie tablice różnych rozmiarów
     * (a1, a2) => a1[0], a2[0], a1[1], a2[1], a1[2], a1[3], itd.
     */
    public Integer[] combineTwoArraysWithDifferentLength(Integer[] inputFirst, Integer[] inputSecond) {
        Integer[] combinedArray = new Integer[inputFirst.length + inputSecond.length];
        for (int i = 0; i < combinedArray.length; i++) {
            int commonLength = Math.min(inputFirst.length, inputSecond.length) * 2;
            if (i < commonLength) {
                if (i % 2 == 0) {
                    combinedArray[i] = inputFirst[i / 2];
                } else {
                    combinedArray[i] = inputSecond[i / 2];
                }
            } else {
                if (inputFirst.length > inputSecond.length) {
                    combinedArray[i] = inputFirst[i - commonLength / 2];
                } else {
                    combinedArray[i] = inputSecond[i - commonLength / 2];
                }
            }
        }
        return combinedArray;
    }
}
