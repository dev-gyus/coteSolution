package cote.practice.practiceCH1;

import java.util.Locale;
import java.util.Scanner;

public class String8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String result = solve(input1);

        System.out.println(result);
    }
    public static String solve(String input){
        if(input.length() == 0) return "NO";
        StringBuilder sb = new StringBuilder();
        String s = input.replaceAll("[^A-Za-z]", "");
        System.out.println(s);
        sb.append(s);
//        String a = sb.toString().toLowerCase(Locale.ROOT);
//        char[] charArray = a.toCharArray();
//        for(int i=0; i < a.length()/2; i++){
//            if(charArray[i] == charArray[a.length()-(i+1)]) return "YES";
//        }
//        return "NO";

        if(sb.reverse().toString().equalsIgnoreCase(sb.toString())) return "YES";
        return "NO";
    }
}
