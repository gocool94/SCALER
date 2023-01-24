package Day_20;

import java.util.Scanner;

public class patternsleaingstar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1;i<=N;i++){
            //print space
            for(int j = 1;j<=N-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
}
