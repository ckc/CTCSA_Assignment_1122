/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;


import java.util.*;
import java.util.GregorianCalendar;
/**
 *
 * @author jackh
 */
public abstract class Member {

    private String id;
    private String name;
    private String postal;
    private Date goodTill;

    //TYPE 唔洗加?
    private String type;

//constractor 假設無入goodtill 就自動加goodTill
    public Member(String id, String type, String name, String postal) {
        setGoodTill(goodTill);
        this.id = id;
        this.type = type;
        this.name = name;
        this.postal = postal;

    }
/*
    public Member(String id, String type, String name, String postal, Date goodTill)  {
        setGoodTill(goodTill);
        this.id = id;
        this.type = type;
        this.name = name;
        this.postal = postal;
        
    }
*/
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
       Date d1 = new Date();
        int day = d1.getDate();  
        int month = d1.getMonth();
        int year = d1.getYear();
        
        return d1;
    }

    public void setGoodTill(Date goodTill) {
        Date d1 = new Date();
            int day = d1.getDate();  
            int month = d1.getMonth();
            int year = d1.getYear();
            
            this.goodTill  = d1;
         
    }

    @Override
    public String toString() {
        return goodTill + "  " + id + " " + type + "  " + name + "  " + postal;
    }

}
