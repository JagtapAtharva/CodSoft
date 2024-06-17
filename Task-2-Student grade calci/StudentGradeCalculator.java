import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of Subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalM = 0;

        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks obtained in each Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalM += marks[i];
        }

        double averagePercentage = (double) totalM / (numSubjects * 100) * 100;

        System.out.println("Your Result is:");
        System.out.println("Your Total Marks: " + totalM);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(double percentage)
    {
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 85)
            return "A";
        else if (percentage >= 75)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 40)
            return "D";
        else
            return "F";
    }
}
