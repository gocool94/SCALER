package Day_20;

import java.util.ArrayList;

public class divby7or5 {
    public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
            if (arr.get(i)%5==0  && arr.get(i)%7==0 ){
                newList.add(arr.get(i));
            }
        }

        return newList;
    }

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        solve(list1);
    }
}
