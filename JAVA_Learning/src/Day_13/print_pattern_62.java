package Day_13;

import java.util.Scanner;

public class print_pattern_62 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1;i<=N;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
