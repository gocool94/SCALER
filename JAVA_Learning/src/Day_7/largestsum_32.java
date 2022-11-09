package Day_7;

import java.util.Scanner;

public class largestsum_32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if(N>=10 && N<=20 ){

            int M = scanner.nextInt();
            int sum = N+M;
            System.out.println(sum);

            if (sum >=100){
                System.out.println("That is a large sum!");
            }


        } else {
            System.out.println(-1);
        }



    }
}
