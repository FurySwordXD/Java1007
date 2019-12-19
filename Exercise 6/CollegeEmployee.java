import java.util.Scanner;

class CollegeEmployee extends Person
{
    private String socialSecurity, department;
    private double salary;

    public void setData(Scanner scanner)
    {
        super.setData(scanner);
        System.out.print("Enter Social Security Number: ");
        socialSecurity = scanner.next();
        System.out.print("Enter Department: ");
        department = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Annual Salary: ");
        salary = scanner.nextDouble();
        System.out.println("---College Employee SET---");
    }

    public void display()
    {
        System.out.println("--- COLLEGE EMPLOYEE ---");
        super.display();
        System.out.println("SSN: " + socialSecurity + "\nDept: " + department + "\tSalary: " + salary);
        System.out.println("");
    }
}