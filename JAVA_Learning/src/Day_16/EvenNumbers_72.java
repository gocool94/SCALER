package Day_16;

public class EvenNumbers_72 {
    public static int solve(int A) {
        int sum = 0;
for (int i = 1; i<=A; i++)   {
    if(i%2 == 0){
        sum+=i;
    }
}
        return sum;
    }

    public static void main(String[] args){
        System.out.println(solve(5));
    }
}
