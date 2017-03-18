
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class iotApp {

    public static void main(String[] args) {
     DataManager dm = new DataManager();
     HashMap<Integer,Integer> map = dm.retrieveData();
     Iterator<Integer> iter = map.keySet().iterator();
     
     System.out.println("Printing dataset..");
     System.out.println();
     while(iter.hasNext()) {
         int beaconID = iter.next();
         System.out.println(beaconID + ": " + map.get(beaconID));
     }
    
    }
    
}
