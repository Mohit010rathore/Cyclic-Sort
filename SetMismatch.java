package com.CyclicSort;

public class SetMismatch {
    public static int[] missingNumbers(int [] arr)
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
            if( arr[index]  != index + 1 )
            {
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
