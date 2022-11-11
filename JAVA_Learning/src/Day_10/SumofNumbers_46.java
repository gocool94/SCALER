package Day_10;

import java.util.Scanner;

public class SumofNumbers_46 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int No_of_chances = scanner.nextInt();

        while (No_of_chances>0){
            int N = scanner.nextInt();
            int Sum_of_digit = 0;
            while (N>0) {
                int Last_digit = N % 10;
                Sum_of_digit+=Last_digit;
                N=N/10;

            }

            System.out.println(Sum_of_digit);
        }
    }
}
