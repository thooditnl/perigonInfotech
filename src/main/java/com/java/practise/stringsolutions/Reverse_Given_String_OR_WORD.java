package com.java.practise.stringsolutions;

/**
 * Created by THOODI on 2/1/2017.
 */
public class Reverse_Given_String_OR_WORD {
    public static void main(String[] args) {
        String result = reverse("I am  a good boy");
        /*String s = " I am a good boy";
        String[] split = s.split(" ");
        String result = "";
        for(int i=split.length-1;i>=0;i--){
            result = result+(split[i]+" ");
        }*/
        System.out.println(result.toString());
    }

    public static String reverse(String s){
        String[] rev = s.split(" ");
        // String[] rev = s.split("");   reverse word.
        StringBuilder sb = new StringBuilder();
        for(int i=rev.length-1;i>=0;i--){
            sb.append(rev[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
