import java.io.FileInputStream;
import java.util.Scanner;

class CheckValidDigits
{
    public String readFile()
    {
        String data = "";
        try
        {
            FileInputStream file = new FileInputStream("./data.txt");
            int ch;
            while((ch = file.read()) != -1)
                data += (char)ch;
            
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return data;
    }

    public Boolean checkValid(String account)
    {
        //System.out.print(account);
        long sumFirstFive = 0;
        for (int i = 0; i < 5; i++)
            sumFirstFive += Long.parseLong(account.substring(i, i+1));
        sumFirstFive %= 10;
        long lastDigit = Long.parseLong(account.substring(5, 6));

        if (sumFirstFive == lastDigit)
        {
            System.out.println(account + " is valid");
            return true;
        }
        
        return false;
    }

    public static void main(String args[])
    {
        CheckValidDigits obj = new CheckValidDigits();
        
        String fileData = obj.readFile();
        
        Scanner scanner = new Scanner(fileData);
        while (scanner.hasNext())
            obj.checkValid(scanner.next());

        scanner.close();
    }
}