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
    
    public void setTarget(String uTargetWeight,String uTargetTime,String status,String Uname){
        if(status.equals("inc")){
            
        float fWeight=Float.parseFloat(uTargetWeight);  
    if(uTargetTime.equals("2week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/2;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("2week");
    
    }else if(uTargetTime.equals("4week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/4;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("4week");
    
    }else if(uTargetTime.equals("12week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/12;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("12week");
    
    }else if(uTargetTime.equals("24week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/24;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("24week");
    
    }else if(uTargetTime.equals("48week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/48;
        float ans = 2000+(val*2*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
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
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("2week");
    
    }else if(uTargetTime.equals("4week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/4;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("4week");
    
    }else if(uTargetTime.equals("12week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/12;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("12week");
    
    }else if(uTargetTime.equals("24week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/24;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
         tpd.setVisible(true);
        System.out.print("24week");
    
    }else if(uTargetTime.equals("48week")){
        
        Targetpopupdetails tpd = new Targetpopupdetails();
        float val=fWeight/48;
        float ans = 2000-(val*1000);
        String cal=String.valueOf(ans);  
        tpd.setNotification(cal,uTargetWeight,uTargetTime,status,Uname);
        tpd.setVisible(true);
        System.out.print("48week");
    }
            
            
        }
    }
    
        public void getUserData(String name) throws ClassNotFoundException, SQLException{
   ;
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
       String nic123; String uTargetWeight,val,status,uName,D,uTargetTime;
        public void saveUserData(String v,String utw,String utt,String st,String un,String date) throws ClassNotFoundException, SQLException{
              uTargetWeight=utw;
              val =v;
              uTargetTime = utt;
              status = st;
              uName = un;
              D = date;
              
             DB.getConnection();
            
             ResultSet rs = DB.search("SELECT Nic FROM user_log WHERE Username='" + uName + "'");
             
        while(rs.next())
        {
          nic123 = rs.getString(1);
        }        
          
        

        }
        
        public void checkUserTarget() throws ClassNotFoundException, SQLException{
           Targetpopupdetails tpd = new Targetpopupdetails(); 
        String x1 = null;
        DB.getConnection();
        ResultSet rs = DB.search("SELECT Nic FROM target WHERE Nic='" + nic123 + "'");
        while(rs.next())
        {
            x1=rs.getString(1);   
          
        }
    
         
        if(nic123.equals(x1))
        {
           System.out.println("yessssssssssssssss");
           tpd.showTargetStatus(val, uTargetWeight, uTargetTime, status, uName, D, 1);
          tpd.setVisible(true);
            
        }else{
         
             DB.Execute("INSERT INTO target (date,weight,time,daily_calory_intake,status,Nic) VALUES ('" + D + "','" + uTargetWeight + "','" + uTargetTime + "','" + status + "','" + val + "','" + nic123 + "')");
         System.out.println("Noooooooooo");
         tpd.showTargetStatus(val, uTargetWeight, uTargetTime, status, uName, D, 0);
          tpd.setVisible(true);
         }

//    System.out.println(nic123);
//    System.out.println(nic123);
}
}