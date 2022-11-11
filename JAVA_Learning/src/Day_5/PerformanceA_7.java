package Day_5;

import java.util.Scanner;

public class PerformanceA_7 {
    public static void main(String[] args){
        /*
        Problem Description
You have been given a dataset for marks of 2 subjects,
scored by students of classes ClassA and ClassB.
You now want to compare the performances of class A and class B
by finding out the average performance of the classes.
Write a program to find if class A performed better.
Print True is Class A is strictly better else return False.


Input Format

There are 4 lines in the input.
The first and second lines are marks of subjects for Class A.
The third and fourth lines are marks of subjects for Class B.


Output Format

Print True if class A is strictly better else False.


Example Input

Input 1:-
80
27
54
61
Input 2:-
54
61
80
27


Example Output

Output 1:-
False
Output 2:-
True
         */

        Scanner scanner = new Scanner(System.in);

        int ClassAone = scanner.nextInt();
        int ClassAtwo = scanner.nextInt();

        float ClassAaverage = (float) ((ClassAone + ClassAtwo)/2.0);
        System.out.println(ClassAaverage);

        int ClassBone = scanner.nextInt();
        int ClassBtwo = scanner.nextInt();

        float ClassBaverage = (float) ((ClassBone + ClassBtwo)/2.0);
        System.out.println(ClassBaverage);

        if(ClassAaverage>ClassBaverage){
            System.out.println("True");
        } else {
            System.out.println("False");
        }





    }
}
