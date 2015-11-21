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
public class ExtendMemCommandCreator extends Creator {

    private Vector<Xmember> xmember;

    public ExtendMemCommandCreator(Vector<Xmember> xmember) {
        this.xmember = xmember;
    }

    public Command createCmd() {
        Command c = new CreateMemCommand(xmember);
        return c;
    }
}