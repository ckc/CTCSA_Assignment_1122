/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Memento.CareTaker;
import Memento.Memento;

/**
 *
 * @author ckc
 */
public class ListURDOXCmd implements Command{

    private CareTaker ct;

    public ListURDOXCmd(CareTaker ct) {
        this.ct = ct;
    }
    
    
    @Override
    public void execute() throws Exception {
        for(Memento m : ct.getUndo()){
            System.out.println("Undo:");
            System.out.println(m.toString());
        }
        for(Memento m : ct.getRedo()){
           
            System.out.println("Redo:");
            System.out.println(m.toString());
        }
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
