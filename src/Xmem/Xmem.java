/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class Xmem {

    /*private String id;
    private String name;
    private String postal;
    private Date goodTill;
     */
    public int cid;
    public String type;
    public String fullName;
    public String homeAddress;

    public Date expiryDate;
    
    public Vector<Member> Xmem;
    
    public Xmem(int cid, String type, String fullName, String homeAddress) {
        this.cid = cid;
        this.type = type;
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        getExpiryDate();
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getType() {
        return type;
    }

    public String getFullName() {
        return fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    
    

    public Date getExpiryDate() {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 2);

        java.util.Date expirationDate = cal.getTime();

        return expirationDate;
    }

    public void setExpiryDate(Date expiryDate) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 2);

        java.util.Date expirationDate = cal.getTime();

        this.expiryDate = expirationDate;
    }

}
