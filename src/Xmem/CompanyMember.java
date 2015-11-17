/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.*;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class CompanyMember extends Member {

    public Vector<Member> member;

    public CompanyMember(String id, Date goodTill, String name, String postal) {
        super(id, goodTill, name, postal);
    }

    public boolean validate(String id) {
        int sum = 0;
        String numbers[] = id.split("");
        if (numbers.length <= 8) {
            for (int i = 0; i < numbers.length; i++) {
                int num = Integer.parseInt(numbers[i]);
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
    //The sum of all digits (include check digit) of 
    //company membership number modulo 8 is zero. 
    //The validate() method of PrimaryMember and the Company classes will 
    //check the id is valid or not.  
}
