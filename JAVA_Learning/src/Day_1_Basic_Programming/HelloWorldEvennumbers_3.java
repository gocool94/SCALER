package Day_1_Basic_Programming;

public class HelloWorldEvennumbers_3 {

    //Problem Description
    //Print first 5 odd numbers i.e. 1, 3, 5, 7, 9.
    //
    //
    //Output Format
    //Print first five odd numbers separated by space.
    //
    //
    //Example Output
    //1 3 5 7 9

    public static void main(String[] args) {

        for (int i = 0;i<10;i++){
            if (i%2!=0){
                System.out.print(i +" ");
            }
        }
    }
}
