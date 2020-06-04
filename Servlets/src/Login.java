import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends BaseServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");
        String html = BaseServlet.readFile("login.html");    

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();            
        out.println(html);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        
        
        String html = BaseServlet.readFile("profile.html"); 
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(String.format(html, username, password));
    }
}