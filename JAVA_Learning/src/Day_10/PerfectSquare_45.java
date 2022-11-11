package Day_10;

import java.util.Scanner;

public class PerfectSquare_45 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int range = scanner.nextInt();
        int i = 1;
        while(i*i<=range){
            System.out.print(i*i +" ");
            i++;

        }
    }
}
