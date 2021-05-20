package cote.practice.practice2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Digits8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] array = new int[amount];
        for(int i=0; i < amount; i++){
            array[i] = sc.nextInt();
        }

        int[] result = solve(array);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
    public static int[] solve(int[] origin){
        int[] result = new int[origin.length];
        Arrays.fill(result, 1);

        for(int i=0; i < result.length; i++){
            for(int j=0; j < result.length; j++){
                if(origin[j] > origin[i]) result[i]++;
            }
        }
        return result;
    }

}
