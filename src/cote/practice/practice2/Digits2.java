package cote.practice.practice2;

import java.util.Scanner;

public class Digits2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] inputArray = new int[amount];
        for(int i=0; i < amount; i++){
            inputArray[i] = sc.nextInt();
        }
        int result = solve(inputArray);
        System.out.println(result);
    }
    public static int solve(int[] array){
        int max = array[0];
        int count = 1;
        for(int i=1; i < array.length; i++){
            if(array[i] > max){
                count++;
            }
            max = Math.max(max, array[i]);
        }
        return count;
    }
}
