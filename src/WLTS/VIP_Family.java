/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLTS;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public  class VIP_Family extends Client {

    public VIP_Family(int cid, String fullName, Date expiryDate, String homeAddress) {
        super(cid, fullName, expiryDate, homeAddress);
    }

    public boolean validate(int id) {
        int sum = 0;
        
         String clients[] = Integer.toString(id).split("");
        if (clients.length <= 8) {
            for (int i = 0; i < clients.length; i++) {
                int num = Integer.parseInt(clients[i]);
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
            }
            if (sum % 8 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

  
    
}
