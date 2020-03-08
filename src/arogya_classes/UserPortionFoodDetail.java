/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import arogya.IllDB;
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
    
     private String pdid,foodid,userid,date,foodStatus,mealName,nic,userName;
     private String[] foodName;
     private int qty,noOFCalory,rawCount;
     int fid;
     public void generateMealDetails(String[] FoodName,String[] qty,int rw,String water,String UserName,String portion) throws ClassNotFoundException, SQLException
     {
        foodName = FoodName;
        userName = UserName;
        DB.getConnection();
        rawCount=rw;
        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        Date dateobj = new Date();
        String dateVal= df.format(dateobj);

        try
        {
            ResultSet rs1 = DB.search("SELECT Nic FROM user_log WHERE Username='" + userName + "'");
            while(rs1.next())
            {
                
                nic = rs1.getString(1);
            }
                System.out.println(nic);
                for(int i=0;i<rawCount;i++)
                {
                    ResultSet rs = DB.search("SELECT Food_id,Food_name FROM food WHERE Food_name='" + FoodName[i] + "'");
                    while(rs.next())
                    {  
                    if(FoodName[i].equals(rs.getString(2)))
                    {
                        foodid = rs.getString(1);
                        System.out.println(foodid);
                        IllDB.Execute("INSERT INTO portion_detail(Meal_name,date,qty,Water_limit,Food_id,Nic) VALUES ('" + portion + "','" + dateVal + "','" + qty[i] + "','" + water + "','" + foodid + "','" + nic + "')");
                    }
                }
            }
            
        }
        catch(Exception e)
        {
             
        }
    }   
}
