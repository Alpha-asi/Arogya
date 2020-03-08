/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;
import arogya.DB;
import arogya.UI.Bmi;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class HealthStatus {
    
    private String IllnessId,userId,gender;
    private int weight,height,age,waterQty,caloryty;
     String h,w;
    public void calHealthStatus(String name) throws ClassNotFoundException, SQLException
    {
       
        DB.getConnection();
        
         ResultSet rs = DB.search("SELECT Username,User_height,User_weight FROM user_log WHERE Username='" + name + "'");
    while(rs.next()){
        if(name.equals(rs.getString(1))){
        h=rs.getString(2);
        w=rs.getString(3);
        }
    }
     Bmi b = new Bmi();
     b.getValues(h, w, name);
     b.setVisible(true);
    }
    
    
    private void displayHealthDeatails(String name)
    {
        
        
        
    }
    
}
