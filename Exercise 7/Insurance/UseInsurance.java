import java.util.Scanner;

public class UseInsurance
{
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type of insurance (life or health): ");
        String type = scanner.next();
        Insurance i = null;
        if (type.equals("life"))
            i = new LifeInsurance();
        else if (type.equals("health"))
            i = new HealthInsurance();

        if (i != null)
        {
            i.setCost();
            i.display();
        }
    }
}