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
public class PrimaryMember extends Member {
     public Vector<Member> member;
    public PrimaryMember(String id, String type, String name, String postal,Date goodTill) {
        super(id, type, name, postal,goodTill);
    }

    public boolean validate(String id) {
        return true;
        //Sample “Primary” membership number is 31201221; 
        //“Company” membership number is 31111225; 
        //as the last digit is check digit.
        //The sum of all digits (include check digit) of 
        //primary membership number modulo 3 is zero.
    }

}
