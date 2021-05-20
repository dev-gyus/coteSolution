package cote.practice.practice1;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] array = new String[count];
        in.nextLine();
        for(int i=0; i < array.length; i++){
            array[i] = in.nextLine();
        }
        for(String x : array){
            StringBuilder sb = new StringBuilder();
            char[] charArray = x.toCharArray();
            for(int i=x.length()-1; i >= 0; i--){
                sb.append(charArray[i]);
            }
            System.out.println(sb);
        }
    }
}
