
import java.util.*;
public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Tamil mark: ");
        int tamil = sc.nextInt();

        System.out.print("Enter English mark: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths mark: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science mark: ");
        int science = sc.nextInt();

        System.out.print("Enter Social Science mark: ");
        int social = sc.nextInt();

        int total = tamil + english + maths + science + social;
        double avg = total / 5.0;

        String grade;

        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total + "/500");
        System.out.println("Avg : " + avg);
        System.out.println("Grade   : " + grade);

    }
}