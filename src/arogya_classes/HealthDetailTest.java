/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import arogya.IllDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import arogya.UI.FuturePrediction;

/**
 *
 * @author ADMIN
 */
public class HealthDetailTest {
   
    private String hdId,adminId,notification,Nic;
    private int healthStatusValue,PortionDetailsValue,nutritionQty,PdHN; int TotalCal=0;
    private String[] x1;
    

    


    public void showHealthDetails()
    {
       
        
    }
    


int ii=9;
int jj=0;


    public void predictFuture(String nic) throws SQLException, ClassNotFoundException
    {     
         int PcountInt = 0;
          Nic=nic;
          
          DB.getConnection();
          ResultSet rsCount = DB.search("select Count_Of_Portions from portion_detail where nic = '" + nic + "' order by Count_Of_Portions DESC LIMIT 1");
          while(rsCount.next())
           {
              String Pcount = rsCount.getString(1);
              PcountInt =Integer.parseInt(Pcount);  
              
           }
          
                    
                  
                   int x=0;
                   int y=0;
                   
                   ResultSet rsPdId = DB.search("SELECT Pd_id FROM portion_detail WHERE Nic='" + nic + "' order by Pd_id DESC LIMIT 1");
                   while(rsPdId.next())
                                  {
                                        String p = rsPdId.getString(1); // portion deatail Highest Number                                                                                
                                        PdHN =Integer.parseInt(p);
                                        System.out.print("\n"+PdHN);
                                        System.out.print("\n"+PdHN);
                                        System.out.print("\n"+PdHN);
                                        
                                  }
                   
                   String[] foods = new String[PdHN];
                   String[] qty = new String[PdHN];
                   String[] TotCal = new String[PdHN];
                   ResultSet rs = DB.search("SELECT Food_id,qty FROM portion_detail WHERE Nic='" + nic + "' order by Food_id ASC");
                   while(rs.next())
                                  {
                                                                                                                          
                                          foods[x] = rs.getString(1);                                         
                                          x++;
                                          qty[y] = rs.getString(2);                                         
                                          y++;
                                  }
             
                  
                   String[] calo = new String[PdHN];
                   
                   // System.out.print("\n"+foods[5]);
                    
                    for(int j=0;j<PdHN;j++){
                    ResultSet rsf1 = IllDB.search("SELECT Calories FROM nutrition_fact WHERE Food_id='" + foods[j]+ "'");
                    while(rsf1.next())
                    {      
     
                     calo[j] = rsf1.getString(1);
                     String p = qty[j];
                     int QTY =Integer.parseInt(p);
                     String q = calo[j];
                     int CAL =Integer.parseInt(q);
                     int TotCAL = QTY * CAL;
                     String S=String.valueOf(TotCAL); 
                     TotCal[j] = S;
                     
                     
                     System.out.print("\n");               
                     System.out.print("\n"+TotCal[j]);
                     
                        
                        String cal = TotCal[j];
                        int c =Integer.parseInt(cal);
                        TotalCal = TotalCal + c;
                      
         
                    }
                    
                    
                     

      //   
     }     
            int wnum=0; String dci = null;  String TS = null;      
        ResultSet rsTarget = DB.search("SELECT status,weight,daily_calory_intake FROM target WHERE Nic='" + nic + "'");
        while(rsTarget.next())
        {
             TS=rsTarget.getString(1);
            String w =rsTarget.getString(2); 
             wnum = Integer.parseInt(w);
             dci=rsTarget.getString(3);
          
        }
                    
             System.out.println("\n"+TotalCal);
             FuturePrediction fp = new FuturePrediction();
             fp.showData(TS, wnum,dci, TotalCal/PdHN);
             fp.setVisible(true);
    }
       
     
}