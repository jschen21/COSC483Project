package com.cosc483.project;
import java.util.Random;

public class ArrayCreator {
    public static int[] newArray(int size){
        Random rand = new Random();
        int[] temp = new int[size];
        for(int i = 0; i < size; i++){
            temp[i] = rand.nextInt(size + 1);
        }
        return temp;
    }
}
