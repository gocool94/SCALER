package Day_9;

import java.util.Scanner;

public class MultiplicationTable_26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int i =1;

        while(i<=N){
            System.out.println(N +" * "+i+" = "+N*i);
            i++;
        }

    }
}
