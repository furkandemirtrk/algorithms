package com.demirturk;

public class ReverseString {
    public static void main(String[] args) {
//        char[] s= {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char[] s= {'h','e','l','l','o'};
        System.out.println(s);
        int len = s.length - 1;
        for(int i = 0; i != (len + 1)/2; i++){
            char dummy = s[i] ;
            s[i] = s[len - i];
            s[len - i] = dummy;
        }
        System.out.print(s);
    }
}
