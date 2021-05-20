package cote.practice.practice1;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args){
        // ASCII CODE 영 대문자 = 65 ~ 90 , 영 소문자 = 97 ~ 122
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String result = solve(input1);

        System.out.println(result);
    }
    public static String solve(String input){
        StringBuilder sb = new StringBuilder();

        char[] inputArray = input.toCharArray();
        int lt=0, rt = input.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(inputArray[lt])){
                lt++;
            }else if(!Character.isAlphabetic(inputArray[rt])){
                rt--;
            }else{
                char temp = inputArray[lt];
                inputArray[lt] = inputArray[rt];
                inputArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(inputArray);
    }
}
