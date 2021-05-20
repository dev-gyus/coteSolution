package cote.practice.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Digits9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[][] array = new int[amount][amount];
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int result = solve(array);
        System.out.println(result);
    }

    public static int solve(int[][] origin){
        int result = 0;
        for(int i=0; i < origin.length; i++){
            int sum = 0;
            for(int j=0; j < origin[i].length; j++){
                sum += origin[i][j];
            }
            result = Math.max(result, sum);
        }
        for(int i=0; i < origin[0].length; i++){
            int sum = 0;
            for(int j=0; j < origin[i].length; j++){
                sum += origin[j][i];
            }
            result = Math.max(result, sum);
        }
        int sum =0;
        for(int i=0; i < origin[0].length; i++){
            sum += origin[i][i];
            result = Math.max(result, sum);
        }
        sum = 0;
        for(int i=origin.length-1; i >= 0; i--){
            sum += origin[i][(origin.length-1) - i];
            result = Math.max(result, sum);
        }

        return result;
    }

}
