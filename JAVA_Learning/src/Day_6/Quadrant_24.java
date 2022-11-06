package Day_6;

import java.util.Scanner;

public class Quadrant_24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A>0 && B>0){
            System.out.println(A +","+B+" belongs to First Quadrant");
        } else if(A>0 && B<0){
            System.out.println(A +","+B+" belongs to Second Quadrant");
        }else if(A<0 && B<0){
            System.out.println(A +","+B+" belongs to Third Quadrant");
        }else if(A<0 && B>0){
            System.out.println(A +","+B+" belongs to Fourth Quadrant");
        }


    }
}
