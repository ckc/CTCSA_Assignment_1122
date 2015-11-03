/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.util.Date;

import java.text.*;

/**
 *
 * @author jackh
 */
import java.text.DateFormat;

public abstract class Member {

    private String id;
    private String name;
    private String postal;
    private Date goodTill;

    //TYPE 唔洗加?
    private String type;

//constractor
    public Member(String id, String type, String name, String postal) {

        this.id = id;
        this.type = type;
        this.name = name;
        this.postal = postal;

    }

    public Member(String id, String type, String name, String postal, Date goodTill) {

        this.id = id;
        this.type = type;
        this.name = name;
        this.postal = postal;
        this.goodTill = goodTill;
    }

    public abstract boolean validate(String id);

    public String getId() {
        return id;
    }

    public void setId(String sid) {
        this.id = sid;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getGoodTill() {
        Date myDate = new Date();
        new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        return myDate;
    }

    public Date setGoodTill(Date goodTill) {

        Date myDate = new Date();
        new SimpleDateFormat("dd-MM-yyyy").format(myDate);
         
        return myDate;

    }

    @Override
    public String toString() {
        return goodTill + "  " + id + " " + type + "  " + name + "  " + postal;
    }

}
