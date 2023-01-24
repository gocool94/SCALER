package Day_21;

class test {

    static void func(int[][]mat) {

        mat[2][3] = 19;

    }

    public static void main(String args[]) {

        int[][]A = {

                {2,5,9,8},

                {6,2,5,7},

                {1,3,0,4}

        };


        func(A);

        System.out.println(A[2][4]);

    }

}