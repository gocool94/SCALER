package Day_7;

import java.util.Scanner;

public class FizBuzz_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if(N%3==0 && N%5==0){
            System.out.println("FizzBuzz");
        } else if (N%3==0) {
            System.out.println("Fizz");
        } else if (N%5==0) {
            System.out.println("Buzz");

        }
    }
}
