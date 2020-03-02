/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import com.sun.javafx.font.Disposer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class UserPortionFoodDetail {
    
     private String pdid,foodid,userid,date,foodName,foodStatus,mealName;
     private int qty,noOFCalory;
    int fid;
     public void generateMealDetails(String foodName,String qty,String water,String UserName,String portion) throws ClassNotFoundException, SQLException
     {
      DB.getConnection();
   DateFormat df = new SimpleDateFormat("yy-MM-dd");
   Date dateobj = new Date();
   System.out.println(df.format(dateobj));
   String dateVal= df.format(dateobj);
       //  String portion = "Breakfast";
         try{
          ResultSet rs = DB.search("SELECT * FROM food WHERE Food_name='" + foodName + "'");
    while(rs.next()){
    if(foodName.equals(rs.getString(2))){
        String x = rs.getString(1);
         fid = Integer.parseInt(x);       
    }
    
    }
     ResultSet rs1 = DB.search("SELECT * FROM user_log WHERE Username='" + UserName + "'");
     while(rs1.next()){
            if(UserName.equals(rs1.getString(2))){
                 String id=rs1.getString(1);
                 DB.Execute("INSERT INTO portion_detail(Meal_name,date,qty,Water_limit,Food_id,Nic) VALUES ('" + portion + "','" + dateVal + "','" + qty + "','" + water + "','" + fid + "','" + id + "')");
        }
        }
         }catch(Exception e){
         
         
         }
     }
     
     
  
     
    
}
