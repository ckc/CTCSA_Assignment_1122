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
public class CompanyMember extends Member {
    public Vector<Member> member;
    
    public CompanyMember(String id, String type, String name, String postal,Date goodTill) {
        super(id, type, name, postal,goodTill);
    }

    public boolean validate(String id) {
        return true;

        //The sum of all digits (include check digit) of 
        //company membership number modulo 8 is zero. 
        //The validate() method of PrimaryMember and the Company classes will 
        //check the id is valid or not.  
    }

}
