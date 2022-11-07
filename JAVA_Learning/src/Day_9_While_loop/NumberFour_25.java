package Day_9_While_loop;

import java.util.Scanner;

public class NumberFour_25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i =1;
        while(i<=n){
            if (i%4==0){
                System.out.print(i+" ");
            }
            i++;
        }

    }
}
