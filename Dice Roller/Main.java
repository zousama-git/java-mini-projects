import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //declare variables
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numOfDice, total = 0;

        System.out.print("Enter the # of dice to roll: "); //get number of dice from user
        numOfDice = input.nextInt();

        if(numOfDice > 0){ //check if number of dice > 0
            for (int i = 0; i<numOfDice; i++){ //roll all the dice
                int roll =random.nextInt(1,7);  
                printDie(roll);
                //System.out.printf("You rolled: %d \n", roll);
                total += roll; //get the total
            }
        } else System.out.println("# of dice must be greater than 0");

        System.out.printf("Your total is: %d", total);
        
        //display ASCII of dice
        input.close();
    }
    
    static void printDie(int roll){
        String dice1 = """
        _________
        |       |
        |   1   |
        |       |
        _________
        """;;
        String dice2 = """
        _________
        |       |
        |   2   |
        |       |
        _________
        """;;
        String dice3 = """
        _________
        |       |
        |   3   |
        |       |
        _________
        """;;
        String dice4 = """
        _________
        |       |
        |   4   |
        |       |
        _________
        """;;
        String dice5 = """
        _________
        |       |
        |   5   |
        |       |
        _________
        """;;
        String dice6 = """
        _________
        |       |
        |   6   |
        |       |
        _________
        """;;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("No roll");
        }
    }
}
