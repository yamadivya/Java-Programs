package divya;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String grade = CheckGrade(marks);
        System.out.println(grade);
    }

    static String CheckGrade(int marks){
        if (marks >= 91 && marks <= 100){
            return "AA";
        }
        if (marks >= 81 && marks <= 90){
            return "AB";
        }
        if (marks >= 71 && marks <= 80){
            return "BB";
        }
        if (marks >= 61 && marks <= 70){
            return "BC";
        }
        if (marks >= 51 && marks <= 60){
            return "CD";
        }
        if (marks >= 41 && marks <= 50){
            return "DD";
        }
        return "Fail";
    }
}
