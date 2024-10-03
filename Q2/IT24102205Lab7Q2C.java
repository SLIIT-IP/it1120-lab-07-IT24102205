import java.util.Scanner;

public class IT24102205Lab7Q2C 
{
    public static void main(String[] args) 
    {
        // Loop through numbers from 5 down to 1
        for (int number = 5; number >= 1; number--) 
        {
            // Print the current number multiple times
            for (int count = 1; count <= number; count++) 
            {
                System.out.print(number);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
