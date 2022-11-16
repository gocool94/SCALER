package Day_12;

import java.util.Scanner;

public class LCM_58 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int max = Math.max(A,B);
        while (true){

            if (max%A==0 && max%B==0){
                System.out.println(max);
                break;
            }
            max++;
        }

    }
}
