package Day_9;

import java.util.Scanner;

public class SumofEvenNumber_24 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i =1;
        int sum = 0;
        while(i<=n){
            if (i%2==0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
