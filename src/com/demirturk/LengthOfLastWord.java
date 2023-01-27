package com.demirturk;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World";
        String[] arr = s.split(" ");
        arr[arr.length-1] = arr[arr.length-1].trim();

        System.out.println(arr[arr.length - 1].length());
    }
}
