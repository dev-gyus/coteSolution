package cote.practice.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Digits5 {
    public static void main(String[] args){
        // 에라토스테네스체 방식사용. 2중 for문 쓰면 시간초과됨
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int result = solve(amount);
        System.out.println(result);
    }
    public static int solve(int amount){
        int count = 0;
        int[] tmp = new int[amount+1];
        for(int i=2; i <= amount; i++){
            if(tmp[i] == 0){
                count++;
                int j = 1;
                while(j * i < amount+1){
                    tmp[j*i] = 1;
                    j++;
                }
            }
        }
        return count;
    }

}
