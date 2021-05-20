package cote.practice.practice1;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String result = solve(input1);

        System.out.println(result);
    }
    public static String solve(String input){
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
//        List<Character> charList = new ArrayList<>();
//
//        for(char x : charArray){
//            if(!charList.contains(x)) {
//                charList.add(x);
//                sb.append(x);
//            }
//        }

        for(int i=0; i < input.length(); i++){
            if(input.indexOf(charArray[i]) == i) sb.append(charArray[i]);
        }

        return sb.toString();
    }
}
