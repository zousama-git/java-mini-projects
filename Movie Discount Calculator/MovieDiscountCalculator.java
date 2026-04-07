public class MovieDiscountCalculator {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior and student discount 30%");
                price *= 0.7;
                System.out.printf("You pay R%.2f", price);
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
                System.out.printf("You pay R%.2f", price);
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount 20%");
                price *= 0.8;
                System.out.printf("You pay R%.2f", price);
            } else {
                System.out.printf("You pay is R%.2f", price);
            }
        }
    }
}
