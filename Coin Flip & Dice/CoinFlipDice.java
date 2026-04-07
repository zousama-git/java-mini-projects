import java.util.Random;

public class CoinFlipDice {
    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(1, 7);
        double number2 = random.nextDouble(1, 3);
        boolean isHead = random.nextBoolean();

        System.out.println("Dice roll: " + number1);
        System.out.println("Random double (1-3): " + number2);

        if (isHead) {
            System.out.println("Coin flip: Heads");
        } else {
            System.out.println("Coin flip: Tails");
        }
    }
}
