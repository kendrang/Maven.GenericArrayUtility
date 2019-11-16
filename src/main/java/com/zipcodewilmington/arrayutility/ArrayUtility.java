package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private T[] input;

    public ArrayUtility (T[] arr){
        this.input = arr;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate){
       return Math.toIntExact(Arrays.stream(input)
               .filter(element -> element.equals(valueToEvaluate))
               .count());

    }

    public T[] removeValue (T valueToRemove){
       return Arrays.stream(input)
                .filter(element -> element != valueToRemove)
                .toArray(result ->Arrays.copyOf(input,result));

    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {


        return null;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
       input = Stream.concat(Arrays.stream(input), Arrays.stream(arrayToMerge))
                .toArray(size -> Arrays.copyOf(input, size));

       return getNumberOfOccurrences(valueToEvaluate);
    }
}
