package Day_7;

import java.util.Scanner;

public class Triangle_35 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A==B && B==C && C==A){
            System.out.println("equilateral");
        } else if (A!=B && B!=C && C!=A) {
            System.out.println("scalene");
        }else{
            System.out.println("isosceles");
        }


    }
}
