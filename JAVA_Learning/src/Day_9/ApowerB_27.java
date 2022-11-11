package Day_9;

import java.util.Scanner;

public class ApowerB_27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int count = 0;
        int powervalue = 1;

        while (count!=B){
            powervalue *= A;
            count++;
        }
        System.out.println(powervalue);

    }
}
