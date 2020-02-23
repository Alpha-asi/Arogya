/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import java.sql.SQLException;
import arogya.IllDB;
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
       for(int i=0;i<11;i++){
       IllDB.Execute("INSERT INTO illness (Illness_name,User_id) VALUES('" + illnessId[i] + "','" + userId + "')");
       System.out.print(illnessId[1]);
       
       }
    }

   
}
