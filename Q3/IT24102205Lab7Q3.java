import java.util.Scanner;

public class IT24102205Lab7Q3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Constants for discount percentage
        final double DISCOUNT_PERCENTAGE = 0.05;

        // Loop for 5 customers
        for (int customer = 1; customer <= 5; customer++) 
        {
            // Prompt user to enter the total bill amount
            System.out.println("Customer " + customer);
            System.out.print("Enter Total Bill Amount: ");
            double billAmount = scanner.nextDouble();

            // Prompt user to enter the mode of payment
            System.out.print("Enter Mode of Payment (C for Cash, O for Other): ");
            char paymentMode = scanner.next().charAt(0);

            // Calculate discount and amount to be paid based on payment mode
            double discount = 0;
            double finalAmount = billAmount;

            if (paymentMode == 'C' || paymentMode == 'c') 
            {
                // Apply 5% discount for cash payments
                discount = billAmount * DISCOUNT_PERCENTAGE;
                finalAmount = billAmount - discount;
            } 
            else if (paymentMode == 'O' || paymentMode == 'o') 
            {
                // No discount for other payments
                System.out.println("No discount applicable");
                discount = 0;
                finalAmount = billAmount;
            } 
            else 
            {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid");
                System.out.println(); // Print a blank line for formatting
                continue; // Skip the current customer and move to the next
            }

            // Display discount and amount to be paid
            if (paymentMode == 'C' || paymentMode == 'c') 
            {
                System.out.printf("Discount: %.2f\n", discount);
            }
            System.out.printf("Amount to be Paid: %.2f\n", finalAmount);
            System.out.println(); // Print a blank line for formatting
        }

        // Close the scanner
        scanner.close();
    }
}
