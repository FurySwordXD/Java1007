import java.util.Scanner;

public class EventDemo
{
    public static void main(String args[])
    {
        Event e1 = new Event();
        e1.display();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Event name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();

        Event e2 = new Event(name, guests);
        e2.display();
    }
}