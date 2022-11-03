package Day_5_If_else;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = scanner.nextInt();

        if(n>5){
            System.out.println("Yes "+s+" will recieve bonus.");
        }else {
            System.out.println("No "+s+" will not recieve bonus.");
        }
    }
}
