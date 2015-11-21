/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class ExtendMemCommand implements Command {
    
    public Vector<Xmember> xmem;
    
    
    public ExtendMemCommand(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }
    
    public void execute() throws Exception {
        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String c = br.readLine();


            System.out.println("Enter id (*999 to show all):");
            

                switch (c) {
                    case "*999":
                   Command Scmd = new ShowMemCommand(xmem);
                   Scmd.execute();

                       
                    
                    default:
                        System.out.println("Input data length wrong.");
                }
                }catch(Exception e){
                  System.out.println("Some Unexpected error.");
                   System.exit(0);
                   e.printStackTrace();
                }       
    }

    public void undo() {

    }

    public void redo() {

    }

}
