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

    public boolean validate(int cid) {
        int sum = 0;

        String clients[] = Integer.toString(cid).split("");

        if (clients.length <= 9) {
            for (int i = 0; i < clients.length; i++) {
                int num = Integer.parseInt(clients[i]);
                while (num > 0) {
                    //The VIP number is started with digit '3'
                    sum += num % 10;
                    num /= 10;
                }
            }
            if (sum % 6 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
