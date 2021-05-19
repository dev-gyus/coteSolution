package cote.practice.practiceCH1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int[] result = solve(input1);

        for (int i : result) {
            System.out.print(i + " ");

        }
    }
    public static int[] solve(String input){
        StringBuilder sb = new StringBuilder();
        String origin = input.split(" ")[0];
        char target = (input.split(" ")[1]).charAt(0);
        int[] answer = new int[origin.length()];
        int index = 1000;
        for(int i=0; i < origin.length(); i++){
            if(origin.charAt(i) == target){
                index = 0;
                answer[i] = index;
            }else{
                index++;
                answer[i] = index;
            }
        }
        System.out.println(Arrays.toString(answer));
        for(int i = origin.length()-1; i >= 0; i--){
            if(origin.charAt(i) == target){
                index = 0;
            }else{
                index++;
                answer[i] = Math.min(answer[i], index);
            }
        }

        return answer;
    }
}
