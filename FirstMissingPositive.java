package com.CyclicSort;

public class FirstMissingPositive {
    public static int firstmissingPositive(int [] arr)
    {
        int i=0;
        while (i < arr.length) {
            //in question we have given 0 to N so the numbers will be at their own index i.e, i
            //element == index
            int correct = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) //element at i should be equal to its own index
            {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing element
        for(int index=0; index < arr.length ; index ++)
        {
            if(arr[index]  != index + 1)
            {
                return index;
            }
        }
        //case 2
        return arr.length + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
