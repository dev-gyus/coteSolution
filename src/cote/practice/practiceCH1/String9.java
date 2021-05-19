package cote.practice.practiceCH1;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String result = solve(input1);

        System.out.println(result);
    }
    public static String solve(String input){
        StringBuilder sb = new StringBuilder();

        for(char x : input.toCharArray()){
            if(Character.isDigit(x)) sb.append(x);
        }
        return "" + Integer.parseInt(sb.toString());
    }
}
