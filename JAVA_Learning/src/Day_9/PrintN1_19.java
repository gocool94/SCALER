package Day_9;

import java.util.Scanner;

public class PrintN1_19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int i = 1;

        while(i<=N){
            System.out.print(N+" ");
            N--;
        }
    }
}
