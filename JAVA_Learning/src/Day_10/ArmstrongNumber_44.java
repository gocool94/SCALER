package Day_10;

import java.util.Scanner;

public class ArmstrongNumber_44{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int endingnumber = scanner.nextInt();

        for (int starting_number = 1;starting_number<endingnumber;starting_number++){
            int n = starting_number;
            int m = n;
            int sum = 0;
            while (n>0){
                int last_digit = n%10;
                int value = last_digit * last_digit * last_digit;
                sum+=value;
                n = n/10;
            }
            if(m==sum){
                System.out.println(starting_number);
            }

        }



    }
}
