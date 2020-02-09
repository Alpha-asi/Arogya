/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import arogya.UI.Login;

/**
 *
 * @author vimuk
 */
public class User {
    

    
    public static Connection connection;
    
     public static void getConnection1() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya","root","");
            //"jdbc:mysql://localhost:3306/tecvision", "root", "123"
          
        } catch (Exception e) {
        }

    }

   

    public static String userlogin(String a, String b) {
        System.out.print(a);
        System.out.print(b);
        return null;
    }
           
 public void userlogin1() throws SQLException {
     Statement stmt=connection.createStatement();  
     ResultSet rs=stmt.executeQuery("select * from user_log"); 
     while(rs.next())  
     System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
     connection.close();
     
     
       

     
     
             
     
 
 } 
 
}


