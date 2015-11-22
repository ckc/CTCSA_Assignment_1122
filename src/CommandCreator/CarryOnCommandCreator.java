/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandCreator;

import Command.CarryOnCommand;
import Command.Command;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class CarryOnCommandCreator  extends Creator {

    //private Vector<Xmember> xmember;
     private boolean contin = true;
        //Mememtor save into stack
         //public Stack <Command>s1;

    public CarryOnCommandCreator(boolean contin) {
        this.contin = contin;
    }

    public Command createCmd() {
        Command c = new CarryOnCommand(contin);
        //s1.add(c);
        return c;
    }
    @Override
    public Command createSpecialCmd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}