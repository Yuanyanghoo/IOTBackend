
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuanyang
 */
public class ConnectionManager {
    
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:8889/iot";
        String username = "root";
        String password = "root";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
     }

}
