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

/**
 *
 * @author ADMIN
 */
public class HealthDetailTest {
   
    private String hdId,adminId,notification,Nic;
    private int healthStatusValue,PortionDetailsValue,nutritionQty;
    private String[] x1;
    

    


    String food1 , food2 , food3 , food4 , food5 , food6 , food7 , food8 , food9 , food10 , food11 , food12 ,food13 , food14 ,food15 , food16 , food17 , food18 , food19 ,food20 , food21 ;
    String qty1 , qty2 , qty3 , qty4 , qty5 , qty6 , qty7 , qty8 , qty9 , qty10 , qty11 , qty12 ,qty13 , qty14 ,qty15 , qty16 , qty17 , qty18 , qty19 ,qty20 , qty21;
    String calo1 , calo2 , calo3 , calo4 , calo5 , calo6 , calo7 , calo8 , calo9 , calo10 , calo11 , calo12 ,calo13 , calo14 ,calo15 , calo16 , calo17 , calo18 , calo19 ,calo20 , calo21 ;
    String carb1 , carb2 , carb3 , carb4 , carb5 , carb6 , carb7 , carb8 , carb9 , carb10 , carb11 , carb12 ,carb13 , carb14 ,carb15 , carb16 , carb17 , carb18 , carb19 ,carb20 , carb21 ;
    String fat1 , fat2 , fat3 , fat4 , fat5 , fat6 , fat7 , fat8 , fat9 , fat10 , fat11 , fat12 ,fat13 , fat14 ,fat15 , fat16 , fat17 , fat18 , fat19 ,fat20 , fat21 ;
    String sod1 , sod2 , sod3 , sod4 , sod5 , sod6 , sod7 , sod8 , sod9 , sod10 , sod11 , sod12 ,sod13 , sod14 ,sod15 , sod16 , sod17 , sod18 , sod19 ,sod20 , sod21 ;
    double fcalo1Sum1 , fcalo1Sum2 , fcalo1Sum3 , fcalo1Sum4 , fcalo1Sum5 , fcalo1Sum6 , fcalo1Sum7 , fcalo1Sum8 , fcalo1Sum9 , fcalo1Sum10 , fcalo1Sum11 , fcalo1Sum12 ,fcalo1Sum13 , fcalo1Sum14 ,fcalo1Sum15 , fcalo1Sum16 , fcalo1Sum17 , fcalo1Sum18 , fcalo1Sum19 ,fcalo1Sum20 , fcalo1Sum21 ;
    double fcalo1SumAvg,cntD,cntP;
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
          
                    
                   String[] foods = new String[9];
                   int ix=0;
                   ResultSet rs = DB.search("SELECT Food_id FROM portion_detail WHERE Nic='" + nic + "' order by Food_id ASC");
                   while(rs.next())
                                  {
                                         
                                          foods[ix] = rs.getString(ix+1);
                                          System.out.println(foods[ix]);    
                                          ++ix;
         
                                  }
             
            
                   String[] calo = new String[PcountInt];
                   
                    System.out.print("\n"+foods[5]);
                    for(int j=0;j<PcountInt;j++){
                    ResultSet rsf1 = IllDB.search("SELECT Calories FROM nutrition_fact WHERE Food_id='" + foods[j]+ "'");
                    while(rsf1.next())
                    {      
     
          calo[j] = rsf1.getString(1);
         
          System.out.print("\n");               
          System.out.print("\n"+calo[j]);
         
                    }

      //   
     }   
      
         
         
            
    }
}