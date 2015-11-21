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
public class CTXAdapter implements Xmember {

    private String id;
    private String name;
    private String postal;
    private Date goodTill;

    Client client;

    public CTXAdapter(Client client) {
        this.client = client;
    }

    public String getType() {
        if (client instanceof Xmem.VIP) {
            return "VIP";
        } else {
            return "VIP_Family";
        }
    }

    public String getId() {
        return Integer.toString(client.getCid());
    }

    public void setId(String id) {
        id = Integer.toString(client.getCid());
    }

    public String getName() {
        return client.getfulllName();
    }

    public void setName(String name) {
        name = client.getfulllName();
    }

    public String getPostal() {
        return client.getHomeAddress();
    }

    public void setPostal(String postalAddress) {
        postalAddress = client.getHomeAddress();
    }

    public Date getGoodTill() {
        return client.getExpiryDate();
    }

    public void setGoodTill(Date goodTill) {
        goodTill = client.getExpiryDate();
    }

    public String toString() {
        return client.toString();
    }

    public String toString1() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");

        return "ID:" + getId() + "\n" + "Type: " + getType() + "" + "\n" + "Name: " + getName() + "Address: " + "\n"
                + "\n" + getPostal() + "Expire date(DD-MM-YYYY): " + dateFormat.format(getGoodTill()) + "";

    }

}
