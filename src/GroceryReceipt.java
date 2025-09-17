import java.util.Scanner;

public class GroceryReceipt {
    public static void main(String[] args) {
        float price1, price2, price3;
        String isMember;

        // constants
        final float GST_RATE = 0.05f;
        final float PST_RATE = 0.07f;
        final float LOYALTY_DISCOUNT = 0.03f;

        // ask required information
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        price1 = input.nextFloat();
        System.out.println("Enter the price of item 2: ");
        price2 = input.nextFloat();
        System.out.println("Enter the price of item 3: ");
        price3 = input.nextFloat();
        System.out.println("Are you a member? (y/n): ");
        // make sure to read the next line before input for "isMember"
        input.nextLine();
        isMember = input.nextLine();

        // add prices for subtotal
        float subtotal = price1 + price2 + price3;
        // discount default is 0, ability to add onto it later
        float discount = 0;
        if(isMember.equals("y")) {
            // calculates loyalty discount
            discount = -LOYALTY_DISCOUNT * subtotal;
        }
        // takes away discount from subtotal for taxable amount
        float taxableAmount = subtotal + discount;
        // calculates gst
        float gst = taxableAmount * GST_RATE;
        //calculates pst
        float pst = taxableAmount * PST_RATE;
        // adds pst and gst to taxable amount for total
        float total = taxableAmount + gst + pst;

        // format and output the calculations
        System.out.println("Subtotal: " + convToCAD(subtotal));
        System.out.println("Loyalty discount: " + convToCAD(discount));
        System.out.println("Taxable amount: " + convToCAD(taxableAmount));
        System.out.println("GST: " + convToCAD(gst));
        System.out.println("PST: " + convToCAD(pst));
        System.out.println("Total: " + convToCAD(total));


    }

    // convert doubles to strings formatted for CAD
    private static String convToCAD(float n) {
        String s = "";
        float abs = n;
        // require the double to be absolute so the sign can be put behind the "$" symbol
        if (n < 0f) {
            s += '-';
            abs *= -1f;
        }
        abs = Math.round(abs*100.0f)/100.0f;
        s += "$"+abs+" CAD";
        return s;
    }
}
