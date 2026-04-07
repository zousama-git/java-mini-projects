import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        if (email.contains("@")) {
            if (email.contains(".")) {
                String username = email.substring(0, email.indexOf("@"));
                String domain = email.substring(email.indexOf("@") + 1, email.length());

                System.out.printf("Hello user: %s\n", username);
                System.out.printf("Your domain is: %s\n", domain);
            } else {
                System.out.println("INVALID EMAIL. Missing '.'");
            }
        } else {
            System.out.println("INVALID EMAIL. Missing '@'");
        }

        input.close();
    }
}
