import java.io.FileInputStream;

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
        long sumFirstFive = 0;
        for (int i = 0; i < 5; i++)
            sumFirstFive += Long.parseLong(account.substring(i, i+1));
        sumFirstFive %= 10;
        long lastDigit = Long.parseLong(account.substring(5, 6));

        if (sumFirstFive == lastDigit)
            return true;

        return false;
    }

    public static void main(String args[])
    {
        CheckValidDigits obj = new CheckValidDigits();
        
        String[] accounts = obj.readFile().split("\n");
        for (int i = 0; i < accounts.length; i++)
        {   
            if (obj.checkValid(accounts[i]))
                System.out.println(accounts[i] + " is valid.");
        }
    }
}