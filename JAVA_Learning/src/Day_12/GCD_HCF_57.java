package Day_12;

import java.util.Scanner;

public class GCD_HCF_57 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int min = Math.min(A,B);

        while (min>0){
            if (A%min==0 && B%min==0){
                System.out.println(min);
                break;
            }
            min--;
        }
    }
}
