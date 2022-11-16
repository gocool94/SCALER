package Day_12;

import java.util.Scanner;

public class primenumbers_56 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();

        for(int i = 2;i<N;i++){
            int count = 0;
            for (int j = 1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }

        }
    }
}
