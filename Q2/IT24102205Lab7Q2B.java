import java.util.Scanner;

public class IT24102205Lab7Q2B 
{
    public static void main(String[] args) 
    {
        // Loop through numbers 1 to 5
        for (int number = 1; number <= 5; number++) 
        {
            // Display the number and a hyphen
            System.out.print(number + " - ");
            
            // Print stars corresponding to the current number
            for (int star = 1; star <= number; star++) 
            {
                System.out.print("* ");
            }

            // Move to the next line after printing stars for each number
            System.out.println();
        }
    }
}
