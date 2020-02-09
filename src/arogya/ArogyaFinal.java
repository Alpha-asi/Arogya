/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya;

import arogya.UI.Login;
import static com.sun.glass.ui.Cursor.setVisible;
import static java.lang.System.gc;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author vimuk
 */
public class ArogyaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
         // Hide current frame
         //dispose();
        Login();
        
        
    }

    private static void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Login() throws SQLException, ClassNotFoundException {
        
         Login l = new Login();	
	 l.setVisible(true);
         
    }
    
}
