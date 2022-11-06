package Day_9_While_loop;

import java.util.Scanner;

public class PrintN_18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int i =1;

        while(i<=N){
            System.out.print(i +" ");
            i++;
        }
    }
}
