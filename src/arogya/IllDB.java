package arogya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IllDB {

    private static Connection connection;

    public static void getConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arogya","root","");
            //"jdbc:mysql://localhost:3306/tecvision", "root", "123"
        } catch (Exception e) {
        }

    }

    public static ResultSet search(String query) throws ClassNotFoundException, SQLException {
        if (connection == null) {
            getConnection();
        }
      
        ResultSet rs = connection.createStatement().executeQuery(query);
        return rs;
    }

    public static void Execute(String query) throws ClassNotFoundException, SQLException {
        if (connection == null) {
            getConnection();
        }
        connection.createStatement().executeUpdate(query);
      //  connection.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
            IllDB.getConnection();
       
    }
}
