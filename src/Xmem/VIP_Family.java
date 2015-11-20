/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class VIP_Family extends Client {
    
    public VIP_Family(int cid, String fullName, Date expiryDate, String homeAddress) {
        super(cid, fullName, expiryDate, homeAddress);
    }
    
     public boolean validateVIPF(int cid) {

        int[] digits = getDigitsOf(cid);

        while (digits.length == 9) {
            for (int i = 0; i < digits.length; i++) {
                /*
                 The VIP_Family number is started with 3 fix
                 digits “303”. 
                 */
                int sum = 0;
                sum += digits[i];
                if (digits[0] == 3 && digits[1] == 0 && digits[2] == 3 && sum % 6 == 0) {
                    return true;
                } else {
                    System.out.println("The VipId length isn't 9");
                    return false;
                }
            }
        }

        return false;
    }
}
