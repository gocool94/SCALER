package Day_7;

import java.util.Scanner;

public class Categories_11 {

    public static void main(String[] args){

        /*
        Write a program to input a number(A) from user and print 1 if it is positive,
        -1 if it is negative, 0 if it's neither positive nor negative.
         */

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        if(A<0){
            System.out.println(-1);
        } else if (A>0) {
            System.out.println(1);
        } else if (A==0) {
            System.out.println(0);

        }
    }
}
