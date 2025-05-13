import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student marks (0-100) or -1 to exit: ");
            int marks = scanner.nextInt();

            if (marks == -1) {
                System.out.println("Exiting program...");
                break;
            }
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please enter a valid value.");
                continue;
            }
            int grade = 0;
            if (marks >= 80) {
                grade = 7;
            } else if (marks >= 70) {
                grade = 6;
            } else if (marks >= 60) {
                grade = 5;
            } else if (marks >= 50) {
                grade = 4;
            } else if (marks >= 40) {
                grade = 3;
            } else if (marks >= 30) {
                grade = 2;
            } else if (marks < 30) {
                grade = 1;
            }
            switch (grade) {
                case 7:
                    System.out.println("Grade: 7 - Outstanding Achievement!");
                    break;
                case 6:
                    System.out.println("Grade: 6 - Meritorious Achievement!");
                    break;
                case 5:
                    System.out.println("Grade: 5 - Substantial Achievement!");
                    break;
                case 4:
                    System.out.println("Grade: 4 - Adequate Achievement!");
                    break;
                case 3:
                    System.out.println("Grade: 3 - Moderate Achievement.");
                    break;
                case 2:
                    System.out.println("Grade: 2 - Elementary Achievement.");
                    break;
                case 1:
                    System.out.println("Grade: 1 - No Achieved.");
                    break;
                default:
                    System.out.println("Invalid grade assigned.");
            }
        }
        scanner.close();

    }       }