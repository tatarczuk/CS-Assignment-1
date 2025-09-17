import java.util.Scanner;

public class TrianglePerimeter
{
    public static void main(String[] args)
    {
// Variable declarations
        double side1;
        double side2;
        double side3;
        double perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle: ");
                side1 = input.nextDouble();
                System.out.print("Enter the length of the second side of the triangle: ");
                side2 = input.nextDouble();
        System.out.print("Enter the length of the third side of the triangle: ");
        side3 = input.nextDouble();
        perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}
