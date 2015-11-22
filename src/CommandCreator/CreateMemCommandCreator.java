package CommandCreator;

//import del.Xmem;
import Command.Command;
import Command.CreateMemCommand;
import Xmem.Xmember;
import java.util.Stack;
import java.util.Vector;
import Memento.CareTaker;

/**
 *
 * @author jackh
 */
public class CreateMemCommandCreator extends Creator {

    private Vector<Xmember> xmember;
    private CareTaker ct;
       //Mememtor save into stack
        //public Stack <Command>s1;

    public CreateMemCommandCreator(Vector xmember, CareTaker ct) {
        this.xmember = xmember;
        this.ct = ct;
    }

   

    public Command createCmd() {
        Command c = new CreateMemCommand(xmember, ct);
        //s1.add(c);
        return c;
    }

    @Override
    public Command createSpecialCmd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
