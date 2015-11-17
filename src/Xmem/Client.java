/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public abstract class Client {

    private int cid;
    private Date expiryDate;
    private String fullName;
    private String homeAddress;

    public Vector<Member> Xmem;

    public Client(int cid, String fullName, Date expiryDate, String homeAddress) {
        this.cid = cid;
        this.fullName = fullName;
        this.expiryDate = expiryDate;
        this.homeAddress = homeAddress;
    }

    public abstract boolean validate(Client id);

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date ex) {
        //ex ??
        Date d1 = new Date();
        this.expiryDate = d1;
    }

    public String getlName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String ha) {
        this.homeAddress = ha;
    }

    @Override
    public String toString() {
        return "Client{" + "cid=" + cid + ", expiryDate=" + expiryDate + ", fullName=" + fullName + ", homeAddress=" + homeAddress + '}';
    }

}