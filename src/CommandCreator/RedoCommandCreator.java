package CommandCreator;

import Command.Command;
import Command.UndoCommand;
import Memento.CareTaker;
import Xmem.Xmember;
import java.util.Vector;

/**
 *
 * @author ckc
 */
public class RedoCommandCreator extends Creator {

    private Vector<Xmember> xmem;
    private CareTaker ct;

    public RedoCommandCreator(CareTaker ct) {
        this.ct = ct;
    }
@Override
    public Command createCmd() {
        Command c = new UndoCommand(ct);
        return c;
    }

    @Override
    public Command createSpecialCmd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
