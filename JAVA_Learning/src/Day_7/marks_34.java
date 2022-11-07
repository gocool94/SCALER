package Day_7;

import java.util.Scanner;

public class marks_34 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();

        if (M>=50){
            if (M>=50 && M<=80){
                System.out.println("PASS B");
            } else if (M>=81 && M<=100) {
                System.out.println("PASS A");
                
            }
        }else {
            System.out.println("FAIL");
        }
    }
}
