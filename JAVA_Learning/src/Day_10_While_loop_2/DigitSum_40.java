package Day_10_While_loop_2;

import java.util.Scanner;

public class DigitSum_40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M;
        int sumofOdd=0;
        int sumofEven=0;
        while(N>1){
            M = N%10;
           if(M%2==0){
               sumofEven = sumofEven+M;
           } else {
               sumofOdd = sumofOdd + M;
           }
            N = N/10;
        }
        System.out.println("Sum of Odd Digit :"+sumofOdd);
        System.out.println("Sum of Even Digit :"+sumofEven);
    }
}
