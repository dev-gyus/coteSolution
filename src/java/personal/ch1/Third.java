package java.personal.ch1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String result = solve(input1);
        System.out.println(result);
    }
    public static String solve(String target){
        if(target.length() == 0) return "";
        String result = "";
        String[] s = target.split(" ");
        int count = 0;

        for(String a : s){
            if(a.length() > count){
                count = a.length();
                result = a;
            }
        }
        return result;
    }
}
