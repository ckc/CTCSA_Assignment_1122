/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Command.Command;
import Xmem.Action;
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

    Vector<Xmember> shapes;
    Stack<Action> history;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    /* Shape shape; */

    public UndoCommand(Vector<Xmember> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    public void execute() {
        try {
            Action action = history.pop();
            switch (action.getOption()) {
           /*     case 3: 
                    shapes.add(action.getIndex(), action.getShape());
                    break; */
                case 4:
                case 5:
                    /*shapes.remove(action.getShape());
                    break;*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {
    }

    @Override
    public void redo() {
    }
    
}
