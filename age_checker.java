import java.util.Scanner;

public class age_checker {
    static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Check if the name is empty
        if (name.isEmpty()){
            // If name is empty, tell the user they need to enter a name
            System.out.println("You did not enter your name!");
        }
        // If the name is NOT empty, then do this
        else {
            System.out.print("Hi "+name +", how old are you?: ");
            int age = scanner.nextInt();
        scanner.nextLine();

            // Check the age and tell the user what category they fall into
            // These are checked in order, and we check the broadest category first
            // It is better to do these in sequences since it takes the recently true first
            

            if (age>=18) {
                System.out.println("You are an adult");
            } else if (age==0) {
                System.out.println("You are just born");
            } else if (age<0) {
                System.out.println("You are NOT yet born");
            } else if (age<12) {
                System.out.println("You NOT a teenager");
            } else {
                System.out.println("You are a teenager");
            }
        }

        
        
        // Check if the user is a student
        // We can use a while loop to keep asking the user until they give us a valid answer
        while (true){
            System.out.println("Are you a student? (true/false): ");
            String isStudent = scanner.nextLine(); 

            //equalsIgnoreCase is used to compare two strings without considering the case (upper or lower)
            if (isStudent.equalsIgnoreCase("true")) {
                System.out.println("You are a student");
                break;
            }
            else if ((isStudent.equalsIgnoreCase("false"))) {
                System.out.println("You are NOT a student");
                break;
            }
            else {
                System.out.println("Please enter true or false");
            }

    }scanner.close();
}}