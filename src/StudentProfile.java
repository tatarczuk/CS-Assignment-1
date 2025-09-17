import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        String name;
        int yearOfStudy;
        double gpa;
        int creditsCompleted;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter year of study: ");
        yearOfStudy = input.nextInt();
        System.out.println("Enter GPA: ");
        gpa = input.nextDouble();
        System.out.println("Enter credits completed: ");
        creditsCompleted = input.nextInt();

        System.out.println("Name: " + name + "  Year: " + yearOfStudy + "   GPA: " + gpa + "    Credits Completed: " + creditsCompleted);

    }
}
