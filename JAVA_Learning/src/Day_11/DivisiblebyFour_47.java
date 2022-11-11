package Day_11;

import java.util.Scanner;

public class DivisiblebyFour_47 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if (i % 4 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
