package cote.practice.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Digits1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] inputArray = new int[amount];
        for(int i=0; i < amount; i++){
            inputArray[i] = sc.nextInt();
        }
        solve(inputArray);
        for (int i=0; i < inputArray.length; i++) {
            if(inputArray[i] != 0) {
                if (i < inputArray.length - 1) {
                    System.out.print(inputArray[i] + " ");
                } else {
                    System.out.print(inputArray[i]);
                }
            }
        }
    }
    public static void solve(int[] array){
        int prev = array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] <= prev){
                prev = array[i];
                array[i] = 0;
                continue;
            }
            prev = array[i];
        }
    }
}
