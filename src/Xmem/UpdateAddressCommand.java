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
        if (u2 == "*999") {
            System.out.println("Member address updated.");
            Command Scmd = new ShowMemCommand(xmem);
            Scmd.execute();

        } else if(u2.length()==8 || u2.length()==9){
            for (Xmember x1 : xmem) {
                if (u2.equals(x1.getId())) {
                    System.out.println("Enter address: ");

                    String NewAddress = br.readLine();

                    x1.setPostal(NewAddress);

                } else {
                    System.out.println("assignment is suck");
                }
            }
        }
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
