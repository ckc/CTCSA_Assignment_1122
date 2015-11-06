/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;
import java.*;
import java.util.Date;
import java.util.Vector;
/**
 *
 * @author jackh
 */
public class PrimaryMember extends Member {
     public Vector<Member> member;
    public PrimaryMember(String id, String type, String name, String postal)throws Exception {
        
        super(id, type, name, postal);
    }
 /*    public PrimaryMember(Date goodTill,String id, String type, String name, String postal)throws Exception {
        super(id, type, name, postal);
        setGoodTill(goodTill);
         
        
    }
*/
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
            if (sum % 3 == 0) {
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }
        //Sample “Primary” membership number is 31201221; 
        //“Company” membership number is 31111225; 
        //as the last digit is check digit.
        //The sum of all digits (include check digit) of 
        //primary membership number modulo 3 is zero.
    

}
