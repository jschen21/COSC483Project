package com.cosc483.project;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long start;
        long end;
        long timeElapsed;
        int median;
        int sum = 0;

        int[] testArray1 = ArrayCreator.newArray(10000);
        int[] testArray2 = ArrayCreator.newArray(1000000);
        int[] testArray3 = ArrayCreator.newArray(10000000);

        ArrayList<Integer> results1 = new ArrayList<>();
        ArrayList<Integer> results2 = new ArrayList<>();
        ArrayList<Integer> results3 = new ArrayList<>();
        ArrayList<Integer> results4 = new ArrayList<>();
        ArrayList<Integer> results5 = new ArrayList<>();
        ArrayList<Integer> results6 = new ArrayList<>();
        ArrayList<Integer> results7 = new ArrayList<>();
        ArrayList<Integer> results8 = new ArrayList<>();
        ArrayList<Integer> results9 = new ArrayList<>();

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        //Deterministic Selection Algorithm
        System.out.println("Deterministic Selection Algorithm tests.");
        for(int i = 0; i < 30; i++){
            start = System.currentTimeMillis();
            median = DetSelection.DetSelection(testArray1);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results1.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "A");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray1.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();

            start = System.currentTimeMillis();
            median = DetSelection.DetSelection(testArray2);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results2.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "B");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray2.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();

            start = System.currentTimeMillis();
            median = DetSelection.DetSelection(testArray3);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results3.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "C");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray3.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();
        }

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        //Randomized Selection Algorithm
        System.out.println("Randomized Selection Algorithm tests.");
        for(int i = 0; i < 30; i++){
            start = System.currentTimeMillis();
            median = RandSelection.RandSelection(testArray1);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results4.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "A");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray1.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();

            start = System.currentTimeMillis();
            median = RandSelection.RandSelection(testArray2);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results5.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "B");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray2.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();

            start = System.currentTimeMillis();
            median = RandSelection.RandSelection(testArray3);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results6.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "C");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray3.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();
        }

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        //Randomized QuickSort Algorithm
        System.out.println("Randomized QuickSort Algorithm tests.");
        for(int i = 0; i < 30; i++){
            start = System.currentTimeMillis();
            median = RandQuickSort.RandQuickSort(testArray1);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results7.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "A");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray1.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();

            start = System.currentTimeMillis();
            median = RandQuickSort.RandQuickSort(testArray2);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results8.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "B");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray2.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();

            start = System.currentTimeMillis();
            median = RandQuickSort.RandQuickSort(testArray3);
            end = System.currentTimeMillis();
            timeElapsed = end - start;
            results9.add((int)timeElapsed);
            System.out.println("---------------------------------------------");
            System.out.println("Test" + (i + 1) + "C");
            System.out.println("Median value: " + median);
            System.out.println("Array size: " + testArray3.length);
            System.out.println("Time elapsed: " + timeElapsed + " ms");

            System.out.println();
        }

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        //getting average times for each test

        int i = 0;
        while(i < results1.size()){
            sum += results1.get(i);
            i++;
        }
        int avg1 = sum / results1.size();

        sum = 0;
        i = 0;
        while(i < results2.size()){
            sum += results2.get(i);
            i++;
        }
        int avg2 = sum / results2.size();

        sum = 0;
        i = 0;
        while(i < results3.size()){
            sum += results3.get(i);
            i++;
        }
        int avg3 = sum / results3.size();

        sum = 0;
        i = 0;
        while(i < results4.size()){
            sum += results4.get(i);
            i++;
        }
        int avg4 = sum / results4.size();

        sum = 0;
        i = 0;
        while(i < results5.size()){
            sum += results5.get(i);
            i++;
        }
        int avg5 = sum / results5.size();

        sum = 0;
        i = 0;
        while(i < results6.size()){
            sum += results6.get(i);
            i++;
        }
        int avg6 = sum / results6.size();

        sum = 0;
        i = 0;
        while(i < results7.size()){
            sum += results7.get(i);
            i++;
        }
        int avg7 = sum / results7.size();

        sum = 0;
        i = 0;
        while(i < results8.size()){
            sum += results8.get(i);
            i++;
        }
        int avg8 = sum / results8.size();

        sum = 0;
        i = 0;
        while(i < results9.size()){
            sum += results9.get(i);
            i++;
        }
        int avg9 = sum / results9.size();

        //Print results and averages
        System.out.println("Results of Deterministic Selection test 1: ");
        i = 0;
        while(i < results1.size()){
            System.out.print(results1.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Deterministic Selection test 2: ");
        i = 0;
        while(i < results2.size()){
            System.out.print(results2.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Deterministic Selection test 3: ");
        i = 0;
        while(i < results3.size()){
            System.out.print(results3.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Randomized Selection test 1: ");
        i = 0;
        while(i < results4.size()){
            System.out.print(results4.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Randomized Selection test 2: ");
        i = 0;
        while(i < results5.size()){
            System.out.print(results5.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Randomized Selection test 3: ");
        i = 0;
        while(i < results6.size()){
            System.out.print(results6.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Randomized QuickSort test 1: ");
        i = 0;
        while(i < results7.size()){
            System.out.print(results7.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Randomized QuickSort test 2: ");
        i = 0;
        while(i < results8.size()){
            System.out.print(results8.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Results of Randomized QuickSort test 3: ");
        i = 0;
        while(i < results9.size()){
            System.out.print(results9.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Average of Deterministic Selection test 1: " + avg1 + "ms");
        System.out.println("Average of Deterministic Selection test 2: " + avg2 + "ms");
        System.out.println("Average of Deterministic Selection test 3: " + avg3 + "ms");
        System.out.println("Average of Randomized Selection test 1: " + avg4 + "ms");
        System.out.println("Average of Randomized Selection test 2: " + avg5 + "ms");
        System.out.println("Average of Randomized Selection test 3: " + avg6 + "ms");
        System.out.println("Average of Randomized QuickSort test 1: " + avg7 + "ms");
        System.out.println("Average of Randomized QuickSort test 2: " + avg8 + "ms");
        System.out.println("Average of Randomized QuickSort test 3: " + avg9 + "ms");
    }
}
