package Day_8;

import java.util.Scanner;

public class BankBalance_33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int  balance = scanner.nextInt();
        int cases = scanner.nextInt();
        int money = scanner.nextInt();

        if (cases==1){
            balance = balance+money;
            System.out.println(balance);
        } else if (cases==2) {
            if (balance<money){
                System.out.println("Insufficient Funds");
            }else {
                balance = balance-money;
                System.out.println(balance);
            }

        }


    }
}
