import java.util.Scanner;

public class DayTypeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = input.nextLine().toUpperCase();

        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                    System.out.println("It is a weekday");
            case "SATURDAY", "SUNDAY" -> System.out.println("It is a weekend");
            default -> System.out.println("Enter a proper day");
        }

        input.close();
    }
}
