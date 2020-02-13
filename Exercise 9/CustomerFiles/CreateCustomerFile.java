import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Customer
{
    public String id, name, zip;
    Customer(String id, String name, String zip)
    {
        this.id = id;
        this.name = name;
        this.zip = zip;
    }
}

public class CreateCustomerFile
{

    public ArrayList<Customer> customers;

    CreateCustomerFile()
    {
        customers = new ArrayList<Customer>();
        loadData();
    }

    public void loadData()
    {
        try {
            FileReader file = new FileReader("customer_data.txt");
            String data = "";
            int ch;
            while((ch = file.read()) != -1)
                data += (char)ch;
            file.close();
            String lines[] = data.split("\n");
            for(int i = 0; i < lines.length; i++)
            {
                String[] lineData = lines[i].split(",");
                customers.add(new Customer(lineData[0], lineData[1], lineData[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void writeData()
    {
        try
        {
            FileWriter file = new FileWriter("customer_data.txt");
            String data = "";
            for (int i = 0; i < customers.size(); i++)
                data += customers.get(i).id + "," + customers.get(i).name + "," + customers.get(i).zip + "\n";
            file.write(data);
            file.close();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
        }
    }

    public void addCustomer(String id, String name, String zip)
    {
        for(int i = 0; i < customers.size(); i++)
        {
            if (id.equals(customers.get(i).id))
            {
                System.out.println("ID already exists!");
                return;
            }
        }
        customers.add(new Customer(id, name, zip));
        System.out.println("Customer added!");
    }

    public static void main(String args[])
    {
        CreateCustomerFile obj = new CreateCustomerFile();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID, Name and Zip:");
        String id = scanner.next();
        String name = scanner.next();
        String zip = scanner.next();
        obj.addCustomer(id, name, zip);
        obj.writeData();
        scanner.close();
    }
}