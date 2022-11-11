package Day_9;

import java.util.Scanner;

public class NaturalNumberAddition_22 {
    public static void main(String[] args){
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        while (i<=N){
            sum= sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
