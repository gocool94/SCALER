package TwoDimensionalArrays;

import java.util.Scanner;

public class ColumnbyColumnPrint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int [][] Matrix = new int[row][column];
        for (int i = 0;i<row;i++){
            for (int j = 0;j<column;j++){
                Matrix[i][j] = scanner.nextInt();
                System.out.println("Matrix ["+i+"]["+j+"]");

            }
        }


        for (int i = 0;i<column;i++){
            for (int j = 0;j<row;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        }
}
