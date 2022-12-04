package Day_17;

public class Array_product_76 {
    public static long solve(int[] arr) {
        long prod = 1;
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);

            prod*=arr[i];
        }

        return prod;
    }

    public static void main(String[] args){

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 5;
        array[2] = 7;
        array[3] = 9;
        array[4] = 4;
        System.out.println(solve(array));
    }
}
