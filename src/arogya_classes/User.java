/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import arogya.UI.Login;
import arogya.UI.Login;
import arogya.UI.Menu;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import arogya.ArogyaFinal;
import arogya.UI.Menu;
import arogya.DB;
import arogya.DB;
import java.util.concurrent.TimeUnit;
import arogya.UI.Supdate;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import javax.swing.UIManager;
import arogya.UI.Supdate;
/**
 *
 * @author vimuk
 */

public class User {
 

     String name,pass;
    public static Connection connection;
  
     public static void User() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya","root","");
            //"jdbc:mysql://localhost:3306/tecvision", "root", "123"
          
        } catch (Exception e) {
        }

    }

   

    public static String userlogin(String a, String b) throws SQLException, InterruptedException {
        
      //  name = String.valueOf(a)
           
        System.out.print(a);
        System.out.print(b);
      //  return null;
        
     Statement stmt=connection.createStatement();  
     Login m1 = new Login(); Login m2 = new Login(); 
     ResultSet rs=stmt.executeQuery("select * from user_log"); 
     while(rs.next())  
    // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
     
     if(a.equals(rs.getString(2))){
         if(b.equals(rs.getString(3))){
         
    
    
         Menu m = new Menu();
         m.setVisible(true);
         m.displayName(a);
         m.sentBmi(a);
         m2.dispose();
         m1.dispose();
         connection.close();
     }else{
         
         m1.setVisible(true);
       
         }
          
     }else{
            m1.dispose(); m2.setVisible(true);
            
     }
       
        connection.close();
         return null;
     
    }
    
    
    private void userRegistration(String nic,String uname,String pass,String mail,String dob,String gender,String hi,String we,String fn,String ln) throws SQLException, ClassNotFoundException {
    
        System.out.println("yyyyyyy");
        float hif = Float.parseFloat(hi);
        float wef = Float.parseFloat(we);
        DB.Execute("INSERT INTO user_log VALUES('" + nic + "','" + uname + "','" + pass + "','" + mail + "','" + dob + "','" + gender + "','" + hif + "','" + wef + "','" + fn + "','" + ln + "',101)");
    // (Username,Password,User_email,User_dob,User_gender,User_height,User_weight,User_fname,User_lname)
        new Supdate().setVisible(true);
    
 
    }
    
    private void userUpdate(String nic,String uname,String pass,String mail,String dob,String gender,String hi,String we,String fn,String ln) throws ClassNotFoundException, SQLException{
         float hif = Float.parseFloat(hi);
        float wef = Float.parseFloat(we);
        int i = 101;
      DB.Execute("UPDATE user_log SET User_id='" + nic + "',Username='" + uname + "',Password='" + pass + "',User_email='" + mail + "',User_gender='" + gender + "',User_height='" + hif + "',User_weight='" + wef + "',User_fname='" + fn + "',User_lname='" + ln + "',Admin_id='" + i + "' WHERE User_id='" + nic + "'");
      Supdate su = new Supdate();
      su.setVisible(true);
    }
    
    
    
    
}
           

 


