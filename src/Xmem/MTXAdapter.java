/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jackh
 */
public class MTXAdapter extends Member implements MTXAdaptee {

    private String id;
    private String name;
    private String postal;
    private Date goodTill;
    
    private String type;

   

    public MTXAdapter(String id, Date goodTill, String name, String postal) {
        super(id, goodTill, name, postal);
    }

    public Xmem request() throws Exception {
        int mid = Integer.parseInt(id);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String SgoodTill = formatter.format(goodTill);
        
        return new Xmem(mid,type,name,SgoodTill);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPostal() {
        return postal;
    }

    public Date getGoodTill() {
        return goodTill;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public void setGoodTill(Date goodTill) {
        this.goodTill = goodTill;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean validate(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
