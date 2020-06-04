import java.util.*;
import java.nio.*;
import java.nio.file.Path;
import java.io.FileReader;

class ReadFileLines
{
    public static int findOccurences(String data, String find)
    {
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = data.indexOf(find, fromIndex)) != -1 ){
 
            //System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
            
        }
        return count + 1;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //int n = scanner.nextInt();
        //scanner.nextLine();
        while(true)
        {
            System.out.print("Enter filename: ");
            String path = scanner.nextLine();
            if(path == "")
                break;
            //scanner.nextLine();
            try
            {   
                FileReader file = new FileReader(path);
                String data = "";
                int ch;
                while((ch = file.read()) != -1)  
                    data += (char)ch;
                file.close();
                System.out.println(data);
                System.out.println("Number of Lines: " + ReadFileLines.findOccurences(data, "\n"));
            }
            catch(Exception e)
            {}
        }

        scanner.close();
    }
}
