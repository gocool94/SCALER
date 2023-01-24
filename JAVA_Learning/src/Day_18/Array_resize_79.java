package Day_18;

public class Array_resize_79 {
    public static void main(String[] args){

        int arr[] = {1,2,3,2,1};

         arr =  (solve(arr,3));
         for(int i = 0;i<arr.length;i++){
             System.out.println(arr[i]+" ");
         }
    }

    public static int[] solve(final int[] A, int B) {
        for(int i = 0 ;i<A.length;i++){
            A[i] = A[i]+B;
        }
        return A;
    }
}
