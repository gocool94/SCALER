package Day_12;

import java.util.Scanner;

public class PrimeNumber_60 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        for (int i = 2;i<=num/2;i++){
            if ((num%i)==0){
                count++;
            }
        }

        if (count>1){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
