package com.miew.zoo;

/**
 * Created by Apinya on 7/13/2016.
 */
public class ZooKeeper {
    private String ZooKeeperID;
    private String ZooKeeperName;
    private String ZooKeeperGender;



    public String getZooKeeperID() {
        return ZooKeeperID;
    }

    public void setZooKeeperID(String zooKeeperID) {
        ZooKeeperID = zooKeeperID;
    }

    public String getZooKeeperName() {
        return ZooKeeperName;
    }

    public void setZooKeeperName(String zooKeeperName) {
        ZooKeeperName = zooKeeperName;
    }

    public String getZooKeeperGender() {
        return ZooKeeperGender;
    }

    public void setZooKeeperGender(String zooKeeperGender) {
        ZooKeeperGender = zooKeeperGender;
    }

    public void eatFeed(){
        //Give feed to animals
    }
}
