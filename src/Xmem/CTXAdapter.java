/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Date;

/**
 *
 * @author jackh
 */
public class CTXAdapter extends Client implements CTXAdaptee {

    private int cid;
    private Date expiryDate;
    private String fullName;
    private String homeAddress;
    private String type;
    
     public String[] split1 ;
    
    public CTXAdapter(int cid, String fullName, Date expiryDate, String homeAddress) {
        super(cid, fullName, expiryDate, homeAddress);
    }

    //convert client to member Adapter
    public Xmem request() throws Exception {

        return new Xmem(cid,type,fullName,homeAddress);
    }

    public int getCid() {
        return cid;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getType() {
        return type;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setType(String type) {
        if (type == "VIP") {
            this.type = "VIP";
        } else {
            this.type = "VIPF";
        }
    }

    public void setExpiryDate() {
        Date d1 = new Date();

        this.expiryDate = d1;
    }

    @Override

    public String toString() {
        return "" + expiryDate + ", " + cid + ", " + type + ", " + fullName + ", " + homeAddress;
    }

    @Override
    public boolean validate(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
