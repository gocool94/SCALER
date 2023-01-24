package Day_18;

import java.util.Scanner;

public class Even_odd_78 {
    public static void main(String[] args){

        //TODO:Complete this as this is an error

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int array[] = new int[arraySize];

        for(int i = 0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        int odd_count = 0;
        int even_count = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]%2==0){
                even_count+=1;
            }else {
                odd_count+=1;
            }
        }

        System.out.println(even_count-odd_count);

    }
}
