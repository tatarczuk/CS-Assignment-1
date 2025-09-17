import java.util.Scanner;

public class GroceryReceipt {
    public static void main(String[] args) {
        double price1;
        double price2;
        double price3;
        String isMember;

        final double GST_RATE = 0.05;
        final double PST_RATE = 0.07;
        final double LOYALTY_DISCOUNT = 0.03;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        price1 = input.nextDouble();
        System.out.println("Enter the price of item 2: ");
        price2 = input.nextDouble();
        System.out.println("Enter the price of item 3: ");
        price3 = input.nextDouble();
        System.out.println("Are you a member? (y/n): ");
        isMember = input.nextLine();

        double subtotal = price1 + price2 + price3;
        double discount = 0;
        if(isMember == "y") {
            discount = -LOYALTY_DISCOUNT * subtotal;
        }

    }
}
