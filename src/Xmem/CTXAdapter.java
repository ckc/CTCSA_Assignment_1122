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
public class CTXAdapter implements Xmember{

    Client c1;
    public CTXAdapter(Client c1){
        this.c1 = c1;
    }
    
  

    
    public int getId(String id) {
        return c1.getCid();
        
    }
    public void setId(int cid) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        c1.setCid(cid);
    }
    
    public 

   
   
    
}
