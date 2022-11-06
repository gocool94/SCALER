package Day_9_While_loop;

import java.util.Scanner;

public class EvenNumber_21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int i = 1;

        int N = scanner.nextInt();

        while (i<=N){
            if (i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
