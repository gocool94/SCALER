package Day_14;

import java.util.Scanner;

public class InvertedPyramid_64 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (;N!=0;N--){
            for (int i=N;i!=0;i--){

                if (N!=1){
                    System.out.print("* ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");

        }
    }
}
