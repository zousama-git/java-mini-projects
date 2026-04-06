package Test1;

import java.util.Scanner;

public class BudgetTracker{
	public static void main(String[] args){
		
		//call scanner method and assign to input
		Scanner input = new Scanner(System.in);
		
		//declaring and assigning variables
		//user information
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your income: ");
		double income = input.nextDouble();
		input.nextLine();
		
		//expenses 1 to 4
		System.out.print("Expense 1 name: ");
		String expense1 = input.nextLine();
		System.out.print("Expense 1 price: ");
		double expense1price = input.nextDouble();
		input.nextLine();
		
		System.out.print("Expense 2 name: ");
		String expense2 = input.nextLine();
		System.out.print("Expense 2 price: ");
		double expense2price = input.nextDouble();
		input.nextLine();
		
		System.out.print("Expense 3 name: ");
		String expense3 = input.nextLine();
		System.out.print("Expense 3 price: ");
		double expense3price = input.nextDouble();
		input.nextLine();
		
		System.out.print("Expense 4 name: ");
		String expense4 = input.nextLine();
		System.out.print("Expense 4 price: ");
		double expense4price = input.nextDouble();
		input.nextLine();
		
		//calculations
		double totalExpense = expense1price+expense2price+expense3price+expense4price;
		double remainingBalance = income-totalExpense;
		double incomeLeftPercent = (totalExpense/income)*100;
		char percent = '%';
		
		//output
		System.out.printf("\n---Budget Report for %s ---\n", name);
		System.out.printf("Income: R%,.2f\n", income);
		System.out.printf("%s : R%,.2f\n",expense1,expense1price);
		System.out.printf("%s : R%,.2f\n",expense2,expense2price);
		System.out.printf("%s : R%,.2f\n",expense3,expense3price);
		System.out.printf("%s : R%,.2f\n",expense4,expense4price);
		System.out.printf("Total Spent: R%,.2f\n", totalExpense);
		System.out.printf("Remaining: R%,.2f\n", remainingBalance);
		System.out.printf("Spent: %.2f%c of income\n", incomeLeftPercent,percent);	
		
		//overspent warning
		if (income <= totalExpense) {
			System.out.print("You are over budget");
		}
		else{
			System.out.print(" You are within budget");
		}
		
		//stop scanning
		input.close();
	}
}