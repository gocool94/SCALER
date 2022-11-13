package Day_11;

public class FunctionsEven_53 {
    public static void main(String[] args){

        System.out.println(solve(5));

    }

    public static int solve(int A) {
        int sum = 0;
        for (int i = 1;i<=A;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
