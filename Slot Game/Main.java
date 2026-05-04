import java.util.Scanner;
import java.util.Random;
//blanace needs fixing 
public class Main{
	static int balance = 1000, amount =0;
	static char option = 'N';
	
	static String cherries = "\uD83C\uDF52";
	static String watermelon = "\uD83C\uDF49"; 
	static String lemon = "\uD83C\uDF4B"; 
	static String bell = "\uD83D\uDD14"; 
	static String star = "\u2B50";
	
	static String[] symbols = {cherries, watermelon, lemon, bell, star};
	
	public static void main(String[] args){
		System.out.println("*************************");
		System.out.println("  WELCOME TO JAVA SLOTS ");
		System.out.printf(" SYMBOLS:  %s %s %s %s %s\n", cherries, watermelon, lemon, bell, star);
		System.out.println("*************************");
		
		do{
			displayMenu();
			displayResults();
			continueGame();
		} while (option == 'Y');
		
		scannerCLoser();
	}
	
	static void displayMenu(){
		Scanner input = new Scanner(System.in);
		
		balance-=amount;
		
		System.out.printf("Current Balance: R%d\n", balance);
		
		System.out.print("Place your bet amount:");
		amount = input.nextInt();
		
		System.out.println("Spinning....");		
	}
	
	static void displayResults(){
		Random random = new Random();
		int wins = 0, index = 0, point1=0,point2=0,point3=0;
		String results = "";

		for(int i = 0; i<3;i++){
			index = random.nextInt(0,5);
			switch (i){
			case 0 ->	point1 = index;
			case 1 ->	point2 = index;
			case 2 ->	point3 = index;
			}
			
			String point = symbols[random.nextInt(0,5)];
			results += point;
			results += " |";
			
			if (i == 2) break;
			
			switch (point) {
				case "\u2B50" -> wins+=10;
				case "\uD83D\uDD14" -> wins+=5;
				case "\uD83C\uDF49", "\uD83C\uDF52", "\uD83C\uDF4B" -> wins+=2;
            default -> wins+=0;	
			}
		}
		
		System.out.println("\n***********");
		System.out.println(results);
		System.out.println("***********\n");
		
		if (point1==point2 && point1==point3){
			
			System.out.println("You won this round!");		
			balance +=wins;
			
		} else{System.out.println("Sorry you lost this round!");}
	}
	
	static void continueGame(){
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to continue: (Y/N): ");
		option = input.nextLine().toUpperCase().charAt(0);
		System.out.println("");
	}
	
	static void scannerCLoser(){
		Scanner input = new Scanner(System.in);
		input.close();
	}
}