
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class iotApp {

    public static void main(String[] args) {
     DataManager dm = new DataManager();
     ArrayList<Beacon> list = dm.retrieveData();

     for (int i = 0 ; i < list.size(); i++) {
         Beacon b = list.get(i);
         System.out.println(b.getTimestamp() + " | " + b.getBeaconID() + " - " + b.getUuid() + " : " + b.getCount());
     }
    }
    
}
