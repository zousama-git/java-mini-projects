import java.util.Scanner;

public class PasswordStrengthChecker {
	public static void main(String[] args){
		
		//scanner assigned to input
		Scanner input = new Scanner(System.in);
		
		//password input
		System.out.print("Enter password: ");
		String password = input.nextLine();
		
		//variables
		boolean pwNumber;
		boolean pwLength;
		boolean pwSpecial;
		boolean pwCase;
		int pwRequirements = 0;
		int pwStrength=0;
		String pwStrengthText;
		
		
		//criteria
		//has more than 8 characters
		if (password.length() >= 8) {
			pwLength = true;
			pwStrength+=1;
		} 
		else {
			pwLength = false;
		}
		
		//has uppercase
		if (password.matches(".*[A-Z].*")) {
			pwCase = true; 
			pwStrength+=1;
		}
		else {
			pwCase = false;
		}
		
		//has number
		if (password.matches(".*[0-9]*.")) {
			pwNumber = true; 
			pwStrength+=1;
		}
		else {
			pwNumber = false;
		}
		
		//has special character
		if ((!password.matches(".*[A-Z].*"))&&(!password.matches(".*[0-9].*"))&&(!password.matches(".*[a-z].*"))){
			pwSpecial = true; 
			pwStrength+=1;
		}
		else {
			pwSpecial=false;
		}
		
		//strength
		if ((pwStrength == 0) || (pwStrength == 1) || (pwStrength == 2)){
			pwStrengthText="weak";
		}
		else if (pwStrength == 3){
			pwStrengthText = "medium";
		}
		else {
			pwStrengthText = "strong";
		}
		
		System.out.println("Strength: "+pwStrengthText);
		
		//missing criteria
		if (!pwLength){
			System.out.println("- Must be at least 8 characters");
		}
		else{
			pwRequirements +=1;
		}
		 if (!pwCase){
			System.out.println("- Must contain an uppercase letter");
		}
		else{
			pwRequirements +=1;
		}
		 if (!pwNumber){
			System.out.println("- Must contain a number");
		}
		else{
			pwRequirements +=1;
		}
		 if (!pwSpecial){
			System.out.println("- Must contain a special character (!@#$%)");
		}
		else{
			pwRequirements +=1;
		}
		
		
		if (pwRequirements == 4){
			System.out.print("All requirements are met");
		}
		else{
			System.out.print("Strengthen your password");
		}
		
		input.close();
	}
}