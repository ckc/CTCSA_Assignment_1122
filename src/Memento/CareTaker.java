/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Command.Command;
import Xmem.Xmember;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class CareTaker {
      

         //Mememtor save into stack
        Stack<Memento> s1 = new Stack();
        Command cmd;
        Memento memento = new Memento();

    public void saveMyCommand(Command cmd, Xmember xMember){
        this.cmd = cmd;
        memento = new Memento(cmd, xMember);
       s1.push(memento);
    }

    public Command getCmd() {
        return cmd;
    }
    
    
    public void undo(){
        Memento m1 = (Memento)s1.lastElement();
        m1.restore();
        s1.removeElement(m1);
        
    }
   
    public void redo(){
        //Memento m1 = (Memento)undoList.lastElement();
        //m1.restore();
        //undoList.removeElement(m1);
        
    }
      
}
