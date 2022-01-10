package com.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {
    public List<Integer> findDuplicate(int[] arr){
        int i=0;
        while (i < arr.length) {
            //in question we have given 0 to N so the numbers will be at their own index i.e, i
            //element == index
            int correct = arr[i]-1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) //element at i should be equal to its own index
            {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index] );
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
