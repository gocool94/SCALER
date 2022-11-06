package Day_6;

import java.util.Scanner;

public class Situation_23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N%2==0){ //even number
            if (N>0){
                System.out.println("Number is Positive and Even");
            } else{
                System.out.println("Number is Negative and Even");

            }

        }else{//odd number
            if (N>0){
                System.out.println("Number is Positive and Odd");
            } else{
                System.out.println("Number is Negative and Odd");

            }

        }
    }
}
