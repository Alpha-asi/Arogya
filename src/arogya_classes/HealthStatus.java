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
import arogya.UI.AchiTarget;
/**
 *
 * @author ADMIN
 */
public class HealthStatus {
    
    private String IllnessId,userId,gender; float bmi;
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
         float fH=Float.parseFloat(h);  
         float fW=Float.parseFloat(h);  
         float hi = (float) (fH*0.3048);
         float h2=hi*hi;
         float bm =fW/h2;
         bmi=bm;
     b.setVisible(true);
    }
    
    
    public void displayHealthDeatails(String name,String weight,String time)
    {
       System.out.println(name+"-------"+weight);
        
        
    }
    
    public void getUserData(String name) throws ClassNotFoundException, SQLException{
    
        DB.getConnection();
        ResultSet rs=DB.search("select Username,User_weight,User_gender,User_height from user_log where Username = '"+name+"'"); 
             while(rs.next())  {
                 if(name.equals(rs.getString(1))){
                    String uWeight = rs.getString(2);
                    String uGender =  rs.getString(3);
                    String uHeight =  rs.getString(4);
                    AchiTarget at = new AchiTarget();
                    at.getUserData(uWeight,uHeight,uGender,name);
                    System.out.print(uGender+"--------"+uWeight);
                    at.setVisible(true);
                 }
    }
}
}