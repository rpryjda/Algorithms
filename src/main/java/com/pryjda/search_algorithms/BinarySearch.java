package com.pryjda.search_algorithms;

public class BinarySearch implements SearchAlgorithm {

    @Override
    public Integer search(Integer value, Integer[] input) {
        Integer low = 0;
        Integer high = input.length - 1;
        while (low <= high) {
            Integer mid = (low + high) / 2;
            if (value < input[mid]) {
                high = mid - 1;
            } else if (value > input[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
