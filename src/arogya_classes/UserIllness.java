/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import java.sql.SQLException;
import arogya.IllDB;
import java.sql.ResultSet;
import arogya.UI.Suggestionnew;
/**
 *
 * @author ADMIN
 */
public class UserIllness {
    
    private String userId;
    String i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
    String[] illnessId = new String[10];
    public void addUserIllness(String v1,String v2,String v3,String v4,String v5,String v6,String v7,String v8,String v9,String v10,String Uid) throws ClassNotFoundException, SQLException
    {
        userId=Uid;
        illnessId[0]=v1;
        illnessId[1]=v2;
        illnessId[2]=v3;
        illnessId[3]=v4;
        illnessId[4]=v5;
        illnessId[5]=v6;
        illnessId[6]=v7;
        illnessId[7]=v8;
        illnessId[8]=v9;
        illnessId[9]=v10;
        sendUserIllness();
        
    }
    
    private void sendUserIllness() throws ClassNotFoundException, SQLException
    {
       DB.getConnection();
       for(int i=0;i<10;i++){
       IllDB.Execute("INSERT INTO illness (Illness_name,Nic) VALUES('" + illnessId[i] + "','" + userId + "')");
       System.out.print(illnessId[1]);
       
       }
    }
    
    public void getUserIllness(String Nic) throws ClassNotFoundException, SQLException{
     int i =0;
                  System.out.println(Nic);
     System.out.println(Nic);
     System.out.println(Nic);
     System.out.println(Nic);
     System.out.println(Nic);
     System.out.println(Nic);
     int Ill1 = 0,Ill2 = 0,Ill3 = 0,Ill4 = 0,Ill5 = 0,Ill6 = 0,Ill7 = 0,Ill8 = 0,Ill9 = 0,Ill10 = 0;
     DB.getConnection();
     ResultSet rsIll = DB.search("SELECT Illness_name FROM illness WHERE Nic='" + Nic + "'");
     while(rsIll.next())
     { 
         if(i==0){
         String val1=rsIll.getString(1);    
         if(val1.equals("Diabetic")){
               Ill1 = 1;  
         }
         }
         
         if(i==1){
         String val2=rsIll.getString(1);    
         if(val2.equals("Low Blood Presure")){
                 Ill2 = 1; 
         }
         }
         
         if(i==2){
         String val3=rsIll.getString(1);    
         if(val3.equals("Cold")){
                 Ill3 = 1; 
         }
         }
         
         
         if(i==3){
         String val4=rsIll.getString(1);    
         if(val4.equals("Diarrhea")){
                 Ill4 = 1; 
         }
         }
         
         if(i==4){
         String val5=rsIll.getString(1);    
         if(val5.equals("Cicken Pox")){
                 Ill5 = 1; 
         }
         }
         
         if(i==5){
         String val6=rsIll.getString(1);    
         if(val6.equals("High Blood Presure")){
                 Ill6 = 1; 
         }
         }
         
         
         if(i==6){
         String val7=rsIll.getString(1);    
         if(val7.equals("Cataract")){
                 Ill7 = 1; 
         }
         }
         
         
         if(i==7){
         String val8=rsIll.getString(1);    
         if(val8.equals("Fever")){
                 Ill8 = 1; 
         }
         }
         
         
         if(i==8){
         String val9=rsIll.getString(1);    
         if(val9.equals("Gastritis")){
                 Ill9 = 1; 
         }
         }
         
         
         if(i==9){
         String val10=rsIll.getString(1);    
         if(val10.equals("Migraine")){
                 Ill10 = 1; 
         }
         }
         i++;
         
    }
     
     Suggestionnew sug = new Suggestionnew();
     sug.getUserIllnessData(Ill1, Ill2, Ill3, Ill4, Ill5, Ill6, Ill7, Ill8, Ill9, Ill10);
     sug.dataShow();
     sug.setVisible(true);

   
}
}