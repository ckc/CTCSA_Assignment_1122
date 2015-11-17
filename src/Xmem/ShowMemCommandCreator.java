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
public class ShowMemCommandCreator extends Creator {

    private Vector<Xmem> xmem;

    public ShowMemCommandCreator(Vector<Xmem> xmem) {
        this.xmem = xmem;
    }

    @Override
    public Command createCmd() {
        Command c = new ShowMemCommand(xmem);
        return c;
    }

}
