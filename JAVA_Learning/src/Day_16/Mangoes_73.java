package Day_16;

public class Mangoes_73 {
    public static int solve(int A, int B) {
        // A represent count of mangoes
        //B represent count of slices
        int number_of_slices = (A * 3) + B;

        int num_of_glass = number_of_slices/2;

        return num_of_glass;

    }

    public static void main(String[] args){
        System.out.println(solve(19,0));
    }
}
