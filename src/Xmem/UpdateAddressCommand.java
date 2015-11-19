/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.*;
import java.util.*;

/**
 *
 * @author jackh
 */
public class UpdateAddressCommand implements Command {
    
    Vector<Xmem> xmem;
    Xmem x1;
    
    public UpdateAddressCommand(Vector<Xmem> xmem) {
        this.xmem = xmem;
    }
    
    @Override
    public void execute() throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        System.out.println("Enter id (*999 to show all):");
        String u1 = br.readLine();
        
        for (int i = 0; i < xmem.size(); i++) {
            x1.getCid();
            switch (u1) {
                
                case "a":
                    
                    System.out.println("Enter id (*999 to show all): ");
                    String u2 = br.readLine();
                    if (u2 == "*999") {;
                        /*for (Member m2 : member) {
                         System.out.println(m2);
                         }
                         for (Client c2 : clients) {
                         System.out.println(c2);
                         }*/
                        Command Scmd = new ShowMemCommand(xmem);
                        Scmd.execute();
                        
                    } else if (u2.equals(x1.getCid())) {
                        System.out.println("Enter address: ");
                        //setter to set member address
                       /* String u3 = br.readLine();
                         x1.setHomeAddress(u3);
                         */
                        String NewAddress = br.readLine();
                        x1.setHomeAddress(NewAddress);
                        
                        System.out.println("Member address updated.");
                        
                    } else {
                        System.out.println("assignment is suck");
                    }
            }
        }
    }
    
    public void undo() {
        
    }
    
    public void redo() {
        
    }
    
}
