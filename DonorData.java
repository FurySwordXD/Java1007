import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Donor
{
    public String name, address, contactNumber, bloodGroup;
    public int age;
    public LocalDate lastDonatedDate;

    Donor(String name, int age, String address, String contactNumber, String bloodGroup, LocalDate date)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.lastDonatedDate = date;
    }
}

public class DonorData
{

    public ArrayList<Donor> donors;
    public static DateTimeFormatter dateFormat;
    static{
        dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    DonorData()
    {
        donors = new ArrayList<Donor>();
        
    }

    public void writeData()
    {
        try
        {
            FileWriter file = new FileWriter("donor_data.txt");
            String data = "";
            for (int i = 0; i < donors.size(); i++)
                data += donors.get(i).name + "," + 
                donors.get(i).age + "," +
                donors.get(i).address + "," +
                donors.get(i).contactNumber + "," +
                donors.get(i).bloodGroup + "," + 
                donors.get(i).lastDonatedDate.format(dateFormat) + "\n";
            file.write(data);
            file.close();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
        }
    }

    public void addItem(String name, int age, String address, String contactNumber, String bloodGroup, LocalDate date)
    {
        donors.add(new Donor(name, age, address, contactNumber, bloodGroup, date));
        System.out.println("Donor added!");
    }

    public void loadData()
    {
        try
        {
            FileReader file = new FileReader("donor_data.txt");
            String data = "";
            int ch;
            while((ch = file.read()) != -1)
                data += (char)ch;
            file.close();
            String lines[] = data.split("\n");
            for(int i = 0; i < lines.length; i++)
            {
                String[] lineData = lines[i].split(",");
                donors.add(new Donor(lineData[0], Integer.parseInt(lineData[1]), 
                lineData[2], lineData[3], lineData[4], LocalDate.parse(lineData[5], dateFormat)));
            }
            file.close();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
        }  
    }

    public static void main(String args[])
    {
        DonorData d = new DonorData();
        d.loadData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name, age, bloodgroup and last donated date:");
        
        String name, address = "Const addr", contactNumber = "789451612", bloodGroup;
        int age;
        LocalDate date;

        name = scanner.next();
        age = scanner.nextInt();
        bloodGroup = scanner.next();
        date = LocalDate.parse(scanner.next(), DonorData.dateFormat);
        d.addItem(name, age, address, contactNumber, bloodGroup, date);
        
        d.writeData();
        scanner.close();
    }

}
