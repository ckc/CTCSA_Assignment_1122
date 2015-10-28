/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.util.Date;

/**
 *
 * @author jackh
 */
public abstract class Member {
        private String id;
        private Date goodTill;
        private String name;
        private String postal;
        
        //TYPE 唔洗加?
        private String type;
    
//constractor
    public Member(String id, String name, String postal, String type) {
        this.id = id;
        this.name = name;
        this.postal = postal;
        this.type = type;
    }
        
    public abstract boolean validate (String id);
    
    public String getId(){
        return id;
    }
    public void setId(String sid){
        this.id = sid;
    } 
    
    public Date getGoodTill(){
        return goodTill;    
    }
    public void setGoodTill(Date goodTill) {
        this.goodTill = goodTill;
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
    
}
