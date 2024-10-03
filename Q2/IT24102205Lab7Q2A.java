import java.util.Scanner;

public class IT24102205Lab7Q2A 
{
    public static void main(String[] args) 
    {
        // Outer loop for 4 rows
        for (int row = 1; row <= 4; row++) 
        {
            // Inner loop to print 5 dollar symbols in each row
            for (int col = 1; col <= 5; col++) 
            {
                System.out.print("$ ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
