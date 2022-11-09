package Day_10_While_loop_2;

import java.util.Scanner;

public class Single_line_39 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        while (A<B){
            System.out.print(A+" ");
            A++;
        }
        System.out.println(B);

    }
}
