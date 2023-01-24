package Day_19;

import java.util.Scanner;

public class Searching_79 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[scanner.nextInt()];

        for (int i = 0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        int search_element = scanner.nextInt();

        for (int i = 0;i<array.length;i++){
            if (array[i] == search_element){
                System.out.println(search_element);
            }else {
                System.out.println(0);
            }
        }

    }

}
