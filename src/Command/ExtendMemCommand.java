/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Command.Command;
import Xmem.Xmember;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class ExtendMemCommand implements Command {

    //Mememtor save into stack
    public Stack <Command>s1;
    
    public Vector<Xmember> xmem;

    public ExtendMemCommand(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }

    public void execute() throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

          System.out.println("Enter id: ");
          String u2 = br.readLine();
          
          switch (u2) {
            
                
            default:
                for (Xmember x1 : xmem) {
                            if (u2.equals( x1.getId())) {
                               
                                
                               x1.setGoodTill(2);
                                System.out.println("Membership extended: ");
                                
                                System.out.println(dateFormat.format(x1.getGoodTill())+"\t"+x1.getId()+"\t"+x1.getType()+"\t"+x1.getPostal());

                                break;
                            }else{
                                System.out.println("Some Unexpected error");
                            }
                }
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
