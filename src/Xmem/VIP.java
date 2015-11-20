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
public class VIP extends Client {

    public VIP(int cid, String fullName, Date expiryDate, String homeAddress) {
        super(cid, fullName, expiryDate, homeAddress);
    }

   public boolean validateVIP(int cid) {

        int sum = 0;
        int[] digits = getDigitsOf(cid);

        while (digits.length == 9) {
            for (int i = 0; i < digits.length; i++) {
                /*
                 The VIP_Family number is started with 3 fix
                 digits “303”. 
                 */
                if (digits[0] == 3 && sum % 6 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        System.out.println("The VipId length isn't 9");
        return false;

    }

}
