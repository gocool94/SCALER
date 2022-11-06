package Day_8;

import java.util.Scanner;

public class MusicSold_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextInt();
        System.out.println(A);
        if (A>500000 && A<1000000){
            System.out.println("gold");
        } else if (A>1000000 && A<10000000) {
            System.out.println("platinum");
        } else if(A>10000000){
            System.out.println("diamond");
        }else {
            System.out.println("None");
        }


    }
}
