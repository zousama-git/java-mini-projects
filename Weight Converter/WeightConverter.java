import java.util.Scanner;
public class WeightConverter {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int option, weight;
		double converted;
		String conversion;

		System.out.println("Weight Conversion Program");
		System.out.println ("1. Convert lbs to kgs" );
		System.out.println ("2. Convert kgsto lbs" );
		System.out.print ("Choose an option: " );
		option = input.nextInt();

		if (option == 1){
			conversion = "lbs";
			System.out.printf("enter the weight in %s: ", conversion);
			weight = input.nextInt();
			converted = weight/2.20462;
			System.out.printf("Your new weight in kgs is: %.2f",converted );
		}
		else if (option == 2) {
			conversion = "kgs";
			System.out.printf("enter the weight in %s: ", conversion);
			weight = input.nextInt();
			converted = weight*2.20462;
			System.out.printf("Your new weight in kgs is: %.2f",converted );
		}
		else{
			System.out.println ("Invalid Choice!" );
		}

		input.close();
	}
}
