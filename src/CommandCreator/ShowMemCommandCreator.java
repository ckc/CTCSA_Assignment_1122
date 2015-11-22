/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandCreator;

//import del.Xmem;
import Command.Command;
import Command.ShowMemCommand;
import Xmem.Xmember;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class ShowMemCommandCreator extends Creator {

    private Vector<Xmember> xmem;    
    private String id ;
    //Mememtor save into stack
    //public Stack <Command>s1;

    public ShowMemCommandCreator(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }
    
     public ShowMemCommandCreator(String id) {
        this.id = id;
    }
    
    @Override
    public Command createCmd() {
        Command c = new ShowMemCommand(xmem);
//        s1.add(c);
        return c;
      
    }
    public Command createSpecialCmd(){
        Command SEM = new ShowMemCommand(id);
        return SEM;
    }

}
