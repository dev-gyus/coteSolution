package cote.practice.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digits7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] array = new int[amount];
        for(int i=0; i < amount; i++){
            array[i] = sc.nextInt();
        }

        int result = solve(array);
        System.out.println(result);
    }
    public static int solve(int[] origin){
        int sum = 0;
        int count = 1;
        for(int i=0; i < origin.length; i++){
            if(origin[i] == 1){
                sum += count;
                count++;
            }else{
                count = 1;
            }
        }
        return sum;
    }

}
