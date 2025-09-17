import java.util.Scanner;

public class TrianglePerimeter
{
    public static void main(String[] args)
    {
        // Variable declarations
        double side1;
        double side2; // was missing semicolon
        double side3;
        double perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle: ");
        side1 = input.nextDouble(); // was "nextInteger();" instead of "nextDouble();"
        System.out.print("Enter the length of the second side of the triangle: "); // was missing semicolon
        side2 = input.nextDouble();
        System.out.print("Enter the length of the third side of the triangle: ");
        side3 = input.nextDouble();
        perimeter = side1 + side2 + side3; // "=" was "==", was missing semicolon
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}
