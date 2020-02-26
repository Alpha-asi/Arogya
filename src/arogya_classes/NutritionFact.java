/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya_classes;

import arogya.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class NutritionFact {
    
    private String nutritionFactid,foodid,adminid;
    private int perServing,calories,carbs,fat,protein,vitaminA,vitaminB,vitaminC,fiber,potassium,magnesium,sodium;
    
    private void getFoodData()
    {
        
        
        
    }
    
    
    private void sendFoodData()
    {
        
        
        
    }
int admn;
    
    public void insertNutritionFact(String Admin,String Calories,String Carbs,String Fat,String Protein,String Vitamin_a,String Vitamin_b,String Vitamin_c,String Fiber,String Potasium,String Magnesium,String Sodium) throws ClassNotFoundException, SQLException
    {
         DB.getConnection();
      String x1;
   ResultSet rs = DB.search("SELECT * FROM admin_log WHERE Username='" + Admin + "'");
    while(rs.next()){
     x1=rs.getString(1);
      admn = Integer.parseInt(x1);
 
    }
        System.out.print("cdsacascasc"+admn);
        
       
        DB.Execute("INSERT INTO nutrition_fact(Calories,Carbs,Fat,Protein,Vitamin_A,Vitamin_B,Vitamin_C,Fiber,Potasium,Magnesium,Sodium,Admin_id,Food_id) VALUES ('" + Calories + "','" + Carbs + "','" + Fat + "','" + Protein + "','" + Vitamin_a + "','" + Vitamin_b + "','" + Vitamin_c + "','" + Fiber + "','" + Potasium + "','" + Magnesium + "','" + Sodium + "','" + admn + "',101)");
        
        
    }
    
    
     private void updateNutritionFact()
    {
        
        
        
    }
     
     
      private void deleteNutritionFact()
    {
        
        
        
    }
    
}
