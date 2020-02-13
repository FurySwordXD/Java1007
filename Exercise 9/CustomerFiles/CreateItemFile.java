import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Item
{
    public String itemNumber, name;
    Item(String itemNumber, String name)
    {
        this.itemNumber = itemNumber;
        this.name = name;
    }
}

public class CreateItemFile
{

    public ArrayList<Item> items;

    CreateItemFile()
    {
        items = new ArrayList<Item>();
        loadData();
    }

    public void loadData()
    {
        try {
            FileReader file = new FileReader("item_data.txt");
            String data = "";
            int ch;
            while((ch = file.read()) != -1)
                data += (char)ch;
            file.close();
            String lines[] = data.split("\n");
            for(int i = 0; i < lines.length; i++)
            {
                String[] lineData = lines[i].split(",");
                items.add(new Item(lineData[0], lineData[1]));
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
    }

    public void writeData()
    {
        try
        {
            FileWriter file = new FileWriter("item_data.txt");
            String data = "";
            for (int i = 0; i < items.size(); i++)
                data += items.get(i).itemNumber + "," + items.get(i).name + "\n";
            file.write(data);
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addItem(String itemNumber, String name)
    {
        for(int i = 0; i < items.size(); i++)
        {
            if (itemNumber.equals(items.get(i).itemNumber))
            {
                System.out.println("Item number already exists!");
                return;
            }
        }
        items.add(new Item(itemNumber, name));
        System.out.println("Item added!");
    }

    public static void main(String args[])
    {
        CreateItemFile obj = new CreateItemFile();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Item Number, Name:");
        String itemNumber = scanner.next();
        String name = scanner.next();
        obj.addItem(itemNumber, name);
        obj.writeData();
        scanner.close();
    }
}