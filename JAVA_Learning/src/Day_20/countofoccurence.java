package Day_20;

import java.util.ArrayList;
import java.util.Scanner;

public class countofoccurence {
        public static ArrayList<Integer> solve(ArrayList<Integer> A) {

            ArrayList<Integer> frequencylist = new ArrayList<>();

            for (int i = 0;i<A.size();i++){
                int value = A.get(i);
                int count = 0;
                for (int j = 0;j<A.size();j++){
                    if (value == A.get(j)){
                        count+=1;
                    }
                }
                frequencylist.add(count);
            }
            System.out.println(frequencylist);
            return frequencylist;
        }


        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(5);
            solve(list1);
        }
        }


