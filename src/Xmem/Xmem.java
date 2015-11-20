/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.text.DecimalFormat;

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

    Date d1 = new Date();
    
    public Vector<Member> Xmem;

    public Xmem() {

    }

    public Xmem(int cid, String type, String fullName, String homeAddress) {
        this.cid = cid;
        this.type = type;
        this.fullName = fullName;
        this.homeAddress = homeAddress;

        setExpiryDate(d1, 1);
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

        /*   Date date = new Date();
         Calendar cal = Calendar.getInstance();
         cal.setTime(date);
         cal.add(Calendar.YEAR, 1);

         java.util.Date expirationDate = cal.getTime();
         */
        return expiryDate;
    }

    public void abc() {
        DecimalFormat tflz;
        DecimalFormat tf;
        tf = new DecimalFormat("#0");
        tflz = new DecimalFormat("00");
        Calendar calendar = Calendar.getInstance();
        StringBuffer buf = new StringBuffer();
        buf.append(tf.format(calendar.get(Calendar.DATE)));
        buf.append('-');
        buf.append(tflz.format(calendar.get(Calendar.MONTH)));
        buf.append('-');
        buf.append(tflz.format(calendar.get(Calendar.YEAR)));

    }

    public void setExpiryDate(Date expiryDate, int y) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, y);

        java.util.Date expirationDate = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.format(expirationDate);
        this.expiryDate = expirationDate;
    }
   
    public int[] getDigitsOf(int num) {
        int digitCount = Integer.toString(num).length();

        if (num < 0) {
            digitCount--;
        }

        int[] result = new int[digitCount];

        while (digitCount-- > 0) {
            result[digitCount] = num % 10;
            num /= 10;
        }
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");

        return "" + dateFormat.format(expiryDate) + " " + cid + " " + type + " " + fullName + " " + homeAddress;
    }

    public String toString1() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");

        return "" + "Member information" + "/n ype: " + getType() + "/n Name: "
                + getFullName() + "/n Address: " + getHomeAddress() + "/n Expire date(DD-MM-YYYY): " + getExpiryDate() + "";
    }

}
