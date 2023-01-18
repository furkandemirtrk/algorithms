package com.demirturk;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {1,7,2,15,4};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<high) {
            if((nums[low]+nums[high]) == target) {
                return new int[] {low+1,high+1};
            }
            else if((nums[low]+nums[high]) < target) {
                low++;
            }
            else {
                high--;
            }
        }
        return new int[] {0,0};
    }
}
