package Day_15;

import java.util.Scanner;

public class EvenlyDivide_GFG_70 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        evenlyDivides(scanner.nextInt());

    }


    static int evenlyDivides(int N) {
        int digit = 1;
        int M = N;
        while(N!=0){
            digit = N %10;

        }
        return digit;
    }

}




