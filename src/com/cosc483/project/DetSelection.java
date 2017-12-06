package com.cosc483.project;

import java.util.ArrayList;
import java.util.Arrays;

public class DetSelection {
    public static int DetSelection(int[] array){
        return DetSelect(array, array.length/2, array.length);
    }

    public static int DetSelect(int[] array, int k, int size){
        if(size <= 20){
            Arrays.sort(array);
            return array[size/2];
        }

        int p = findMedian(array);

        ArrayList<Integer> lowList = new ArrayList<>();
        ArrayList<Integer> highList = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            if(array[i] >= p)
                highList.add(array[i]);
            else lowList.add(array[i]);
        }

        int[] lowArray = new int[lowList.size()];
        for (int i = 0; i < lowArray.length; i++) {
            lowArray[i] = lowList.get(i);
        }
        int[] highArray = new int[highList.size()];
        for (int i = 0; i < highArray.length; i++) {
            highArray[i] = highList.get(i);
        }

        if(k <= lowArray.length)
            return DetSelect(lowArray, k, lowArray.length);
        else return DetSelect(highArray, k - lowArray.length, highArray.length);
    }

    public static int findMedian(int[] array){
        ArrayList<Integer> medList = new ArrayList<>();

        for(int i = 0; i < array.length; i = i + 5){
            getMedians(array, medList, i, i + 4);
        }

        int[] medArray = new int[medList.size()];
        for (int i = 0; i < medArray.length; i++) {
            medArray[i] = medList.get(i);
        }

        Arrays.sort(medArray);

        return medArray[medArray.length/2];
    }

    public static void getMedians(int[] array, ArrayList<Integer> medians, int start, int end){
        int j = 0;
        int[] temp = new int[5];
        for(int i = start; i < end; i++){
            if(i == array.length){
                j = i - start;
                break;
            }
            temp[j] = array[i];
            j++;
        }
        Arrays.sort(temp);
        if(end < array.length)
            medians.add(temp[2]);
        else medians.add(temp[j/2]);
    }
}