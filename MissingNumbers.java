package com.CyclicSort;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int [] arr={4,0,2,3,1};
        int ans=missingNumbers(arr);
        System.out.println(ans);

    }
    public static int missingNumbers(int [] arr)
    {
        int i=0;
        while (i < arr.length) {
            //in question we have given 0 to N so the numbers will be at their own index i.e, i
            //element == index
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) //element at i should be equal to its own index
            {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            //search for first missing element
            for(int index=0; index < arr.length ; index ++)
            {
                if(arr[index]  != index)
                {
                    return index;
                }
            }
            //case 2
            return arr.length ;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
