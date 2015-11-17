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
public class CreateMemCommandCreator extends Creator {

    private Vector<Xmem> xmem;

    public CreateMemCommandCreator(Vector<Xmem> xmem) {
        this.xmem = xmem;
    }

   

    public Command createCmd() {
        Command c = new CreateMemCommand(xmem);
        return c;
    }
}
