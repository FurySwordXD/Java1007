import java.sql.*;
import java.util.*;

class JavaSQL
{
    public static void main(String[] args) {
        
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("Sainath", "CEO");
        dataMap.put("Karthik", "Manager");
        dataMap.put("Vignesh", "Manager");
        dataMap.put("Siddarth", "Manager");
        dataMap.put("SriHari", "Clerk");
        dataMap.put("Bevin", "Clerk");
        dataMap.put("Maheshvar", "Clerk");
        dataMap.put("ShyamB", "Clerk");

        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");
            Statement statement = con.createStatement();

            String sql;


            for (HashMap.Entry<String, String> entry : dataMap.entrySet())  
            {
                try
                {
                    sql = "INSERT INTO emp VALUES ('" + entry.getKey() + "', '" + entry.getValue() + "')";
                    statement.executeUpdate(sql);
                }   
                catch(SQLException e) {}
            }

            sql = "UPDATE emp SET Desg='Manager' WHERE Desg='MGR'";
            statement.executeUpdate(sql); 
            
            ResultSet rs;

            sql = "SELECT Name FROM EMP WHERE Desg='Manager'";
            rs = statement.executeQuery(sql);  
            System.out.print("Managers: ");
            while (rs.next()) {  
                System.out.print(rs.getString(1)+ ", ");  
            }
            System.out.println("");

            sql = "SELECT DISTINCT(Desg) FROM EMP";
            rs = statement.executeQuery(sql);  
            System.out.print("Designations: ");
            while (rs.next()) {  
                System.out.print(rs.getString(1) + ", ");  
            } 
            System.out.println("");
            
            sql = "UPDATE emp SET Desg='MGR' WHERE Desg='Manager'";
            statement.executeUpdate(sql);   

            sql = "SELECT DISTINCT(Desg) FROM EMP";
            rs = statement.executeQuery(sql);  
            System.out.print("Designations (After update): ");
            while (rs.next()) {  
                System.out.print(rs.getString(1) + ", ");  
            } 
            System.out.println("");

            sql = "DELETE FROM emp WHERE Desg='Clerk'";
            int affectedRows = statement.executeUpdate(sql);
            System.out.println("Deleted " + affectedRows + " rows");

            con.close();
        }
        catch(Exception e){ e.printStackTrace(); }
    }
}