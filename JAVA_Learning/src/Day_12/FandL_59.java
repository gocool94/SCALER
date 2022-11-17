package Day_12;

import java.security.KeyStore;
import java.util.Scanner;

public class FandL_59 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        boolean HasDigit = false;
        int lastnumber=0;
        int firstnumber=0;
        while (T!=0){
            int N = scanner.nextInt();
            lastnumber = N%10;
            while (N>0){
                HasDigit = true;
                firstnumber = N%10;
                N = N/10;
            }
            if (HasDigit==true){
                System.out.println(firstnumber+" "+lastnumber);
            } else {
                System.out.println(lastnumber+" "+lastnumber);
            }
            T--;
        }


    }
}
