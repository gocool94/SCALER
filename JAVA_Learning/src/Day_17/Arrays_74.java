package Day_17;

import java.util.Scanner;

public class Arrays_74 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[9];

        for (int i = 0;i<arr.length;i++){

            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
