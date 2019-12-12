import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        InvoiceItem[] items = new InvoiceItem[5];
    
        for (int i = 0; i < 5; i++)
        {
            System.out.println("------ NEW ITEM ------");
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter unit price: ");
            double unitPrice = scanner.nextDouble();

            items[i] = new InvoiceItem(id, description, quantity, unitPrice);
            System.out.println("");
            scanner.nextLine();
        }

        scanner.close();
        
        System.out.println("----- ITEM DETAILS -----");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(items[i].toString());
            System.out.println("Total: "  + items[i].getTotal());
            System.out.println("");
        }

        
    }
}