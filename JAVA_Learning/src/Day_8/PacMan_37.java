package Day_8;

import java.util.Scanner;

public class PacMan_37 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A==1){
            if (B==1){
                System.out.println(0);
            }else {
                System.out.println(1);
            }


        }else {
            System.out.println(0);
        }

    }
}
