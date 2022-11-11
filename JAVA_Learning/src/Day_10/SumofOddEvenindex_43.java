package Day_10;

import java.util.Scanner;

public class SumofOddEvenindex_43 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 1;
        int M;
        int SumofOddindex=0;
        int SumofEvenindex=0;
        while(N>0){
            M=N%10;//get all the digit
            if(count%2!=0){
                SumofOddindex+=M;
            }else{
                SumofEvenindex+=M;
            }

            N=N/10;

            count++;
        }
        System.out.println("Sum of Odd Index Digit : "+SumofOddindex);
        System.out.println("Sum of Even Index Digit : "+SumofEvenindex);

    }
}
