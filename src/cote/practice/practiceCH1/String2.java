package cote.practice.practiceCH1;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String result = solve(input1);
        System.out.println(result);
    }
    public static String solve(String target){
//        String upperTarget = target.toUpperCase(Locale.ROOT);
//        String lowerTarget = target.toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i < target.length(); i++){
//            char targetC = target.charAt(i);
//            char upperC = upperTarget.charAt(i);
//            char lowerC = lowerTarget.charAt(i);
//            if(targetC == upperC) sb.append(Character.toLowerCase(upperC));
//
//            if(targetC == lowerC) sb.append(Character.toUpperCase(lowerC));
//        }
        for(char x : target.toCharArray()){
            if(Character.isLowerCase(x)) sb.append(Character.toUpperCase(x));
            if(Character.isUpperCase(x)) sb.append(Character.toLowerCase(x));
        }
        // ASCII에서 대문자 65~90, 소문자 97~122 이용하는 방법도 있음
        return sb.toString();
    }
}
