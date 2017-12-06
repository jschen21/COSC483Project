package com.cosc483.project;
import java.util.Random;

public class RandQuickSort
{
    public static int RandQuickSort(int[] array){
        QuickSort(array, 0, array.length-1);
        return array[array.length/2];
    }

    public static void QuickSort(int[] array, int left, int right)
    {
        if (right - left <= 0)
            return;
        else
        {
            Random rand = new Random();
            int pivotIndex = left + rand.nextInt(right - left + 1);
            swap(array, pivotIndex, right);

            int pivot = array[right];
            int partition = partitionIt(array, left, right, pivot);
            QuickSort(array, left, partition - 1);
            QuickSort(array, partition + 1, right);
        }
    }

    public static int partitionIt(int[] array, int left, int right, long pivot)
    {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true)
        {
            while (array[++leftPtr] < pivot)
                ;
            while (rightPtr > 0 && array[--rightPtr] > pivot)
                ;

            if (leftPtr >= rightPtr)
                break;
            else
                swap(array, leftPtr, rightPtr);
        }
        swap(array, leftPtr, right);
        return leftPtr;
    }

    public static void swap(int[] array, int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}