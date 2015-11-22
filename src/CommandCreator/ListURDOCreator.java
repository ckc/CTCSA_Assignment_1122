/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandCreator;

import Command.Command;
import Command.ListURDOXCmd;
import Memento.CareTaker;

/**
 *
 * @author ckc
 */
public class ListURDOCreator extends Creator{
private CareTaker ct;

    public ListURDOCreator(CareTaker ct) {
        this.ct = ct;
    }

    @Override
    public Command createCmd() {
        return new ListURDOXCmd(ct);
    }

    @Override
    public Command createSpecialCmd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
