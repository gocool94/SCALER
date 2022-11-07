package Day_7;

import java.util.Scanner;

public class Valid_Triangle_29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int triangle = A + B + C;

        if (triangle==180){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
