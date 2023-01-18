package com.demirturk;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i<arr.length; i++){
            char[] cArr = arr[i].toCharArray();
            for(int j = cArr.length - 1; j >= 0 ; j--){
                result.append(cArr[j]);
            }
            if(i != arr.length - 1)result.append(" ");
        }
        System.out.println(result);
    }
}
