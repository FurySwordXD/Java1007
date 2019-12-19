import java.util.Scanner;

public class Faculty extends CollegeEmployee
{
    private Boolean tenured;

    public void setData(Scanner scanner)
    {
        super.setData(scanner);
        System.out.print("Is the faculty tenured? ");
        tenured = scanner.nextBoolean();
        System.out.println("---Faculty SET---");
    }

    public void display()
    {
        System.out.println("--- FACULTY ---");
        super.display();
        System.out.println("Tenured: " + tenured);
        System.out.println("");
    }
}