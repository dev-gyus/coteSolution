package cote.practice.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Digits12 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int test = sc.nextInt();
        int[][] array = new int[test][student];
        for(int i=0; i < test; i++){
            for(int j=0; j < student; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int result = solve(array);
        System.out.println(result);
    }


    public static int solve(int[][] origin){
        int result = 0;
        for(int i=0; i < origin[0].length; i++){
            for(int j=0; j < origin[0].length; j++){
                int cnt = 0;
                for(int k=0; k < origin.length; k++){
                    int pj=0, pi=0;
                    for(int s=0; s < origin[0].length; s++){
                        if(origin[k][s] == i) pi = s;
                        if(origin[k][s] == j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==origin.length){
                    result++;
                }
            }
        }

        return result;
    }

}
