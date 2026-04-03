public class SmartATM {
    int DAILY_LIMIT = 500; //maximum amount you can withdraw in one day

    public void main(String[] args) { //removed 'static' so we can use the DAILY_LIMIT

        SmartATM calc = new SmartATM(); //new object
		
		//constant varibales
        double balance = 1000;
        double withdrawalAmount = 100; //or 600

        //math
        double totalDeducted = withdrawalAmount + calc.calculateFee(withdrawalAmount); //the money taken out plus the fee
        double amountRemaining = balance - totalDeducted; //how much money you have left after withdrawal
        boolean isEligible = calc.checkEligibility(withdrawalAmount, balance, DAILY_LIMIT); //if you can do this withdrawal
        double feeCalculated = calc.calculateFee(withdrawalAmount); //how much fee you have to pay

        // check if you can withdraw and If not, show an error message
        if (isEligible == true) {
            System.out.println("--- Transaction Authorized --- ");
            System.out.println("Withdrawal Amount: $" + withdrawalAmount);
            System.out.println("Transaction Fee: $" + feeCalculated);
            System.out.println("Total Deducted: $" + totalDeducted);
            System.out.println("Remaining Balance: $" + amountRemaining);
        } else {
            System.out.println("Error: Request exceeds daily limit or insufficient funds.");
            System.out.println("Current Balance: $" + balance);
        }
    }

    // method checks if you are allowed to withdraw the money
    public boolean checkEligibility(double withdrawalAmount, double balance, double DAILY_LIMIT) {
        boolean isEligible;

        if ((withdrawalAmount <= balance) && (withdrawalAmount <= DAILY_LIMIT)) {
            isEligible = true;
        } else {
            isEligible = false;
        }

        return isEligible;
    }
	
	//metods calculates the transaction fees
    public double calculateFee(double withdrawalAmount) {
        double fee;
        if (withdrawalAmount >= 100.01) {
            fee = withdrawalAmount * (2.00 / 100.00);
        } else {
            fee = 1;
        }

        return fee;
    }
}