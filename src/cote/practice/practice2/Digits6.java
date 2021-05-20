package cote.practice.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digits6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] array = new int[amount];
        for(int i=0; i < amount; i++){
            array[i] = sc.nextInt();
        }

        List<Integer> result = solve(array);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
    public static List<Integer> solve(int[] origin){
        List<Integer> result = new ArrayList<>();
        for(int i=0; i < origin.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(origin[i]);
            int reverse = Integer.parseInt(sb.reverse().toString());

            if(reverse == 1 || reverse == 0) continue;

            boolean isSosu = true;
            for(int j=2; j < reverse; j++){
                if(reverse % j == 0){
                    isSosu = false;
                    break;
                }
            }
            if(isSosu) result.add(reverse);
        }
        return result;
    }

}
