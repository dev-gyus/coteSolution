package cote.practice.practice2;

import java.util.Scanner;

public class Digits11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[][] array = new int[amount+1][6];
        for(int i=1; i < amount+1; i++){
            for(int j=1; j < 6; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int result = solve(array);
        System.out.println(result);
    }


    public static int solve(int[][] origin){
        int max = 0;
        int pos = 0;
        for(int i=1; i < origin.length; i++) {
            int count = 0;
            for (int j = 1; j < origin.length; j++) {
                for(int k = 1; k < 6; k++){
                    if(origin[i][k] == origin[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(max < count){
                max = count;
                pos = i;
            }
        }
        return pos;
    }

}
