package com.biswajit.condigpatterns.twopointer;

import java.util.Arrays;

/*
Given an array of integers, nums, and an integer value, target, determine if there are any three integers in nums
whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] == target.
 Return TRUE if three such integers exist in the array. Otherwise, return FALSE.
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,1,-4,5,-3};
        System.out.println("Is three sum available : "+isThreeSumAvailable(arr,0));
    }

    public static boolean isThreeSumAvailable(int[] numbers,int target){
        if(numbers.length < 3)
            return false;
        Arrays.sort(numbers);
        int start,low,high,sum;


        for(start = 0;start < numbers.length; start ++){
            low = start + 1;
            high = numbers.length - 1;

            while(low<high) {
                sum = numbers[start] + numbers[low] + numbers[high];
                if (numbers.length == 3)
                    return sum == target;
                else if (sum == target)
                    return true;
                else if (sum < target)
                    low++;
                else
                    high++;
            }
        }
        return false;
    }
}
