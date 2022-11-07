package Day_8;

import java.util.Scanner;

public class Maximumslip_30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A>B && A>C){
            System.out.println(A+" is largest number");
        } else if (B>A && B>C) {
            System.out.println(B+" is largest number");
        } else if (C>A && C>B) {
            System.out.println(C+" is largest number");
        }else{
            System.out.println(1);
        }


    }
}
