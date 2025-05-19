package day28_StringReview;

public class C05_MiddleTwo {
    public static void main(String[] args) {

        System.out.println("middleTwo(\"Middle\") = " + middleTwo("Middle"));
        System.out.println("middleTwo(\"Mi\") = " + middleTwo("Mi"));
        System.out.println("middleTwo(\"Mi\") = " + middleTwo("Mid"));
        System.out.println("middleTwo(\"Mi\") = " + middleTwo(""));
        System.out.println("middleTwo(\"Mi\") = " + middleTwo("m"));

    }
/*
Given a string of even length, return a string made of the
middle two chars, so the string "string" yields "ri".
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

    public static String middleTwo(String str){
        if(str.length() %2 ==1) return "";
        if (str.length() ==0) return "";
        int middleIndex = str.length()/2;

        return str.substring(middleIndex - 1,middleIndex + 1 );

    }

}
