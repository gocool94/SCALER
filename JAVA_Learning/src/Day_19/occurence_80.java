package Day_19;

import java.util.Scanner;

public class occurence_80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        arr = new int[6];

        System.out.println(arr);

    }

    public int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count += 1;
            }
        }
        return count;
    }

}
