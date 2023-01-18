package com.demirturk;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums= {1,3,5,6};
        int target =0;
        System.out.println(solution(nums,target));
    }

    public static int solution(int[] nums, int target){
        int left =0, right = nums.length, mid, lastIndex = 0;
        while(left <= right && left <= nums.length){
            mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                lastIndex = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return (nums[lastIndex] == target || nums[lastIndex] > target) ? lastIndex: lastIndex + 1;
    }
}
