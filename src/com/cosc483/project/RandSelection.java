package com.cosc483.project;
import java.util.Random;


public class RandSelection {
    public static int RandSelection(int[] array){
        return RandSelect(array, 0, array.length - 1, array.length/2);
    }

    public static int RandSelect(int[] array, int left, int right, int k){
        if(left == right)
            return array[left];

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);

        pivotIndex = partition(array, left, right, pivotIndex);
        if(k == pivotIndex)
            return array[k];
        else if(k < pivotIndex)
            return RandSelect(array, left, pivotIndex - 1, k);
        else
            return RandSelect(array, pivotIndex + 1, right, k);
    }

    public static int partition(int[] array, int left, int right, int pivotIndex){
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, right);
        int storeIndex = left;
        for(int i = left; i < right; i++){
            if(array[i] < pivotValue){
                swap(array, storeIndex, i);
                storeIndex++;
            }
        }
        swap(array, right, storeIndex);
        return storeIndex;
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
