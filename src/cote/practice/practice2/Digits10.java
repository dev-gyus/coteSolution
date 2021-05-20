package cote.practice.practice2;

import java.util.Scanner;

public class Digits10 {
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

    public static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public static int solve(int[][] origin){
        int result = 0;
        for(int i=0; i < origin.length; i++){
            for(int j=0; j < origin[i].length; j++){
                int target = origin[i][j];
                boolean bonguri = isBonguri(origin, target, i, j);
                if(bonguri) result++;
            }
        }

        return result;
    }
    public static boolean isBonguri(int[][] origin, int target, int x, int y){
        boolean result = false;
        for(int i = 0; i < dir.length; i++){
                int x1 = x + dir[i][0];
                int y1 = y + dir[i][1];
                if(x1 >= 0 && y1 >= 0 && x1 < origin.length && y1 < origin[0].length){
                    if(target > origin[x1][y1]){
                        result = true;
                    }else{
                        result = false;
                        break;
                    }
                }
        }
        return result;
    }

}
