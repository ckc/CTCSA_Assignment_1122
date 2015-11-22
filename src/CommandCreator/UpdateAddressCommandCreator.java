/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandCreator;

//import del.Xmem;
import Command.Command;
import Command.UpdateAddressCommand;
import Xmem.Xmember;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class UpdateAddressCommandCreator extends Creator {

    private Vector<Xmember> xmem;
    //Mememtor save into stack
    public Stack <Command>s1;
    
    public UpdateAddressCommandCreator(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }

    @Override
    public Command createCmd() {
        Command c = new UpdateAddressCommand(xmem);
        s1.add(c);
        return c;
        
    }

    @Override
    public Command createSpecialCmd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
