package Day_13;

import java.util.Scanner;

public class ReverseANumber_62 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = n ;
        int reversed = 0;

        for(;n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(num);
        System.out.println("Reversed Number: " + reversed);

        if (reversed==num){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

            }
}
