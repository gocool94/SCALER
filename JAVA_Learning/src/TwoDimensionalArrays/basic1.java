package TwoDimensionalArrays;

import java.util.Scanner;

public class basic1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println(matrix);

        for (int i =0;i<row;i++){
            for (int j = 0;j<column;j++){
                matrix[i][j]= scanner.nextInt();

            }
        }

        for (int i =0;i<row;i++){
            for (int j = 0;j<column;j++){
                System.out.println(i+" "+j);
                System.out.println(matrix[i][j]);
            }
        }

        //first row of matrix
        System.out.println("First row of matrix");
        for (int k = 0 ;k<column;k++){
            System.out.println(matrix[0][k]);
        }


    }
}
