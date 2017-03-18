
import java.sql.Connection;
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
public class DataManager {
        
    public HashMap<Integer, Integer> retrieveData() {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Connection conn = new ConnectionManager().getConnection();
        
        try {
           
            String query = "Select * from beacon_data";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet set = stmt.executeQuery();

            while (set.next()) {
                int beaconID = set.getInt(1);
                int count = set.getInt(2);
                map.put(beaconID, count);
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return map;
    }
}
