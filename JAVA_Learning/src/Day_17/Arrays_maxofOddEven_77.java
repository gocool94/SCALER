package Day_17;

public class Arrays_maxofOddEven_77 {
    public static void main(String[] args){


        int[][] x = {{1, 2}, {3, 4, 5}, {5, 6, 5, 9}};
        System.out.println(x[0].length);


        int []arr = new int[10];
        //56 63 87 24 32 13 15 19 44 52
        arr[0] = 56;
        arr[1] = 63;
        arr[2] = 87;
        arr[3] = 24;
        arr[4] = 32;
        arr[5] = 13;
        arr[6] = 15;
        arr[7] = 19;
        arr[8] = 44;
        arr[9] = 52;


        even_odd(arr);

    }

    public static int even_odd(int[] ls) {
        int odd_sum = 0;
        int even_sum = 0;

        for (int i = 0;i<ls.length;i++){
            if (ls[i]%2==0){
                even_sum+=ls[i];
            }else {
                odd_sum+=ls[i];
            }
        }
        System.out.println(even_sum);
        System.out.println(odd_sum);
        int diff = even_sum - odd_sum;
        System.out.println(diff);
        return diff;
    }

}
