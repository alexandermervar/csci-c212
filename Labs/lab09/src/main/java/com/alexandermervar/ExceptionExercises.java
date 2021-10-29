package com.alexandermervar;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionExercises {
    public static void main(String[] args) {

        System.out.println("Calling problem 1:");
        System.out.println("Final product: " + Arrays.toString(problem1()));

        System.out.println();

        System.out.println("Calling problem 2:");
        System.out.println("Final product: " + problem2().toString());


    }

    static int[] problem1(){
        int[] intArray = {1,2,3,4,5};
        for(int i=0;i <= intArray.length;i++){          //looping through elements in i
            intArray[i] = intArray[i - 1] + intArray[i];    //intArray[i] becomes the sum of itself and the element before it
        }
        return intArray;
    }


    static ArrayList<Integer> problem2(){
        ArrayList<Integer> myArrayList = null;

        for(int i=0; i < 10; i++){
            myArrayList.add(i);
            myArrayList.set(i,i/myArrayList.get(i-1));
        }

        return myArrayList;
    }
}
