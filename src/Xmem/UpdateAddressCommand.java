/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

//import del.Xmem;
import java.io.*;
import java.util.*;

/**
 *
 * @author jackh
 */
public class UpdateAddressCommand implements Command {
    
    Vector<Xmember> xmem;
    
    public UpdateAddressCommand(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }
    
    @Override
    public void execute() throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
       
        
               
                    System.out.println("Enter id (*999 to show all): ");
                    String u2 = br.readLine();
                    for(Xmember member : xmem) {
                        if(u2.equals(member.getId())) {
                        System.out.println("Enter address: ");
                        
                        String NewAddress = br.readLine();
                        member.setPostal(NewAddress);
                        
                        System.out.println("Member address updated.");
                        Command Scmd = new ShowMemCommand(xmem);
                        Scmd.execute();
                        } else {
                            System.out.println("assignment is suck");
                        }
                    }
 //if (u2.equals(xmem.get(i).getId())) {
                        
                    
        
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
