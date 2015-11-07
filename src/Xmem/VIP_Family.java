/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class VIP_Family extends Client {

    public Vector<Client> clients;

    public VIP_Family(int cid,String type,String fullName,String homeAddress) {
         super(cid,type ,fullName, homeAddress);
         setExpiryDate();
    }

    public boolean valiadte(Client id) {
        return true;
    }
    
}
