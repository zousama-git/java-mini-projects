import java.util.Scanner;

/*
 Area of a ractangle
 This program gets the length and width of
 a ractangle then calculates the area
 */

public class rectangle_area {
     static void main(String[] args) {
         // Create a Scanner object to read user input from the console
         Scanner scanner = new Scanner(System.in);

          // Declare variables to store user's double inputs
         double width, length, area =0;

          // Prompt user for input and assign values to variables
         System.out.print("Enter your length: ");
         length = scanner.nextDouble();
        
         System.out.print("Enter your width: ");
         width = scanner.nextDouble();

          // Calculation
         area = width * length;
        
         //NumLock + Alt + 0178 for super-script
         System.out.println("Your area is: "+area+" cm²");
        
         scanner.close();
    }
}
