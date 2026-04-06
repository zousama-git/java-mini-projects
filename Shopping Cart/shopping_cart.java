import java.util.Scanner;

public class shopping_cart {
    public void main(String[]args){
        String item;
        double price, total;
        int quantity;

        //Error was here
        char currency = 'R';

        //error was here
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total=price* quantity;

        //forgot \n for neatness
        System.out.println("\n You have bought "+ quantity +" "+item+"/s");
        System.out.println("Your total is "+currency+total);

        //second error was here
        scanner.close();
    }
}
