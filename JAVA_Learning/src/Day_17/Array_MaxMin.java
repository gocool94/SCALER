package Day_17;

import java.util.Scanner;

public class Array_MaxMin {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int Array_size = scanner.nextInt();

        int []Array = new int[Array_size];

        for (int i = 0;i<Array.length;i++){
            Array[i] = scanner.nextInt();
        }

        int Max = 0;


        int Min = Array[0];

        System.out.println(Max+" "+Min);

        for (int i = 0;i<Array.length;i++){
            if (Min>Array[i]){
                System.out.println(Min<=Array[i]);
                Min = Array[i];
                System.out.println(Min+"Minimum value");
            }
            if (Max<Array[i]){
                System.out.println(Array[i]);
                Max = Array[i];
                System.out.println(Max+"Maximum value");
            }

        }


        System.out.println(Max+" "+Min);



    }
}
