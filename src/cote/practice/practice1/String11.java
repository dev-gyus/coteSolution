package cote.practice.practice1;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String result = solve(input1);

        System.out.println(result);
    }
    public static String solve(String input){
        StringBuilder answer = new StringBuilder();
        char preChar = '0';
        int count = 0;
        for(int i=0; i < input.length(); i++) {
            if (preChar != '0' && input.charAt(i) != preChar) {
                answer.append(preChar);
                if (count > 1) {
                    answer.append(count);
                }
                preChar = input.charAt(i);
                count = 1;
            }else {
                count++;
                preChar = input.charAt(i);
            }
        }
        if(count > 1){
            answer.append(preChar);
            answer.append(count);
        }else{
            answer.append(preChar);
        }
        return answer.toString();
    }
}
