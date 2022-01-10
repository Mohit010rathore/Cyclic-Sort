package com.CyclicSort;

import java.util.ArrayList;
import java.util.List;

class FindAllMissing {
        public List<Integer> findDisappearedNumbers(int[] nums) { //we are using list bcause ans can conatain any number of integer
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1; //correct index
                if (nums[i] != nums[correct]) //element at i is not at correct index than swap
                {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            //just find the missing numbers
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(index + 1);
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