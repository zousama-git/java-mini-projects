import  java.util.Scanner;
public class TempConvert {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int option;
		double calculation, weight;
		String optionText;

		System.out.println ("Weight Conversion program" );
		System.out.println ("1. Convert lbs to kgs" );
		System.out.println ("2. Convert kgs to lbs" );
		System.out.print("Choose an option: " );
		option = input.nextInt();


		input.nextLine();

		if (option == 1) {
			optionText ="kgs";
			System.out.printf ("Enter the weight in %s: ",optionText );
			weight = input.nextInt();
			calculation = weight/2.20462;
			System.out.printf ("The new weight in %s is: %.2f", optionText, calculation );
		}
		else if (option == 2) {
			optionText = "lbs";
			System.out.printf ("Enter the weight in %s: ",optionText );
			weight = input.nextInt();
			calculation = weight * 2.20462;
			System.out.printf ( "The new weight in %s is: %.2f" , optionText , calculation );
		}
		else {
			System.out.println ("Invalid option" );
		}
		input.close();
	}
}
