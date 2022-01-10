package com.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       int [] arr={3,5,2,1,4};
       CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int [] arr)
    {
        int i=0;
        while (i < arr.length)
        {
            int correct=arr[i]-1; //correct index
            if(arr[i] != arr[correct]) //element at i is not at correct index than swap
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
