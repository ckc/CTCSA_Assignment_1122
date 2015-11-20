    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class MTXAdapter implements Xmember {
    Member m1;
  
    public MTXAdapter(Member m1){
        this.m1 = m1;
    }

   public String getId(){
     return  m1.getId();
   }
   public void setId(String id){
       m1.setId(id);
   } 
   
   public Date getgoodTill()throws Exception{
       return m1.getGoodTill();
   }
   public void setgoodTill(Date goodTill)throws Exception{
       m1.setGoodTill(goodTill);
   }
   
   
}
