/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;
import arogya.DB;
import arogya.UI.AchiTarget;
import arogya.UI.Targetpopupdetails;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class UserTarget {
    
    public void setTarget(String uTargetWeight,String uTargetTime,String status){
        if(status.equals("inc")){
            
        float fWeight=Float.parseFloat(uTargetWeight);  
    if(uTargetTime.equals("2week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/2;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("2week");
    
    }else if(uTargetTime.equals("4week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/4;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("4week");
    
    }else if(uTargetTime.equals("12week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/12;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("12week");
    
    }else if(uTargetTime.equals("24week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/24;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("24week");
    
    }else if(uTargetTime.equals("48week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/48;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
        tpd.setVisible(true);
        System.out.print("48week");
    }
        }else if(status.equals("dic")){
        
         float fWeight=Float.parseFloat(uTargetWeight);  
    if(uTargetTime.equals("2week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/2;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("2week");
    
    }else if(uTargetTime.equals("4week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/4;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("4week");
    
    }else if(uTargetTime.equals("12week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/12;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("12week");
    
    }else if(uTargetTime.equals("24week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/24;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
         tpd.setVisible(true);
        System.out.print("24week");
    
    }else if(uTargetTime.equals("48week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/48;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal);
        tpd.setVisible(true);
        System.out.print("48week");
    }
            
            
        }
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
