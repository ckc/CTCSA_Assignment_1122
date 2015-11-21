/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class MTXAdapter implements Xmember {

    Member m1;
 
    private Date goodTill;
    public MTXAdapter(Member m1) {
        this.m1 = m1;
    }
    public String getType() {
        if( m1 instanceof Xmem.CompanyMember){
            return "CompanyMember";
        }else{
            return "PrimaryMember";
        }
    }

    public String getId() {
        return m1.getId();
    }
    public void setId(String id) {
        m1.setId(id);
    }

    public String getName() {
        return m1.getName();
    }
    public void setName(String name) {
        m1.setName(name);
    }

    public String getPostal() {
        return m1.getPostal();
    }
    public void setPostal(String postalAddress) {
        m1.setPostal(postalAddress);
    }

    
    public Date getGoodTill(){
      return m1.getGoodTill();
    }
    public void setGoodTill(Date goodTill) {
       m1.setGoodTill(goodTill);
       
    }

    public String toString() {
        return  " " + getGoodTill() + " " + getId() + " " + getType() + " " + getName() + " " + getPostal();
    }

    public String toString1() {   
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
       return  "ID:" + getId()+"\n"+"Type: " + getType()+""+"\n"+"Name: " + getName()+"Address: " +"\n"
                            +"\n"+ getPostal()+"Expire date(DD-MM-YYYY): " + dateFormat.format(getGoodTill())+"";
         
    }

}
