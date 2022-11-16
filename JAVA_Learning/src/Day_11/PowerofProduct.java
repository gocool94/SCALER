package Day_11;

import java.util.Scanner;

public class PowerofProduct {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int value=1;
        for(int i = 1;i<=B;i++){
            value = value * A;
        }
        System.out.println(value);
    }
}
