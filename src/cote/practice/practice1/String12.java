package cote.practice.practice1;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String result = solve(input1, input2);

        System.out.println(result);
    }
    public static String solve(String amount, String message){
//        StringBuilder answer = new StringBuilder();

//        int count = 0;
//        while((count+1) * 7 <= message.length()){
//            String substring = message.substring(count * 7, (count + 1) * 7);
//            StringBuilder tmp = new StringBuilder();
//            for(char x : substring.toCharArray()){
//                if(x == '#') tmp.append(1);
//                if(x == '*') tmp.append(0);
//            }
//            String s = tmp.reverse().toString();
//            int sum = 0;
//            int target = 1;
//            for(char x : s.toCharArray()){
//                sum += Integer.parseInt(Character.toString(x)) * target;
//                target *= 2;
//            }
//            char result = (char)sum;
//            answer.append(result);
//            count++;
//        }

        StringBuilder answer = new StringBuilder();
        for(int i=0; i < Integer.parseInt(amount); i++){
            String substring = message.substring(0, 7);
            String replace = substring.replace('#', '1').replace('*', '0');
            int result = Integer.parseInt(replace, 2);
            answer.append(Character.valueOf((char) result));
            message = message.substring(7);
        }
        return answer.toString();
    }
}
