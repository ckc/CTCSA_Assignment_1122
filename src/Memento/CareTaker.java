package Memento;

import Command.Command;
import java.util.Stack;

/**
 *
 * @author jackh
 */
public class CareTaker {
      

         //Mememtor save into stack
        Stack<Memento> undo = new Stack();
        Stack<Memento> redo = new Stack();
        Command cmd;
        Memento memento;

    public void saveMyCommand(Command cmd){
        this.cmd = cmd;
        memento = new Memento(cmd);
       undo.push(memento);
       //redo.clear();
      
    }

    public Command getCmd() {
        return cmd;
    }
    
    
    public void undo(){
        Memento m1 = (Memento)undo.lastElement();
        m1.restore();
        redo.push(m1);
        undo.removeElement(m1);
    }
   
    public void redo(){
        Memento m1 = (Memento)redo.lastElement();
        m1.restore();
        undo.push(m1);
        redo.removeElement(m1);
        
    }

    public Stack<Memento> getUndo() {
        return undo;
    }

    public Stack<Memento> getRedo() {
        return redo;
    }
      
}
