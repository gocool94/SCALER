package Day_8;

import java.util.Scanner;

public class Leap_year_31 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a%400==0){
            if (a%4==0 && a%100!=0){
                System.out.println(1);
            }
        }else {
            System.out.println(0);
        }
    }
}
