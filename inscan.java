// Import the required package for Scanner
import java.util.Scanner;

// Define your class
class inscan {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter Number:");
        
        // Read the entered number
        int n = sc.nextInt();
        
        // Display the entered number
        System.out.println("Number: " + n);
        
        // Close the Scanner object to release resources
        //sc.close();

    }
}
