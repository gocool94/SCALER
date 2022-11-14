package Day_11;

import java.util.Scanner;

public class OddNumbers_54 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1;i<=N;i=i+2){
            System.out.print(i+" ");


        }
    }
}
