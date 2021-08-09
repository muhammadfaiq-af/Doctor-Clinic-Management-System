import java.awt.Color;
import javax.swing.JOptionPane;
public class Main 
{
    public static void main(String[] args) 
    {
        SplashScreen s = new SplashScreen();
        Login g = new Login();
        s.setVisible(true);
        for(int i = 0; i <= 100; i++)
        {
        try
        {
        Thread.sleep(40);
        s.lblProgress.setText(i+"%");
        s.progressBar.setValue(i);
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        }
        g.setVisible(true);
        g.getContentPane().setBackground(Color.BLACK);
        s.dispose();   
    }   
}
