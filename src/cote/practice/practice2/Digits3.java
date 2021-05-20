package cote.practice.practice2;

import java.util.Scanner;

public class Digits3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        String[] result = new String[amount];
        int[] aArray = new int[amount];
        int[] bArray = new int[amount];
        for(int i=0; i < amount; i++){
            aArray[i] = sc.nextInt();
        }
        for(int i=0; i < amount; i++){
            bArray[i] = sc.nextInt();
        }
        solve(aArray, bArray, result);
        for(String x : result) {
            System.out.println(x);
        }
    }
    public static void solve(int[] aArray, int[] bArray, String[] result){
        for(int i=0; i < result.length; i++){
            int a = aArray[i];
            int b = bArray[i];
            if(a == b){
                result[i] = "D";
                continue;
            }
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            if(max == 3 && min == 1){
                if(a > b){
                    result[i] = "B";
                }else{
                    result[i] = "A";
                }
            }else{
                if(a > b){
                    result[i] = "A";
                }else{
                    result[i] = "B";
                }
            }
        }
    }
}
