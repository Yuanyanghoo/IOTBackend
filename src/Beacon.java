/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuanyang
 */
public class Beacon {
    
    private String beaconID;
    private String uuid;
    private int count;
    private String timestamp;

    
    public Beacon(String beaconID, String uuid, int count, String timestamp) {
        this.beaconID = beaconID;
        this.uuid = uuid;
        this.count = count;
        this.timestamp = timestamp;
    }
    
    public String getBeaconID() {
        return beaconID;
    }

    public void setBeaconID(String beaconID) {
        this.beaconID = beaconID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    
}
