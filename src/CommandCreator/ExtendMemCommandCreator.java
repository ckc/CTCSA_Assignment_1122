/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandCreator;

import Command.Command;
import Command.ExtendMemCommand;
import Xmem.Xmember;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class ExtendMemCommandCreator extends Creator {

    private Vector<Xmember> xmember;
       //Mememtor save into stack
        public Stack <Command>s1;

    public ExtendMemCommandCreator(Vector<Xmember> xmember) {
        this.xmember = xmember;
    }

    public Command createCmd() {
        Command c = new ExtendMemCommand(xmember);
        return c;
    }

    @Override
    public Command createSpecialCmd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
