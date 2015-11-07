/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.time.LocalDateTime;
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

    //TYPE 唔洗加?
    private String type;

//constractor 假設無入goodtill 就自動加goodTill
    public Member(String id, String type, String name, String postal) throws Exception {
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

    public Date getGoodTill() throws Exception {

        String pattern = "MMddyyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String dateString = format.format(new Date());
        Date d1 = new Date();
             d1.getYear();
        return d1;
    }

    public void setGoodTill(Date goodTill) throws Exception {
        try {
            Calendar calendar = Calendar.getInstance();

            DecimalFormat tf = new DecimalFormat("#0");
            DecimalFormat tflz = new DecimalFormat("00");

            StringBuffer buf = new StringBuffer();
            Date date = new Date();

            buf.append(tf.format(calendar.get(Calendar.DATE)));
            buf.append('-');
            buf.append(tflz.format(calendar.get(Calendar.DAY_OF_MONTH)));
            buf.append('-');
            buf.append(tflz.format(calendar.get(Calendar.YEAR)));
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            DateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            format1.format(date);
            this.goodTill = date;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return goodTill + "  " + id + " " + type + "  " + name + "  " + postal;
    }

}
