import java.util.Scanner;

public class GroceryReceipt {
    public static void main(String[] args) {
        double price1;
        double price2;
        double price3;
        String isMember;

        // constants
        final double GST_RATE = 0.05;
        final double PST_RATE = 0.07;
        final double LOYALTY_DISCOUNT = 0.03;

        // ask required information
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        price1 = input.nextDouble();
        System.out.println("Enter the price of item 2: ");
        price2 = input.nextDouble();
        System.out.println("Enter the price of item 3: ");
        price3 = input.nextDouble();
        System.out.println("Are you a member? (y/n): ");
        // make sure to read the next line before input for "isMember"
        input.nextLine();
        isMember = input.nextLine();

        // calculations
        double subtotal = price1 + price2 + price3;
        double discount = 0;
        if(isMember.equals("y")) {
            discount = -LOYALTY_DISCOUNT * subtotal;
        }
        double taxableAmount = subtotal + discount;
        double gst = taxableAmount * GST_RATE;
        double pst = taxableAmount * PST_RATE;
        double total = taxableAmount + gst + pst;

        // format and output the calculations
        System.out.println("Subtotal: " + convToCAD(subtotal));
        System.out.println("Loyalty discount: " + convToCAD(discount));
        System.out.println("Taxable amount: " + convToCAD(taxableAmount));
        System.out.println("GST: " + convToCAD(gst));
        System.out.println("PST: " + convToCAD(pst));
        System.out.println("Total: " + convToCAD(total));


    }

    // convert doubles to strings formatted for CAD
    private static String convToCAD(double n) {
        String s = "";
        double abs = n;
        // require the double to be absolute so the sign can be put behind the "$" symbol
        if (n < 0) {
            s += '-';
            abs *= -1;
        }
        abs = Math.round(abs*100.0)/100.0;
        s += "$"+abs+" CAD";
        return s;
    }
}
