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
      Vector undoList = new Vector();
     
         //Mememtor save into stack
        public Stack <Command>s1;

    public void saveMyCommand(Stack <Command>s1){
       Memento m1 = new Memento(s1);
       undoList.add(m1);
    }
    
    public void undo(){
        Memento m1 = (Memento)undoList.lastElement();
        m1.restore();
        undoList.removeElement(m1);
        
    }
    
        
    public void redo(){
        Memento m1 = (Memento)undoList.lastElement();
        m1.restore();
        undoList.removeElement(m1);
        
    }
      
}
