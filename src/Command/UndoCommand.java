package Command;

import Memento.CareTaker;
import Xmem.Xmember;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author ckc
 */
public class UndoCommand implements Command {

    Vector<Xmember> xmem;
    //Stack<Action> history;
    CareTaker ct;
    
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    /* Shape shape; */

    public UndoCommand(CareTaker ct) {
        this.xmem = xmem;
        //this.history = history;
        this.ct = ct;
       
    }
// c | s | a | e | u | r | l | X
    public void execute() {
        try {
            ct.undo();
            //Action action = history.pop();
            //switch (action.getOption()) {
                //case 'c': 
                  //  xmem.add(action.getIndex(), action.getShape());
                    //break; 
                //case 's':
                //case 'a':
                    /*shapes.remove(action.getShape());
                    break;*/
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo(Xmember xmem) {
        
    }

    @Override
    public void redo() {
        
    }
    
}
