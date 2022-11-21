package Day_13;

import java.util.Scanner;

public class PrintFactors_63 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        for (int i = 2;i<=N;i++){
            if(N%i==0){
                count++;
            }

        }
        System.out.println(count);

    }
}
