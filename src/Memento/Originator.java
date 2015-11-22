package Memento;

import Xmem.Xmember;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class Originator {
     Vector undoList = new Vector();
      //Vector redoList = new Vector();
      private Vector<Xmember> xmember;

    public Originator(Vector<Xmember> xmember) {
        this.xmember = xmember;
    }

    public void restore(){
    
    }

      public void redo(){
    
    }
}
