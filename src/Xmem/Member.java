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

    public Member() {
    }

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

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public Date getGoodTill() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.format(goodTill);
        return goodTill;
    }

    public void setGoodTill(int i) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, i);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        java.util.Date expirationDate = cal.getTime();

        dateFormat.format(expirationDate);

        this.goodTill = expirationDate;

    }

    public String toString() {
        return " ";
    }

}
