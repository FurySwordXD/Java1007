import java.io.IOException;
import java.io.PrintWriter;

import java.io.FileReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet
{

    public static String readFile(String fileName)
    {
        
        try
        {
            String base_dir = "../../templates/";    
            FileReader file = new FileReader(base_dir + fileName);
            int i; 
            String html = "";
            while ((i=file.read()) != -1) 
                html += (char)i;

            return html;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");
        
        String html = BaseServlet.readFile("templates/base.html");
        System.out.println(html);

        PrintWriter out = response.getWriter();
        String title = "Using GET Method to Read Form Data";
        String docType =
            "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
            
        out.println(html);
    }

    public static void main(String args[])
    {
        System.out.print(BaseServlet.readFile("templates/base.html"));
    }
}