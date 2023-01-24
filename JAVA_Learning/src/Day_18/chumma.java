package Day_18;

import java.util.Scanner;

public class chumma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int array[][] = new int[rows][rows];

        System.out.println(array[0].length); //column
        System.out.println(array.length); // row
        for(int i = 0; i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++){

            // Loop through all elements of current row
            if(i%2==0){
                for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
            }else{

                for (int j = array[i].length-1;j >= 0; j--){
                    System.out.print(array[i][j] + " ");
                }
            }


    }





    }
}
