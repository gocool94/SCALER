package Day_7;

import java.util.Scanner;

public class MinofThree_28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A<B && A<C){
            System.out.println(A);
        }else if (B<A && B<C){
            System.out.println(B);
        } else if (C<A && C<B) {
            System.out.println(C);
        }else {
            System.out.println(A);
        }
    }
}
