import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Order
{
    public String customerId, itemNumber;
    Order(String customerId, String itemNumber)
    {
        this.itemNumber = itemNumber;
        this.customerId = customerId;
    }
}

public class CustomerItemOrder
{
    public CreateItemFile itemData;
    public CreateCustomerFile customerData;
    public ArrayList<Order> orders;

    CustomerItemOrder()
    {
        itemData = new CreateItemFile();
        customerData = new CreateCustomerFile();
        orders = new ArrayList<Order>();
        loadData();
    }

    public void loadData()
    {
        try {
            FileReader file = new FileReader("order_data.txt");
            String data = "";
            int ch;
            while((ch = file.read()) != -1)
                data += (char)ch;
            file.close();
            String lines[] = data.split("\n");
            for(int i = 0; i < lines.length; i++)
            {
                String[] lineData = lines[i].split(",");
                orders.add(new Order(lineData[0], lineData[1]));
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
    }

    public void writeData()
    {
        try
        {
            FileWriter file = new FileWriter("order_data.txt");
            String data = "";
            for (int i = 0; i < orders.size(); i++)
                data += orders.get(i).customerId + "," + orders.get(i).itemNumber + "\n";
            file.write(data);
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addOrder(String customerId, String itemNumber)
    {
        Boolean itemNumberExists = false;
        Boolean customerIdExists = false;

        for(int i = 0; i < itemData.items.size(); i++)
            if (itemNumber.equals(itemData.items.get(i).itemNumber))
                itemNumberExists = true;

        for(int i = 0; i < customerData.customers.size(); i++)
            if (customerId.equals(customerData.customers.get(i).id))
                customerIdExists = true;

        if (itemNumberExists && customerIdExists)
        {
            orders.add(new Order(customerId, itemNumber));
            System.out.println("Order added!");
        }
            
        if(!itemNumberExists)
            System.out.println("Item Number doesn't exist.");

        if(!customerIdExists)
            System.out.println("Customer Id doesn't exist.");
    }

    public static void main(String args[])
    {
        CustomerItemOrder obj = new CustomerItemOrder();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Id, Item Number:");
        String customerId = scanner.next();
        String itemNumber = scanner.next();
        obj.addOrder(customerId, itemNumber);
        obj.writeData();
        scanner.close();
    }
}