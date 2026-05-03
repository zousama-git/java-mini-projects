import java.util.Scanner;
import java.util.Random;

public class RPS{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		String comChoiceArray []= {"rock","paper","scissors"};
		
		char option = 'N';
		
		outer:
		do{
			System.out.print("Enter your move (rock, paper, scissors): ");
			String userChoice = input.nextLine().toLowerCase();
			
			if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
				System.out.print("Invalid choice");
				break outer;
			}
			
			String comChoice = comChoiceArray[random.nextInt(3)];
			System.out.println("Computer choice: "+ comChoice);
			
			if (userChoice.equals(comChoice)) System.out.println("Tie");
			else if ((userChoice=="rock" && comChoice=="paper") 
						|| (userChoice=="paper" && comChoice=="scissors") 
						|| (userChoice=="scissors" && comChoice=="rock")) 
				System.out.println("You lose!");
			else System.out.println("You win!");

			System.out.print("Play again? (Y/N): ");
			option = input.nextLine().toUpperCase().charAt(0);
		}
		while (option == 'N');
		
		input.close();
	}
}