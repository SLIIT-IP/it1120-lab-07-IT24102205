import java.util.Scanner;

public class IT24102205Lab7Q1A 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Display a message for entering marks for four subjects
        System.out.println("Enter marks for four subjects:");

        // Declare variables to store marks for four subjects
        int subject1, subject2, subject3, subject4;

        // Input marks for each subject with the specified format
        System.out.print("Enter Subject Mark 1: ");
        subject1 = scanner.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        subject2 = scanner.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        subject3 = scanner.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        subject4 = scanner.nextInt();

        // Check for valid marks (between 0 and 100) for each subject
        if (subject1 < 0 || subject1 > 100 || subject2 < 0 || subject2 > 100 || 
            subject3 < 0 || subject3 > 100 || subject4 < 0 || subject4 > 100) 
        {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        } 
        else 
        {
            // Calculate the average
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;

            // Determine the grade based on the average
            String grade;
            if (average >= 75 && average <= 100) 
            {
                grade = "Distinction";
            } 
            else if (average >= 50 && average < 75) 
            {
                grade = "Credit";
            } 
            else 
            {
                grade = "Fail";
            }

            // Display a blank line as requested
            System.out.println();

            // Display the average and grade in the specified format
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}
