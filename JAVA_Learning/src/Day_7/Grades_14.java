package Day_7;

public class Grades_14 {
    public static void main(String[] args){

        int score = 80;

        String grade;
        if (score >= 90) grade = "A";

        if (score >= 80) grade = "B";

        if (score >= 70) grade = "C";

        if (score >= 60) grade = "D";

        else grade = "E";

        System.out.println(grade);
    }
}
