import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Billing b = new Billing();

        Scanner scanner = new Scanner(System.in);

        double price, coupon;
        int quantity;

        System.out.print("Enter price of book: ");
        price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        System.out.print("Enter coupon Value: ");
        coupon = scanner.nextDouble();

        System.out.println("Total due for one book: " + b.computeBill(price));
        System.out.println("Total due for " + quantity + " book(s): " + b.computeBill(price, quantity));
        System.out.println("Total due for " + quantity + " book(s) with coupon: " + b.computeBill(price, quantity, coupon));
    }
}