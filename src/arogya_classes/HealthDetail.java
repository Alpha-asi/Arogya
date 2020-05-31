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
   
    private String hdId,adminId,notification;
    private int healthStatusValue,PortionDetailsValue,nutritionQty;
    private String[] x1;
    
    String y1 , y2 , y3 , y4 , y5 , y6 , y7 , y8 , y9 , y10 , y11 , y12 ,y13 , y14 ,y15 , y16 , y17 , y18 , y19 ,y20 , y21 ;
    String q1 , q2 , q3 , q4 , q5 , q6 , q7 , q8 , q9 , q10 , q11 , q12 ,q13 , q14 ,q15 , q16 , q17 , q18 , q19 ,q20 , q21;
    String calo1 , calo2 , calo3 , calo4 , calo5 , calo6 , calo7 , calo8 , calo9 , calo10 , calo11 , calo12 ,calo13 , calo14 ,calo15 , calo16 , calo17 , calo18 , calo19 ,calo20 , calo21 ;
    String carb1 , carb2 , carb3 , carb4 , carb5 , carb6 , carb7 , carb8 , carb9 , carb10 , carb11 , carb12 ,carb13 , carb14 ,carb15 , carb16 , carb17 , carb18 , carb19 ,carb20 , carb21 ;
    String fat1 , fat2 , fat3 , fat4 , fat5 , fat6 , fat7 , fat8 , fat9 , fat10 , fat11 , fat12 ,fat13 , fat14 ,fat15 , fat16 , fat17 , fat18 , fat19 ,fat20 , fat21 ;
    String sod1 , sod2 , sod3 , sod4 , sod5 , sod6 , sod7 , sod8 , sod9 , sod10 , sod11 , sod12 ,sod13 , sod14 ,sod15 , sod16 , sod17 , sod18 , sod19 ,sod20 , sod21 ;
    double fcalo1Sum1 , fcalo1Sum2 , fcalo1Sum3 , fcalo1Sum4 , fcalo1Sum5 , fcalo1Sum6 , fcalo1Sum7 , fcalo1Sum8 , fcalo1Sum9 , fcalo1Sum10 , fcalo1Sum11 , fcalo1Sum12 ,fcalo1Sum13 , fcalo1Sum14 ,fcalo1Sum15 , fcalo1Sum16 , fcalo1Sum17 , fcalo1Sum18 , fcalo1Sum19 ,fcalo1Sum20 , fcalo1Sum21 ;
    public void showHealthDetails()
    {
       
        
    }
    


int ii=0;
int jj=0;
    public void predictFuture(String nic) throws SQLException, ClassNotFoundException
    {
          
      DB.getConnection();
     ResultSet rs = DB.search("SELECT Food_id FROM portion_detail WHERE Nic='" + nic + "' ORDER BY pd_id DESC");
     while(rs.next())
     {
       
      
      
         if(ii==0){
          y1=rs.getString(1);       
         }  
         
         if(ii==1){
          y2=rs.getString(1);       
         } 
         
         if(ii==2){
          y3=rs.getString(1);       
         } 
         
         if(ii==3){
          y4=rs.getString(1);       
         } 
         
         if(ii==4){
          y5=rs.getString(1);       
         } 
         
         if(ii==5){
          y6=rs.getString(1);       
         } 
    
         if(ii==6){
          y7=rs.getString(1);       
         } 
         
         if(ii==7){
          y8=rs.getString(1);       
         } 
         
         
         if(ii==8){
          y9=rs.getString(1);       
         } 
         
         
         if(ii==9){
          y10=rs.getString(1);       
         } 
         
         
         if(ii==10){
          y11=rs.getString(1);       
         } 
         
         if(ii==11){
          y12=rs.getString(1);       
         } 
         
         if(ii==12){
          y13=rs.getString(1);       
         } 
         
         if(ii==13){
          y14=rs.getString(1);       
         } 
         
         if(ii==14){
          y15=rs.getString(1);       
         } 
         
         if(ii==15){
          y16=rs.getString(1);       
         } 
         
         if(ii==16){
          y17=rs.getString(1);       
         } 
         
         if(ii==17){
          y18=rs.getString(1);       
         } 
         
         if(ii==18){
          y19=rs.getString(1);       
         } 
         
         if(ii==19){
          y20=rs.getString(1);       
         } 
         
         if(ii==20){
          y21=rs.getString(1);       
         } 
         
                     
          
       
         
         
         ii++;
         
            }
     
       System.out.print("\n"+y1);
        System.out.print("\n"+y2);
         System.out.print("\n"+y3);
          System.out.print("\n"+y4);
           System.out.print("\n"+y5);
            System.out.print("\n"+y6);
             System.out.print("\n"+y7);
              System.out.print("\n"+y8);
               System.out.print("\n"+y9);
                System.out.print("\n"+y10);
                 System.out.print("\n"+y11);
                  System.out.print("\n"+y12);
                   System.out.print("\n"+y13);
                    System.out.print("\n"+y14);
                     System.out.print("\n"+y15);
                      System.out.print("\n"+y16);
                       System.out.print("\n"+y17);
                        System.out.print("\n"+y18);
                         System.out.print("\n"+y19);
                          System.out.print("\n"+y20);
                           System.out.print("\n"+y21);
                           
                           
      

       ResultSet rs1 = DB.search("SELECT qty FROM portion_detail WHERE Nic='" + nic + "' ORDER BY pd_id DESC");
       while(rs1.next())
      {
       
      
      
         if(jj==0){
          q1=rs1.getString(1);       
         }  
         
         if(jj==1){
          q2=rs1.getString(1);       
         } 
         
         if(jj==2){
          q3=rs1.getString(1);       
         } 
         
         if(jj==3){
          y4=rs1.getString(1);       
         } 
         
         if(jj==4){
          y5=rs1.getString(1);       
         } 
         
         if(jj==5){
          y6=rs1.getString(1);       
         } 
    
         if(jj==6){
          y7=rs1.getString(1);       
         } 
         
         if(jj==7){
          y8=rs1.getString(1);       
         } 
         
         
         if(jj==8){
          y9=rs1.getString(1);       
         } 
         
         
         if(jj==9){
          y10=rs1.getString(1);       
         } 
         
         
         if(jj==10){
          y11=rs1.getString(1);       
         } 
         
         if(jj==11){
          y12=rs1.getString(1);       
         } 
         
         if(jj==12){
          y13=rs1.getString(1);       
         } 
         
         if(jj==13){
          y14=rs1.getString(1);       
         } 
         
         if(jj==14){
          y15=rs1.getString(1);       
         } 
         
         if(jj==15){
          y16=rs1.getString(1);       
         } 
         
         if(jj==16){
          y17=rs1.getString(1);       
         } 
         
         if(jj==17){
          y18=rs1.getString(1);       
         } 
         
         if(jj==18){
          y19=rs1.getString(1);       
         } 
         
         if(jj==19){
          y20=rs1.getString(1);       
         } 
         
         if(jj==20){
          q21=rs1.getString(1);  
          portionDetail();
         } 
         
                     
          
       
         
         
         jj++;
         
            }    
        System.out.print("\n");               
        System.out.print("\n"+q1);
        System.out.print("\n"+q2);
        System.out.print("\n"+q3); 
        
        
        
       }
  
    



 public void portionDetail() throws ClassNotFoundException, SQLException
{

   DB.getConnection();
     ResultSet rsf1 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y1 + "'");
     while(rsf1.next())
     {      
     
          calo1 = rsf1.getString(1);
          carb1 = rsf1.getString(2);
          fat1 = rsf1.getString(3);
          sod1 = rsf1.getString(4);
        System.out.print("\n");               
        System.out.print("\n"+calo1);
         double fcalo1 = Double.parseDouble(calo1);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum1 = fcalo1 * fq1;
      //   
     }
     
       DB.getConnection();
       ResultSet rsf2 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y2 + "'");
     while(rsf2.next())
     {      
     
          calo2 = rsf2.getString(1);
          carb2 = rsf2.getString(2);
          fat2 = rsf2.getString(3);
          sod2 = rsf2.getString(4);
         double fcalo1 = Double.parseDouble(calo2);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum2 = fcalo1 * fq1;
       
     }
     
     
     
     DB.getConnection();
       ResultSet rsf3 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y3 + "'");
     while(rsf3.next())
     {      
     
          calo3 = rsf3.getString(1);
          carb3 = rsf3.getString(2);
          fat3 = rsf3.getString(3);
          sod3 = rsf3.getString(4);
         double fcalo1 = Double.parseDouble(calo3);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum3 = fcalo1 * fq1;
       
     }
     

     
     DB.getConnection();
       ResultSet rsf4 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y4 + "'");
     while(rsf4.next())
     {      
     
          calo4 = rsf4.getString(1);
          carb4 = rsf4.getString(2);
          fat4 = rsf4.getString(3);
          sod4 = rsf4.getString(4);
         double fcalo1 = Double.parseDouble(calo4);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum4 = fcalo1 * fq1;
     
     }
     
     
     DB.getConnection();
       ResultSet rsf5 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y5 + "'");
     while(rsf5.next())
     {      
     
          calo5 = rsf5.getString(1);
          carb5 = rsf5.getString(2);
          fat5 = rsf5.getString(3);
          sod5 = rsf5.getString(4);
         double fcalo1 = Double.parseDouble(calo5);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum5 = fcalo1 * fq1;
      
     }
     
     
     DB.getConnection();
       ResultSet rsf6 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y6 + "'");
     while(rsf6.next())
     {      
     
          calo6 = rsf6.getString(1);
          carb6 = rsf6.getString(2);
          fat6 = rsf6.getString(3);
          sod6 = rsf6.getString(4);
         double fcalo1 = Double.parseDouble(calo6);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum6 = fcalo1 * fq1;
    
     }
     
     
     DB.getConnection();
       ResultSet rsf7 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y7 + "'");
     while(rsf7.next())
     {      
     
          calo7 = rsf7.getString(1);
          carb7 = rsf7.getString(2);
          fat7 = rsf7.getString(3);
          sod7 = rsf7.getString(4);
         double fcalo1 = Double.parseDouble(calo7);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum7 = fcalo1 * fq1;
       
     }
     
     
     DB.getConnection();
       ResultSet rsf8 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y8 + "'");
     while(rsf8.next())
     {      
     
          calo8 = rsf8.getString(1);
          carb8 = rsf8.getString(2);
          fat8 = rsf8.getString(3);
          sod8 = rsf8.getString(4);
         double fcalo1 = Double.parseDouble(calo8);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum8 = fcalo1 * fq1;
      
     }
     
     DB.getConnection();
       ResultSet rsf9 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y9 + "'");
     while(rsf9.next())
     {      
     
          calo9 = rsf9.getString(1);
          carb9 = rsf9.getString(2);
          fat9 = rsf9.getString(3);
          sod9 = rsf9.getString(4);
         double fcalo1 = Double.parseDouble(calo9);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum9 = fcalo1 * fq1;
      
     }
     
     
     DB.getConnection();
       ResultSet rsf10 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y10 + "'");
     while(rsf10.next())
     {      
     
          calo10 = rsf10.getString(1);
          carb10 = rsf10.getString(2);
          fat10 = rsf10.getString(3);
          sod10 = rsf10.getString(4);
         double fcalo1 = Double.parseDouble(calo10);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum10 = fcalo1 * fq1;
      
     }
     
     DB.getConnection();
       ResultSet rsf11 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y11 + "'");
     while(rsf11.next())
     {      
     
         calo11 = rsf11.getString(1);
          carb11 = rsf11.getString(2);
          fat11 = rsf11.getString(3);
          sod11 = rsf11.getString(4);
         double fcalo1 = Double.parseDouble(calo11);
         double fq1 = Double.parseDouble(q1);
         fcalo1Sum11 = fcalo1 * fq1;
  
     }
     
     DB.getConnection();
       ResultSet rsf12 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y12 + "'");
     while(rsf12.next())
     {      
     
         calo12 = rsf12.getString(1);
          carb12 = rsf12.getString(2);
          fat12 = rsf12.getString(3);
          sod12 = rsf12.getString(4);
         double fcalo1 = Double.parseDouble(calo12);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum12 = fcalo1 * fq1;
          
  
     }
     
     DB.getConnection();
       ResultSet rsf13 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y13 + "'");
     while(rsf13.next())
     {      
     
         calo13 = rsf13.getString(1);
          carb13 = rsf13.getString(2);
          fat13 = rsf13.getString(3);
          sod13 = rsf13.getString(4);
         double fcalo1 = Double.parseDouble(calo13);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum13 = fcalo1 * fq1;
             

     }
     
     
      DB.getConnection();
       ResultSet rsf14 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y14 + "'");
     while(rsf14.next())
     {      
     
         calo14 = rsf14.getString(1);
          carb14 = rsf14.getString(2);
          fat14 = rsf14.getString(3);
          sod14 = rsf14.getString(4);
         double fcalo1 = Double.parseDouble(calo14);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum14 = fcalo1 * fq1;
              
 
     }
     
     
      DB.getConnection();
       ResultSet rsf15 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y15 + "'");
     while(rsf15.next())
     {      
     
         calo15 = rsf15.getString(1);
          carb15 = rsf15.getString(2);
          fat15 = rsf15.getString(3);
          sod15 = rsf15.getString(4);
         double fcalo1 = Double.parseDouble(calo15);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum15 = fcalo1 * fq1;
           
  
     }
     
     
     
      DB.getConnection();
       ResultSet rsf16 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y16 + "'");
     while(rsf16.next())
     {      
     
         calo16 = rsf16.getString(1);
          carb16 = rsf16.getString(2);
          fat16 = rsf16.getString(3);
          sod16 = rsf16.getString(4);
         double fcalo1 = Double.parseDouble(calo16);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum16 = fcalo1 * fq1;
                
 
     }
     
     
      DB.getConnection();
       ResultSet rsf17 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y17 + "'");
     while(rsf17.next())
     {      
     
         calo17 = rsf17.getString(1);
          carb17 = rsf17.getString(2);
          fat17 = rsf17.getString(3);
          sod17 = rsf17.getString(4);
         double fcalo1 = Double.parseDouble(calo17);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum17 = fcalo1 * fq1;
                

     }
     
     
      DB.getConnection();
       ResultSet rsf18 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y18 + "'");
     while(rsf18.next())
     {      
     
         calo18 = rsf18.getString(1);
          carb18 = rsf18.getString(2);
          fat18 = rsf18.getString(3);
          sod18 = rsf18.getString(4);
         double fcalo1 = Double.parseDouble(calo18);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum18 = fcalo1 * fq1;
                

     }
     
      DB.getConnection();
       ResultSet rsf19 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y19 + "'");
     while(rsf19.next())
     {      
     
          calo19 = rsf19.getString(1);
          carb19 = rsf19.getString(2);
          fat19 = rsf19.getString(3);
          sod19 = rsf19.getString(4);
         double fcalo1 = Double.parseDouble(calo19);
         double fq1 = Double.parseDouble(q1);
          fcalo1Sum19 = fcalo1 * fq1;
         
                   
     
     }
     
     
      DB.getConnection();
       ResultSet rsf20 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y20 + "'");
     while(rsf20.next())
     {      
     
         calo20 = rsf20.getString(1);
          carb20 = rsf20.getString(2);
          fat20 = rsf20.getString(3);
          sod20 = rsf20.getString(4);
         double fcalo1 = Double.parseDouble(calo20);
         double fq1 = Double.parseDouble(q20);
          fcalo1Sum20 = fcalo1 * fq1;
                    
   
     }
     
     
      DB.getConnection();
       ResultSet rsf21 = DB.search("SELECT Calories,Carbs,Fat,Sodium FROM nutrition_fact WHERE Food_id='" + y21 + "'");
     while(rsf21.next())
     {      
     
         calo21 = rsf21.getString(1);
         carb21 = rsf21.getString(2);
         fat21 =  rsf21.getString(3);
         sod21 =  rsf21.getString(4);
         double fcalo1 = Double.parseDouble(calo21);
         double fq1 = Double.parseDouble(q21);
         fcalo1Sum21 = fcalo1 * fq1;
            

     }
     
}
 

public void SomOfPDNUT()
{
    
    System.out.print("\n"+fcalo1Sum1);
    
    
}


 

}
