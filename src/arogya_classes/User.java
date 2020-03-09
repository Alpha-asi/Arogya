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
import arogya.UI.AdminControlPanel;
import java.util.concurrent.TimeUnit;
import arogya.UI.Supdate;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import javax.swing.UIManager;
import arogya.UI.Supdate;
import arogya.UI.View;
import arogya.UI.Adminpanel;
import arogya.UI.previousData;

/**
 *
 * @author vimuk
 */

public class User {
 
private String x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,adminUsername;
  //
    public static Connection connection;
  
     public static void User() throws ClassNotFoundException, SQLException {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya","root","");
            //"jdbc:mysql://localhost:3306/tecvision", "root", "123"
          
        } 
        catch (Exception e) 
        {
            
        }

    }

   

    public static String userlogin(String a, String b) throws SQLException, InterruptedException, ClassNotFoundException {
        
      //  name = String.valueOf(a)
           
        System.out.print(a);
        System.out.print(b);
      //  return null;
       Adminpanel ap = new Adminpanel(); 
     Adminpanel ap1 = new Adminpanel();
     Login m1 = new Login(); Login m2 = new Login(); 
     ResultSet rs=DB.search("select * from user_log"); 
     while(rs.next())  {
    // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
     
     if(a.equals(rs.getString(2))){
         if(b.equals(rs.getString(3))){
         Menu menu = new Menu();
         menu.displayName(a);
         menu.setVisible(true);
         }else {
             
             ResultSet rsad=DB.search("select * from admin_log"); 
             while(rsad.next())  {
                 if(a.equals(rsad.getString(2))){
                       if(b.equals(rsad.getString(3))){
                       
                       ap1.disAdminName(a);
                       ap1.setVisible(true);
                       ap.dispose();
                       }
                 
                 
                 }
             
             
             }
         
         
         
         }
     }else{
     
        ResultSet rsad=DB.search("select * from admin_log"); 
             while(rsad.next())  {
                 if(a.equals(rsad.getString(2))){
                       if(b.equals(rsad.getString(3))){
                       
                       ap.disAdminName(a);
                       ap.setVisible(true);
                       ap1.dispose();
                       
                       }
                 
                 
                 }
             
             
             }
     
     
     }

    }
    return null;
    }
    
    public void userRegistration(String nic,String uname,String pass,String mail,String dob,String gender,String hi,String we,String fn,String ln) throws SQLException, ClassNotFoundException {
    
        System.out.println(nic);
        System.out.println(uname);
        System.out.println(pass);
        System.out.println(mail);
        System.out.println(dob);
        System.out.println(gender);
        System.out.println(hi);
        
        System.out.println("yyyyyyy");
        float hif = Float.parseFloat(hi);
        float wef = Float.parseFloat(we);
        DB.Execute("INSERT INTO user_log VALUES('" + nic + "','" + uname + "','" + pass + "','" + mail + "','" + dob + "','" + gender + "','" + hif + "','" + wef + "','" + fn + "','" + ln + "',101)");
    // (Username,Password,User_email,User_dob,User_gender,User_height,User_weight,User_fname,User_lname)
        
 
    }
    
    public void userUpdate(String nic,String uname,String pass,String mail,String dob,String gender,String hi,String we,String fn,String ln,String usr) throws ClassNotFoundException, SQLException{
        float hif = Float.parseFloat(hi);
        float wef = Float.parseFloat(we);
        int i = 101;
        DB.Execute("UPDATE user_log SET Nic='" + nic + "',Username='" + uname + "',Password='" + pass + "',User_email='" + mail + "',User_gender='" + gender + "',User_height='" + hif + "',User_weight='" + wef + "',User_fname='" + fn + "',User_lname='" + ln + "',Admin_id='" + i + "' WHERE Nic='" + nic + "'");
        
        if(usr.equals("admin update"))
        {
            
        }
        else
        {
            Supdate su = new Supdate();
            su.setVisible(true);
        }
    }
    
    public void view(String name,String usr,String adun) throws ClassNotFoundException, SQLException
    {
        adminUsername = adun;
        System.out.println(adminUsername);
        
        DB.getConnection();
        ResultSet rs = DB.search("SELECT * FROM user_log WHERE Username='" + name + "'");
        while(rs.next())
        {
            x1=rs.getString(1);
            x2=rs.getString(2);
            x3=rs.getString(3);
            x4=rs.getString(4);
            x5=rs.getString(5);
            x6=rs.getString(6);
            x7=rs.getString(7);
            x8=rs.getString(8);
            x9=rs.getString(9);
            x10=rs.getString(10);
        }
            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
            System.out.println(x4);
            System.out.println(x5);
            System.out.println(x6);
            System.out.println(x7);
            System.out.println(x8);
            System.out.println(x9);
            System.out.println(x10);
    
        if(usr.equals("user"))
        {
            View v = new View();
            v.setVisible(true);
            v.setValues(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
        }
        else if(usr.equals("admin view"))
        {
            AdminControlPanel acp = new AdminControlPanel();
            acp.setPositionToView();
            acp.setValuesToView(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, adminUsername);
            acp.setVisible(true);
        }
        else if(usr.equals("admin delete"))
        {
            AdminControlPanel acp = new AdminControlPanel();
            acp.setPositionToDelete();
            acp.setValuesToDelete(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10,adminUsername);
            acp.setVisible(true);
        }
        else
        {
            AdminControlPanel acp = new AdminControlPanel();
           
            acp.setValuesToUpdate(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10,adminUsername);
            acp.setPositionToUpdate();
            acp.setVisible(true);
        }
    }
    
    public void UserPreviousSummery(String i) throws ClassNotFoundException, SQLException{
    
    previousData pd = new previousData();
    pd.setData();
    pd.searchAll("SELECT Meal_name,date,qty,Water_limit FROM portion_detail WHERE Nic='"+i+"'");
    ResultSet rs = DB.search("SELECT COUNT(Pd_id) FROM portion_detail WHERE Nic='" + i + "'");
    while(rs.next()){
      String ii=rs.getString(1);
      pd.setRecords(ii);
    
    }
    pd.setVisible(true);
    
    }
    
    
    
    public void deleteUser(String name,String pass) throws ClassNotFoundException, SQLException{

     DB.getConnection();
     ResultSet rs = DB.search("SELECT * FROM user_log WHERE Username='" + name + "'");
     while(rs.next())
     {
        if(pass.equals(rs.getString(3)))
        {
            DB.Execute("DELETE FROM user_log WHERE Username='" + name + "'");
        }
     }
    }
    
    
    
    
}
           

 



