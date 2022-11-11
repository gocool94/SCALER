package Day_11;

import java.util.Scanner;

public class EvenNumbers_50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i =0;i<=N;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
