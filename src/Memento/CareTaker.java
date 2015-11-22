package Memento;

import Command.Command;
import Command.CreateMemCommand;
import Command.ExtendMemCommand;
import Command.UpdateAddressCommand;
import Xmem.Xmember;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class CareTaker {
      

         //Mememtor save into stack
        Stack<Memento> undo = new Stack();
        Stack<Memento> redo = new Stack();
        Command cmd;
        Memento memento = new Memento();

    public void saveMyCommand(Command cmd){
      if(cmd instanceof CreateMemCommand || cmd instanceof ExtendMemCommand || cmd instanceof UpdateAddressCommand){
        this.cmd = cmd;
        memento = new Memento(cmd);
       undo.push(memento);
       //redo.clear();
      }
    }

    public Command getCmd() {
        return cmd;
    }
    
    
    public void undo(){
        Memento m1 = (Memento)undo.lastElement();
        m1.restore();
        undo.removeElement(m1);
        redo.push(m1);
    }
   
    public void redo(){
        Memento m1 = (Memento)redo.lastElement();
        m1.restore();
        redo.removeElement(m1);
        undo.push(m1);
    }
      
}
