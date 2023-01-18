package com.demirturk;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = i; j > 0; j--) {
                    if (nums[j - 1] == 0) {
                        result++;
                        int temp = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = temp;
                    }
                }
            }
        }
        System.out.println(result);

        System.out.println(Arrays.toString(nums));
    }
}
