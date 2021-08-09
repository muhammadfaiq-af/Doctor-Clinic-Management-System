import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Connect 
{
static Connection con = null;
public static Connection connectDatabase()
    {
       try
       {
           String msAccdb = "E:/Clinic Management.accdb";
           String dbURL= "jdbc:ucanaccess://" + msAccdb;
        con = DriverManager.getConnection(dbURL);
        return con;
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
           return null;
       }  
    }   
}