package Day_5;

import java.util.Scanner;

public class RockstarProblem_8 {
    public static void main(String[] args){

        /*
        Problem Description

Given a Number N, print the answer according to the following rules-
If N is divisible by 3 print Rock
If N is divisible by 5 print star
If N is divisible by both 3 and 5 print Rockstar
Note : You are allowed to use only if condition.
Don’t use else or else-if condition. This constraint is provided for learning purposes.



Problem Constraints

1 <= N <= 1000


Input Format

The value of N.


Output Format

Print the appropriate message according to the value of N.


Example Input

15


Example Output

Rockstar


Example Explanation

N = 15

15 is divisible by both 3 and 5 , so the output is Rockstar.
         */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if((N%3==0) && (N%5==0)){

            System.out.println("Rockstar");

        }
        else if(N%3==0){
            System.out.println("Rock");
        }

        else if(N%5==0){
            System.out.println("star");
        }


    }



}
