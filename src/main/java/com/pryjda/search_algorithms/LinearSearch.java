package com.pryjda.search_algorithms;

public class LinearSearch implements SearchAlgorithm {

    @Override
    public Integer search(Integer value, Integer[] input) {
        Integer result = -1;
        for(int i = 0; i<input.length; i++){
            if(value == input[i]){
                result = i;
            }
        }
        return result;
    }

}
