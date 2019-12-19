import java.util.Scanner;

public class Person
{
    private String firstName, lastName, address, zipCode, phoneNo;

    public void setData(Scanner scanner)
    {
        System.out.print("Enter Name: ");
        firstName = scanner.next();
        lastName = scanner.next();
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Zip Code: ");
        zipCode = scanner.next();
        System.out.print("Enter Phone Number: ");
        phoneNo = scanner.next();
        System.out.println("---Person SET---");
    }

    public void display()
    {
        System.out.println("Name: " + firstName + " " + lastName + "\nAddress: " + address + ", " + zipCode + "\nPhone: " + phoneNo);
    }

}