package Day_21;

import java.util.Scanner;

public class ReverseofString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        System.out.println(s);

        String rev = "";

        for (int i = s.length()-1;i>=0;i--){

            rev = rev + s.charAt(i);

        }

        System.out.println(rev);
    }
}
