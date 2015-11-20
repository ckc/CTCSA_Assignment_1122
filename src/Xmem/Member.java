/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.*;
import java.text.*;
import java.*;

/**
 *
 * @author jackh
 */
public abstract class Member {

    private String id;
    private String name;
    private String postal;
    private Date goodTill;
    public Vector<Member> Xmem;
      
    public Member(){}
    public Member(String id, Date goodTill, String name, String postal) {

        this.id = id;
        this.goodTill = goodTill;
        this.name = name;
        this.postal = postal;

    }

    public abstract boolean validate(String id);

    public String getId() {
        return id;
    }

    public void c(String sid) {
        this.id = sid;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postalAddress) {
        this.postal = postalAddress;

    }

    
    public Date getGoodTill() throws Exception {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 2);

        java.util.Date expirationDate = cal.getTime();

        return expirationDate;
    }

    public void setGoodTill(Date goodTill) throws Exception {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 2);

        java.util.Date expirationDate = cal.getTime();

        this.goodTill = expirationDate;

    }
    @Override
    public String toString() {
        return id + "  " + name + "  " + postal;
    }

}
