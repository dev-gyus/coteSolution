package java.personal.ch1;

import java.util.Locale;
import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        int result = search(input1, input2);
        System.out.println(result);
        return;
    }
    public static int search(String target, char keyword){
        if(target == null || target.length() == 0 || keyword == 0) return 0;
        int result = 0;

        String lowerString = target.toLowerCase(Locale.ROOT);
        char lowerKeyword = Character.toLowerCase(keyword);

        char[] charArray = lowerString.toCharArray();
        for(char a : charArray){
            if(a == lowerKeyword) result++;
        }
        return result;
    }
}
