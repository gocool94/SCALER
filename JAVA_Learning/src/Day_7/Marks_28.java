package Day_7;

import java.util.Scanner;

public class Marks_28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        float D = scanner.nextFloat();
        float E = scanner.nextFloat();

        float scored = A + B + C + D + E;

        float percentage = (float)((scored/500)*100);

        System.out.println((int)(percentage));

        if(percentage>=90){
            System.out.println("A");
        } else if(percentage>=80 && percentage<90){
            System.out.println("B");
        } else if(percentage>=70 && percentage<80){
            System.out.println("C");
        }else if(percentage>=60 && percentage<70){
            System.out.println("D");
        }else if(percentage>=40 && percentage<60){
            System.out.println("E");
        } else if (percentage<40) {
            System.out.println("F");
        }

    }
}
