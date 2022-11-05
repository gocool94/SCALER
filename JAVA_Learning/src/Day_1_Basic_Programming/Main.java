package Day_1_Basic_Programming;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1;i<=N;i++){
            if(i%2==0){
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }
}