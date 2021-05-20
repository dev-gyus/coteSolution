package cote.practice.practice1;

import java.util.Locale;
import java.util.Scanner;

public class String7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String result = solve(input1);

        System.out.println(result);
    }
    public static String solve(String input){
        StringBuilder sb = new StringBuilder();
        String s = input.toLowerCase(Locale.ROOT);
        sb.append(s);

        if(sb.reverse().toString().equals(s)){
            return "YES";
        }else {
            return "NO";
        }
    }
}
