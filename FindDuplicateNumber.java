package com.CyclicSort;

public class FindDuplicateNumber {
    public int DuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if(arr[i] != i+1) //first check
            {
                int correct = arr[i]-1;
                if ( arr[i] != arr[correct]) { //second check
                    swap(arr, i, correct);

                } else {
                    return arr[i];
                }
            }else
            {
                i++;
            }
        }
        //if no duplicates retrun -1;
        return -1;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
