package Day_11;

import java.util.Scanner;

public class BankingOperations_53 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int balance = scanner.nextInt();

        int number_of_operations = scanner.nextInt();

        while (number_of_operations!=0){
            int operation = scanner.nextInt();
            int amount = scanner.nextInt();
            if (operation==1){
                balance+=amount;
                System.out.println(balance);
                number_of_operations--;
            } else if (operation==2) {
                if (balance>amount){
                    balance-=amount;
                    System.out.println(balance);
                    number_of_operations--;
                }else{
                    System.out.println("Insufficient funds");
                    number_of_operations--;
                }

            }

        }
    }
}
