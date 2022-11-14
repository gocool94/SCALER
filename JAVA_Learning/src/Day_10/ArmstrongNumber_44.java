package Day_10;

import java.util.Scanner;

public class ArmstrongNumber_44{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n>0){
            int value = n * n * n;
            System.out.println(value);
            n--;

        }


    }
}
