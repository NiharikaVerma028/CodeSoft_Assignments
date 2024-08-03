package studentgradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    static int totalMarks = 500, totalObtain;
    static float percentage;
    static String grade = null;
    static int physics, chemistry, maths, hindi, english, standard;
    static String name;

    static void getMarks() {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        name = ip.next();
        System.out.println("Enter class/standard of student(11th/12th) : ");
        standard = ip.nextInt();
        System.out.println("Enter marks of Physics: ");
        physics = ip.nextInt();
        System.out.println("Enter marks of Chemistry: ");
        chemistry = ip.nextInt();
        System.out.println("Enter marks of Maths: ");
        maths = ip.nextInt();
        System.out.println("Enter marks of Hindi: ");
        hindi = ip.nextInt();
        System.out.println("Enter marks of English: ");
        english = ip.nextInt();

    }

    static void result() {
        System.out.println("----------------------RESULT----------------------");
        if (physics > 33 && chemistry > 33 && maths > 33 && hindi > 33 && english > 33) {
            totalObtain = physics + chemistry + maths + hindi + english;
            percentage = ((totalObtain * 100) / totalMarks);
            if (percentage > 90) {
                grade = "A";
            } else if (percentage > 80 && percentage <= 90) {
                grade = "B";
            } else if (percentage > 70 && percentage <= 80) {
                grade = "C";
            } else if (percentage > 60 && percentage <= 70) {
                grade = "D";
            } else if (percentage > 50 && percentage <= 60) {
                grade = "E";
            } else if (percentage < 50) {
                grade = "Poor";
            }

            System.out.println("\tName : " + name + "\t Standard : " + standard + "\n\tObtain : " + totalObtain + "\t Out of : " + totalMarks + "\n\tGrade : " + grade + "\tpercentage : " + percentage + "\n\tResult : Pass");
        } else {
            System.out.println("\tName : " + name + "\t Standard : " + standard + "\n\tResult : fail");
        }
    }

    public static void main(String[] args) {

        System.out.println("-------------------------------Student Grade Calculator-------------------------------");
        getMarks();
        result();

    }

}
