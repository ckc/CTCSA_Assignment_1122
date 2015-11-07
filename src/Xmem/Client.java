/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.util.Date;

/**
 *
 * @author jackh
 */
public abstract class Client {

    private int cid;
    private Date expiryDate;
    private String fullName;
    private String homeAddress;

    private String type;

    public Client(int cid, String type, String fullName, String homeAddress) {
        this.cid = cid;
        this.type = type;
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        this.expiryDate = expiryDate;
    }

    public int getCid() {
        return cid;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getType() {
        return type;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setExpiryDate() {
        Date d1 = new Date();

        this.expiryDate = d1;
    }
    
    public abstract boolean valiadte(Client id);

    @Override
    public String toString() {
        return "Client{" + "cid=" + cid + ", expiryDate=" + expiryDate + ", fullName=" + fullName + ", homeAddress=" + homeAddress + ", type=" + type + '}';
    }

}
