import java.util.Scanner;

/*
 MAD LIBS GAME
 This program asks the user to adjectives, nouns, verbs
 and then uses those words to create story.
 */

public class MAD_LIBS {
    static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String adjective1, noun1, verb1, adjective2, adjective3;

        // Prompt user for input and assign values to variables
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter an noun (animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter an verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        // Display story
        System.out.println("\n Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a "+ noun1 + ".");
        System.out.println(noun1+" was " +adjective2+" and "+verb1+"!");
        System.out.println("I was "+adjective3+ "!");

        // Close the scanner
        scanner.close();
    }
}
