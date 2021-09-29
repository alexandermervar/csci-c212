package com.alexandermervar;

import java.util.Arrays;

public class MyArrayList {

    private int size;
    private int[] data;

    public MyArrayList() {
        size = 0;
        data = new int[16];
    }

    public void add(int n) {
        if(size > 16) {
            size++;
            data = Arrays.copyOf(data, data.length+1);
            data[size-1] = n;
        }
        else {
            size++;
            data[size-1] = n;
        }
    }

    public void remove(int index) {
        //Check for empty box
        if (index > size - 1) {

        }
        else{
            int counter = 0;

            int[] newArray = new int[size-1];

            for(int i=0; i < data.length; i++) {
                if (i == index) {

                }
                else {
                    newArray[counter] = data[i];
                    counter++;
                }
            }

            data = Arrays.copyOf(newArray, size - 1);
            size--;
        }
    }

    public String toString() {
        String returnString = "[";

        for(int i=0; i<size; i++) {

            if(i ==  size-1) {
                returnString += data[i];
            }
            else {
                returnString += (data[i] + ", ");
            }
        }

        returnString += " ]";

        return returnString;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int n) {
        boolean status = false;

        for (int i = 0; i < size; i++) {
            if(data[i] == n) {
                status = true
            }
        }

        return status;
    }

    public int indexOf(int n) {
        int returnIndex = -1;

        for (int i = 0; i < size; i++) {
            if(data[i] == n) {
                returnIndex = i;
                return returnIndex;
            }
        }

        return returnIndex;
    }
}
