import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int[] marks = new int[5]; // Assuming 5 subjects

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = in.nextInt();
        }

        // Calculate Total Marksr
        int totalMarks = calculateTotalMarks(marks);

        // Calculate Average Percentage
        double averagePercentage = calculateAveragePercentage(totalMarks, marks.length);

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);

        // Display Results
        displayResults(totalMarks, averagePercentage, grade);
    }

    private static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    private static double calculateAveragePercentage(int totalMarks, int numOfSubjects) {
        return (double) totalMarks / numOfSubjects;
    }

    private static char calculateGrade(double averagePercentage) {
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
