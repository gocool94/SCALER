package Day_7;

import java.util.Scanner;

public class Codingrating_36 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rating = scanner.nextInt();
        
        if (rating>=2100){
            if(rating%2!=0){
                System.out.println("grand master");
            }else {
                System.out.println("GRAND MASTER");
            }
        } else if (rating>=1900) {
            if(rating%2!=0){
                System.out.println("candidate master");
            }else {
                System.out.println("CANDIDATE MASTER");
            }
            
        }else if (rating>=1600) {
            if (rating % 2 != 0) {
                System.out.println("expert");
            } else {
                System.out.println("EXPERT");
            }
        }
        else if (rating>=1400) {
            if (rating % 2 != 0) {
                System.out.println("pupil");
            } else {
                System.out.println("PUPIL");
            }
        }
        else if (rating<=1900) {
            if (rating % 2 != 0) {
                System.out.println("newbie");
            } else {
                System.out.println("NEWBIE");
            }
        }

    }
}
