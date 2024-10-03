import java.util.Scanner;

public class IT24102205Lab7Q1B 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Loop through three students
        for (int student = 1; student <= 3; student++) 
        {
            // Display the student number and prompt for input
            System.out.println("Student " + student);
            System.out.print("Enter Marks: ");

            // Read the entire line of marks and split into an array
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            int subject4 = scanner.nextInt();

            // Check for valid marks (between 0 and 100) for each subject
            if (subject1 < 0 || subject1 > 100 || subject2 < 0 || subject2 > 100 ||
                subject3 < 0 || subject3 > 100 || subject4 < 0 || subject4 > 100) 
            {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }

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

            // Display the average and grade in the specified format
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println(); // Print a blank line between students
        }

        // Close the scanner
        scanner.close();
    }
}
