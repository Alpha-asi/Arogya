/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
    public class Food {
    
    
    private String foodid,adminid,deletefood,foodStatus;
    
    
   
    public void searchFood(String foodName)
    {
       
        
        
        
    }
    int i;
    public void sendFood(String foodname,String foodstatus,String Admin) throws ClassNotFoundException, SQLException
    {
    
    
    DB.getConnection();
    String x1; 
    ResultSet rs = DB.search("SELECT * FROM admin_log WHERE Username='" + Admin + "'");
    while(rs.next()){
    x1=rs.getString(1);
    i = Integer.parseInt(x1);
    
    }
        DB.Execute("INSERT INTO food (Food_name,Food_status,Admin_id) VALUES ('" + foodname + "','" + foodstatus + "','" + i + "')");
                
    }
    
    
    public void insertFood()
    {
        
        
        
    }
    
    
     public void updateFood()
    {
        
        
        
    }
     
     
     public void deleteFood()
    {
        
        
        
    }
    
    
    
}
