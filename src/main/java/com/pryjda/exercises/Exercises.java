package com.pryjda.exercises;

public class Exercises {

    public Integer findMiddleItemInArray(Integer[] values) {
        Integer middleItem = values[(values.length - 1) / 2];
        return middleItem;
    }

    public Integer[] findPartOfArrayToParticularIndex(Integer index, Integer[] values) {
        Integer[] partOfArray = new Integer[index + 1];
        for (int i = 0; i < partOfArray.length; i++) {
            partOfArray[i] = values[i];
        }
        return partOfArray;
    }

    public Integer[] findPartOfArrayFromParticularIndex(Integer index, Integer[] values) {
        Integer[] partOfArray = new Integer[values.length - index];
        for (int i = 0; i <= partOfArray.length - 1; i++) {
            partOfArray[i] = values[index + i];
        }
        return partOfArray;
    }

}
