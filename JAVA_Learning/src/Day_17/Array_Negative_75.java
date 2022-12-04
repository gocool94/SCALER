package Day_17;

import java.util.Scanner;

public class Array_Negative_75 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []new_array = new int[n];

        for (int i = 0;i<new_array.length;i++){
            new_array[i] = scanner.nextInt();
        }

        for (int i = 0;i<new_array.length;i++){
            if (new_array[i]<0){
                System.out.print(new_array[i]+" ");
            }
        }


    }
}
