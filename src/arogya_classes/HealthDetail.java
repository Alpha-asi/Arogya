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
public class HealthDetail {
   
    private String hdId,adminId,notification,Nic;
    private int healthStatusValue,PortionDetailsValue,nutritionQty;
    private String[] x1;
    

    String[] foods;


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
    


int ii=0;
int jj=0;
    public void predictFuture(String nic) throws SQLException, ClassNotFoundException
    {     
        
          Nic=nic;
          
          DB.getConnection();
          ResultSet rsCount = DB.search("select count_of_portions from portion_detail order by count_of_portions DESC LIMIT 1");
          while(rsCount.next())
           {
              String Pcount = rsCount.getString(1);
              int PcountInt =Integer.parseInt(Pcount);  
              for(int i =0;i<PcountInt;i++){
                  
                   DB.getConnection();   
                   ResultSet rs = DB.search("SELECT Food_id FROM portion_detail WHERE Nic='" + nic + "' ORDER BY pd_id DESC");
                   while(rs.next())
                                  {
       
                                              int j=0;
                                              foods[j]=rs.getString(j+1);       
                                              j++;
                                              System.out.print(foods[j]);
         
                                  }
             
            }
      
         
         
            }
          
        
     
     ResultSet rsD = DB.search("SELECT did FROM diet ORDER BY did DESC LIMIT 1");
     while(rsD.next())
     {
       String c =rsD.getString(1);
       cntD = Double.parseDouble(c);
       System.out.print("\n"+cntD);
        System.out.print("\n"+cntD);
      
     }
      ResultSet rsP = DB.search("SELECT Pd_id FROM portion_detail ORDER BY Pd_id DESC LIMIT 1");
     while(rsP.next())
     {
       String c =rsP.getString(1);
       cntP = Double.parseDouble(c);
        System.out.print("\n"+cntP);
        System.out.print("\n"+cntP);
      
     }
     
                           
                           
      

       ResultSet rs1 = DB.search("SELECT qty FROM portion_detail WHERE Nic='" + nic + "' ORDER BY pd_id DESC");
       while(rs1.next())
      {
       
      
      
         if(jj==0){
          qty1=rs1.getString(1);       
         }  
         
         if(jj==1){
          qty2=rs1.getString(1);       
         } 
         
         if(jj==2){
          qty3=rs1.getString(1);       
         } 
         
         if(jj==3){
          qty4=rs1.getString(1);       
         } 
         
         if(jj==4){
         qty5=rs1.getString(1);       
         } 
         
         if(jj==5){
          qty6=rs1.getString(1);       
         } 
    
         if(jj==6){
          qty7=rs1.getString(1);       
         } 
         
         if(jj==7){
          qty8=rs1.getString(1);       
         } 
         
         
         if(jj==8){
          qty9=rs1.getString(1);       
         } 
         
         
         if(jj==9){
          qty10=rs1.getString(1);       
         } 
         
         
         if(jj==10){
          qty11=rs1.getString(1);       
         } 
         
         if(jj==11){
          qty12=rs1.getString(1);       
         } 
         
         if(jj==12){
          qty13=rs1.getString(1);       
         } 
         
         if(jj==13){
          qty14=rs1.getString(1);       
         } 
         
         if(jj==14){
          qty15=rs1.getString(1);       
         } 
         
         if(jj==15){
          qty16=rs1.getString(1);       
         } 
         
         if(jj==16){
          qty17=rs1.getString(1);       
         } 
         
         if(jj==17){
          qty18=rs1.getString(1);       
         } 
         
         if(jj==18){
          qty19=rs1.getString(1);       
         } 
         
         if(jj==19){
          qty20=rs1.getString(1);       
         } 
         
         if(jj==20){
          qty21=rs1.getString(1);  
        //  portionDetail();
         } 
         
                     
          
       
         
         
         jj++;
         
            }    
        System.out.print("\n");               
        System.out.print("\n"+qty1);
        System.out.print("\n"+qty2);
        System.out.print("\n"+qty3); 
        System.out.print("\n"+qty4);
        System.out.print("\n"+qty5); 
        
        
       }
  
    



 public void portionDetail() throws ClassNotFoundException, SQLException
{

   DB.getConnection();
     ResultSet rsf1 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food1 + "'");
     while(rsf1.next())
     {      
     
          calo1 = rsf1.getString(1);
          carb1 = rsf1.getString(2);
          fat1 = rsf1.getString(3);
          sod1 = rsf1.getString(4);
          System.out.print("\n");               
          System.out.print("\n"+calo1);
          double fcalo1 = Double.parseDouble(calo1);
          double fq1 = Double.parseDouble(qty1);
          fcalo1Sum1 = fcalo1 * fq1;
      //   
     }
     
       DB.getConnection();
       ResultSet rsf2 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food2 + "'");
     while(rsf2.next())
     {      
     
          calo2 = rsf2.getString(1);
          carb2 = rsf2.getString(2);
          fat2 = rsf2.getString(3);
          sod2 = rsf2.getString(4);
          double fcalo1 = Double.parseDouble(calo2);
          double fq1 = Double.parseDouble(qty2);
          fcalo1Sum2 = fcalo1 * fq1;
       
     }
     
     
     
     DB.getConnection();
       ResultSet rsf3 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food3 + "'");
     while(rsf3.next())
     {      
     
          calo3 = rsf3.getString(1);
          carb3 = rsf3.getString(2);
          fat3 = rsf3.getString(3);
          sod3 = rsf3.getString(4);
          double fcalo1 = Double.parseDouble(calo3);
          double fq1 = Double.parseDouble(qty3);
          fcalo1Sum3 = fcalo1 * fq1;
       
     }
     

     
     DB.getConnection();
       ResultSet rsf4 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food4 + "'");
     while(rsf4.next())
     {      
     
          calo4 = rsf4.getString(1);
          carb4 = rsf4.getString(2);
          fat4 = rsf4.getString(3);
          sod4 = rsf4.getString(4);
          double fcalo1 = Double.parseDouble(calo4);
          double fq1 = Double.parseDouble(qty4);
          fcalo1Sum4 = fcalo1 * fq1;
     
     }
     
     
     DB.getConnection();
       ResultSet rsf5 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food5 + "'");
     while(rsf5.next())
     {      
     
          calo5 = rsf5.getString(1);
          carb5 = rsf5.getString(2);
          fat5 = rsf5.getString(3);
          sod5 = rsf5.getString(4);
          double fcalo1 = Double.parseDouble(calo5);
          double fq1 = Double.parseDouble(qty5);
          fcalo1Sum5 = fcalo1 * fq1;
      
     }
     
     
     DB.getConnection();
       ResultSet rsf6 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food6 + "'");
     while(rsf6.next())
     {      
     
          calo6 = rsf6.getString(1);
          carb6 = rsf6.getString(2);
          fat6 = rsf6.getString(3);
          sod6 = rsf6.getString(4);
          double fcalo1 = Double.parseDouble(calo6);
          double fq1 = Double.parseDouble(qty6);
          fcalo1Sum6 = fcalo1 * fq1;
    
     }
     
     
     DB.getConnection();
       ResultSet rsf7 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food7 + "'");
     while(rsf7.next())
     {      
     
          calo7 = rsf7.getString(1);
          carb7 = rsf7.getString(2);
          fat7 = rsf7.getString(3);
          sod7 = rsf7.getString(4);
          double fcalo1 = Double.parseDouble(calo7);
          double fq1 = Double.parseDouble(qty7);
          fcalo1Sum7 = fcalo1 * fq1;
       
     }
     
     
     DB.getConnection();
       ResultSet rsf8 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food8 + "'");
     while(rsf8.next())
     {      
     
          calo8 = rsf8.getString(1);
          carb8 = rsf8.getString(2);
          fat8 = rsf8.getString(3);
          sod8 = rsf8.getString(4);
          double fcalo1 = Double.parseDouble(calo8);
          double fq1 = Double.parseDouble(qty8);
          fcalo1Sum8 = fcalo1 * fq1;
      
     }
     
     DB.getConnection();
       ResultSet rsf9 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food9 + "'");
     while(rsf9.next())
     {      
     
          calo9 = rsf9.getString(1);
          carb9 = rsf9.getString(2);
          fat9 = rsf9.getString(3);
          sod9 = rsf9.getString(4);
          double fcalo1 = Double.parseDouble(calo9);
          double fq1 = Double.parseDouble(qty9);
          fcalo1Sum9 = fcalo1 * fq1;
      
     }
     
     
     DB.getConnection();
       ResultSet rsf10 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food10 + "'");
     while(rsf10.next())
     {      
     
          calo10 = rsf10.getString(1);
          carb10 = rsf10.getString(2);
          fat10 = rsf10.getString(3);
          sod10 = rsf10.getString(4);
          double fcalo1 = Double.parseDouble(calo10);
          double fq1 = Double.parseDouble(qty10);
          fcalo1Sum10 = fcalo1 * fq1;
      
     }
     
     DB.getConnection();
       ResultSet rsf11 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food11 + "'");
     while(rsf11.next())
     {      
     
          calo11 = rsf11.getString(1);
          carb11 = rsf11.getString(2);
          fat11 = rsf11.getString(3);
          sod11 = rsf11.getString(4);
          double fcalo1 = Double.parseDouble(calo11);
          double fq1 = Double.parseDouble(qty11);
          fcalo1Sum11 = fcalo1 * fq1;
  
     }
     
     DB.getConnection();
       ResultSet rsf12 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food12 + "'");
     while(rsf12.next())
     {      
     
          calo12 = rsf12.getString(1);
          carb12 = rsf12.getString(2);
          fat12 = rsf12.getString(3);
          sod12 = rsf12.getString(4);
          double fcalo1 = Double.parseDouble(calo12);
          double fq1 = Double.parseDouble(qty12);
          fcalo1Sum12 = fcalo1 * fq1;
          
  
     }
     
     DB.getConnection();
       ResultSet rsf13 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food13 + "'");
     while(rsf13.next())
     {      
     
         calo13 = rsf13.getString(1);
          carb13 = rsf13.getString(2);
          fat13 = rsf13.getString(3);
          sod13 = rsf13.getString(4);
         double fcalo1 = Double.parseDouble(calo13);
         double fq1 = Double.parseDouble(qty13);
          fcalo1Sum13 = fcalo1 * fq1;
             

     }
     
     
      DB.getConnection();
       ResultSet rsf14 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food14 + "'");
     while(rsf14.next())
     {      
     
          calo14 = rsf14.getString(1);
          carb14 = rsf14.getString(2);
          fat14 = rsf14.getString(3);
          sod14 = rsf14.getString(4);
          double fcalo1 = Double.parseDouble(calo14);
          double fq1 = Double.parseDouble(qty14);
          fcalo1Sum14 = fcalo1 * fq1;
              
 
     }
     
     
      DB.getConnection();
       ResultSet rsf15 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food15 + "'");
     while(rsf15.next())
     {      
     
         calo15 = rsf15.getString(1);
         carb15 = rsf15.getString(2);
         fat15 = rsf15.getString(3);
         sod15 = rsf15.getString(4);
         double fcalo1 = Double.parseDouble(calo15);
         double fq1 = Double.parseDouble(qty15);
         fcalo1Sum15 = fcalo1 * fq1;
           
  
     }
     
     
     
      DB.getConnection();
       ResultSet rsf16 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food16 + "'");
     while(rsf16.next())
     {      
     
         calo16 = rsf16.getString(1);
         carb16 = rsf16.getString(2);
         fat16 = rsf16.getString(3);
         sod16 = rsf16.getString(4);
         double fcalo1 = Double.parseDouble(calo16);
         double fq1 = Double.parseDouble(qty16);
         fcalo1Sum16 = fcalo1 * fq1;
                
 
     }
     
     
      DB.getConnection();
       ResultSet rsf17 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food17 + "'");
     while(rsf17.next())
     {      
     
         calo17 = rsf17.getString(1);
         carb17 = rsf17.getString(2);
         fat17 = rsf17.getString(3);
         sod17 = rsf17.getString(4);
         double fcalo1 = Double.parseDouble(calo17);
         double fq1 = Double.parseDouble(qty17);
         fcalo1Sum17 = fcalo1 * fq1;
                

     }
     
     
      DB.getConnection();
       ResultSet rsf18 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food18 + "'");
     while(rsf18.next())
     {      
     
         calo18 = rsf18.getString(1);
         carb18 = rsf18.getString(2);
         fat18 = rsf18.getString(3);
         sod18 = rsf18.getString(4);
         double fcalo1 = Double.parseDouble(calo18);
         double fq1 = Double.parseDouble(qty18);
         fcalo1Sum18 = fcalo1 * fq1;
                

     }
     
      DB.getConnection();
       ResultSet rsf19 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food19 + "'");
     while(rsf19.next())
     {      
     
          calo19 = rsf19.getString(1);
          carb19 = rsf19.getString(2);
          fat19 = rsf19.getString(3);
          sod19 = rsf19.getString(4);
          double fcalo1 = Double.parseDouble(calo19);
          double fq1 = Double.parseDouble(qty19);
          fcalo1Sum19 = fcalo1 * fq1;
         
                   
     
     }
     
     
      DB.getConnection();
       ResultSet rsf20 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food20 + "'");
     while(rsf20.next())
     {      
     
          calo20 = rsf20.getString(1);
          carb20 = rsf20.getString(2);
          fat20 = rsf20.getString(3);
          sod20 = rsf20.getString(4);
          double fcalo1 = Double.parseDouble(calo20);
          double fq1 = Double.parseDouble(qty20);
          fcalo1Sum20 = fcalo1 * fq1;
                    
   
     }
     
     
      DB.getConnection();
      ResultSet rsf21 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + food21 + "'");
      while(rsf21.next())
      {      
     
         calo21 = rsf21.getString(1);
         carb21 = rsf21.getString(2);
         fat21 =  rsf21.getString(3);
         sod21 =  rsf21.getString(4);
         double fcalo1 = Double.parseDouble(calo21);
         double fq1 = Double.parseDouble(qty21);
         fcalo1Sum21 = fcalo1 * fq1;
            

     }
     
    double fcalo1SumTot =  fcalo1Sum1+fcalo1Sum2+fcalo1Sum3+fcalo1Sum4+fcalo1Sum5+fcalo1Sum6+fcalo1Sum7+fcalo1Sum8+fcalo1Sum9+fcalo1Sum10+fcalo1Sum11+fcalo1Sum12+fcalo1Sum13+fcalo1Sum14+fcalo1Sum15+fcalo1Sum16+fcalo1Sum17+fcalo1Sum18+fcalo1Sum19+fcalo1Sum20+fcalo1Sum21;
   double avgDiets = cntP/cntD;
    fcalo1SumAvg = fcalo1SumTot/avgDiets;
//     System.out.print("\n"+fcalo1SumAvg);
//     System.out.print("\n"+fcalo1SumAvg);
//     System.out.print("\n"+fcalo1SumAvg);
//     System.out.print("\n"+fcalo1SumAvg);
}
 

public void GenarateHealthDetail() throws ClassNotFoundException, SQLException
{
    
      String status = null;
      DB.getConnection();
      ResultSet rs = DB.search("SELECT status FROM target WHERE Nic='" + Nic + "'");
      while(rs.next())
     { 
          status = rs.getString(1);
         
     }
     double sVal = Double.parseDouble(status);
     double sValAvg = sVal/3;
     
     if (sValAvg <  fcalo1SumAvg){
     
//     System.out.print("righttttttttttttttttttttttttttt");
     
     }else {
     
//     System.out.print("Wronggggggggggggggg");
     
     }
     
     }    
   
    
    
}


 


