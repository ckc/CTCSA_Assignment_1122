/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Vector;

/**
 *
 * @author ckc
 */
public class UndoCommandCreator {

    private Vector<Xmember> xmem;

    public UndoCommandCreator(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }
@Override
    public Command createCmd() {
        Command c = new UndoCommand();
        return c;
    }

}
