/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

/**
 *
 * @author jackh
 */
public class PrimaryMember extends Member {

    public PrimaryMember(String id, String name, String postal, String type) {
        super(id, name, postal, type);
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
