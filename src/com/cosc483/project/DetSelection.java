package com.cosc483.project;


public class DetSelection {
    public static int DetSelect(int[] array, int k){
        if(array.length < 10){
            //sort array
            return array[k];
        }

        int p = 0;
        int[] medians = new int[n/5];
        int[] temp = new int[5];

        for(int i = 0; i <  array.length; i = i + 5){
            for(int j = i; j < 5; j++){
                int q = 0;
                temp[q] = array[j];
                q ++;
            }
            medians[p] = DetSelect(temp, 3);
            p++;
        }

        int m = DetSelect(medians, n/10);

        //partition L into L1<M, L2=M, L3>M
        //if (k <= length(L1))
            //return select(L1,k)
        //else if (k > length(L1)+length(L2))
            //return select(L3,k-length(L1)-length(L2))
        //else return M
    }
}
