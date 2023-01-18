package com.demirturk;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static int solution(int n){
        int pivot, left=1, right = n, badVs = 0;
        while(left <= right){
            pivot = left + (right - left) / 2;
            if(isBadVersion(pivot)){
                badVs = pivot;
                right = pivot -1;
            }else{
                left = pivot + 1;
            }
        }
        return badVs;
    }

    private static boolean isBadVersion(int n) {
        return n >= 2;
    }
}
