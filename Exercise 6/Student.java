import java.util.Scanner;

public class Student extends Person
{
    private String major;
    private float gpa;

    public void setData(Scanner scanner)
    {
        super.setData(scanner);
        System.out.print("Enter Major: ");
        major = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter GPA: ");
        gpa = scanner.nextFloat();
        System.out.println("---Student SET---");
    }

    public void display()
    {
        System.out.println("--- STUDENT ---");
        super.display();
        System.out.println("Major: " + major + "\nGPA: " + gpa);
        System.out.println("");
    }
}