/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLTS;

import AJCS.Member;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public Client(){
    }
    public Client(int cid, String fullName, Date expiryDate, String homeAddress) {
        this.cid = cid;
        this.fullName = fullName;
        this.expiryDate = expiryDate;
        this.homeAddress = homeAddress;
    }

    public abstract boolean validate(int cid);

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getExpiryDate() {
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
          dateFormat.format(expiryDate);
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        
     /*    Date date = new Date();
        Calendar cal = Calendar.getInstance();
     
        cal.add(Calendar.YEAR, i);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
          
        java.util.Date expirationDate = cal.getTime();
          
        dateFormat.format(expirationDate);
        */
        this.expiryDate = expiryDate;
    }

    public String getfulllName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String toString() {
          return  " ";
    }

}
