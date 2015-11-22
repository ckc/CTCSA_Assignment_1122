/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Date;

/**
 *
 * @author a1
 */
public interface Xmember {
    
    public String getId();
    public void setId(String id);

    public String getName();
    public void setName(String name);
    
    public String getType();

    public String getPostal();
    public void setPostal(String postalAddress);

    public Date getGoodTill();
    public void setGoodTill(Date goodTill);

    // for searching Xmember
    public String toString();
    public String toString1();
    
}
