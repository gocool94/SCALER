package Day_19;

import java.lang.*;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();


        while(T-->0){
            int count = 0;
            String name = scanner.next();
            for(int i =0;i<name.length();i++)

            {
                char ch = name.charAt(i);
                if(ch >= 'A' && ch <= 'Z'){
                    count++;
                }

            }            System.out.println(count);



            System.out.println("***********************");

        }

    }
}
