import java.util.*;
import java.io.*;

public class Phonebook {
    
    public ArrayList<String> phoneNumbers;

    public Phonebook()
    {
        phoneNumbers = new ArrayList<String>();
    }

    public void writeData()
    {
        try
        {
            FileWriter file = new FileWriter("phone_data.txt");
            String data = "";            
            for (String phone : phoneNumbers)
                data += phone + "\n";
            file.write(data);
            file.close();
        }
        catch (Exception e) {}
    }

    public void loadData()
    {
        try
        {
            FileReader file = new FileReader("phone_data.txt");
            String data = "";
            int ch;
            while((ch = file.read()) != -1)
                data += (char)ch;
            file.close();
            String lines[] = data.split("\n");
            for(int i = 0; i < lines.length; i++)
                phoneNumbers.add(lines[i]);
            file.close();
        }
        catch (Exception e) {}  
    }

    public static void main(String args[])
    {
        Phonebook p = new Phonebook();
        p.loadData();

        Scanner scanner = new Scanner(System.in);

        String input; int choice;
        while(true)
        {
            System.out.println("1. Find | 2. Add | 3. Remove | 4. List | 5. Exit");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1: input = scanner.next(); 
                        System.out.println(p.phoneNumbers.indexOf(input));
                        break;
                case 2: input = scanner.next();

                        p.phoneNumbers.add(input);
                        p.writeData();
                        System.out.println("Added to Phonebook");
                        break;
                case 3: input = scanner.next();
                        p.phoneNumbers.remove(input);
                        p.writeData();
                        System.out.println("Removed from Phonebook");
                        break;
                case 4: System.out.println("--- LIST ---");
                        p.phoneNumbers.forEach((number) -> System.out.println(number));
                        break;
                case 5: System.exit(0);
                        System.out.println("Exiting...");                        
                default: break;
            }
        }
    }
}