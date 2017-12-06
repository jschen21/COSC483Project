package com.cosc483.project;

public class Main {

    public static void main(String[] args) {
        int[] testArray = ArrayCreator.newArray(100000);
        System.out.println(RandQuickSort.RandQuickSort(testArray));
        System.out.println(DetSelection.DetSelection(testArray));
    }
}
