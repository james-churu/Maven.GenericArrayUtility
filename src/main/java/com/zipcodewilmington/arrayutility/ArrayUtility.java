package com.zipcodewilmington.arrayutility;

import com.sun.codemodel.internal.JArray;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] array;

    public ArrayUtility(T[] inputArray) {
        this.array = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arr, T value) {


        int count = 0;
        for (int x = 0; x <= arr.length - 1; x++) {
            if (arr[x] == value) {
                count++;
            }
        }
        for (int x = 0; x <= array.length - 1; x++) {
            if (array[x] == value) {
                count++;
            }
        }

        return count;
    }

    public Integer getNumberOfOccurrences(T valToEval) {

        Integer count = 0;
        for (int x = 0; x <= array.length - 1; x++) {
            if (array[x] == valToEval) {
                count++;
            }
        }

        return count;
    }

    public T[] removeValue(T valToRemove) {

        int count = getNumberOfOccurrences(valToRemove);

        @SuppressWarnings("unchecked")
        T[] answer = (T[])Array.newInstance(valToRemove.getClass(), array.length - count);
        int index =0;

        for (T element : array) {
            if (element == valToRemove) {

            }else{
                answer[index] = element;
                index++;
            }
        }

        return answer;
    }

    public T getMostCommonFromMerge(T[] arrToMerge) {

        int highest1 = 0;
        T value1 = null;
        for(int K = 0; K <= array.length -1; K++){

            int innerCount = 0;
            for(int z = 0; z <= array.length -1; z++){

                if(array[K] == array[z]){
                    innerCount++;
                }
            }
            if(innerCount > highest1){
                highest1 = innerCount;
                value1 = array[K];
            }
        }


        int highest = 0;
        T value = null;

        for(int y = 0; y <= arrToMerge.length -1; y++){

            int innerCount = 0;
            for(int z = 0; z <= arrToMerge.length -1; z++){

                if(arrToMerge[y] == arrToMerge[z]){
                    innerCount++;
                }
            }
            if(innerCount > highest){
                highest = innerCount;
                value = arrToMerge[y];
            }
        }

        if(value1 == value){
            return value;
        }else if(highest1 > highest){
            return value1;
        }else{
            return value;
        }
    }
}
