package Day_10_While_loop_2;

import java.util.Scanner;

public class CountOfDigits_41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();//Number of test cases


        while (T!=0){
            int N = scanner.nextInt();

            int count = 0;
            while(N!=0){
                N=N/10;
                ++count;
            }
            T--;
            System.out.println(count);

        }
    }
}
