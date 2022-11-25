package Day_16;

import java.util.Scanner;

public class AreaOfaCircle_71 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


    }

    public int solve(int a){
        double area;
        area = Math.PI * a * a;
        return (int) Math.ceil(area);
    }
}
