package Day_13;

import java.util.Scanner;

public class print_pattern_61 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();


        for (int i = 0;i<N;i++){
            for (int j=0;j<M;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
