import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter password: ");
            String password = scanner.next();
            if ( !password.matches("(.*)([A-Z])(.*)([A-Z])(.*)") 
            || !password.matches("(.*)([a-z])(.*)([a-z])(.*)([a-z])(.*)") 
            || !password.matches("(.*)([0-9])(.*)") )
            {
                System.out.println("Password must contain atleast 2 Uppercase, 3 Lowercase and 1 numerical characters. Try again...");
            }
            else
            {
                System.out.println("Password Accepted!");
                break;
            }
        }
    }
}