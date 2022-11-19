package Day_10;

import java.lang.*;
import java.util.*;

public class Bank_Account_42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t > 0) {
            int n = scn.nextInt();
            int sum = 0;

            while(n > 0) {
                int d = n % 10;
                // Adding last digit
                sum += d;
                n = n / 10;
            }

            System.out.println(sum);
            t--;
        }
    }
}
