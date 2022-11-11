package Day_10;

import java.util.Scanner;

public class Divide_Steps38 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int count = 1;
        while((A/2)>1){
            A = A/2;
            count++;

        }
        System.out.println(count);
    }
}
