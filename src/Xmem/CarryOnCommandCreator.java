/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Vector;

/**
 *
 * @author jackh
 */
public class CarryOnCommandCreator  extends Creator {

    //private Vector<Xmember> xmember;
     private boolean contin = true;

    public CarryOnCommandCreator(boolean contin) {
        this.contin = contin;
    }

    public Command createCmd() {
        Command c = new CarryOnCommand(contin);
        return c;
    }
}