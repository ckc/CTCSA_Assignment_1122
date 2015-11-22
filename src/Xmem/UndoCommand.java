/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author ckc
 */
public class UndoCommand implements Command {

    Vector<Xmember> xmem;
    Stack<Action> history;
    
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    /* Shape shape; */

    public UndoCommand(Vector<Xmember> shapes, Stack<Action> history) {
        this.xmem = xmem;
        this.history = history;
    }
// c | s | a | e | u | r | l | X
    public void execute() {
        try {
            Action action = history.pop();
            switch (action.getOption()) {
                case 'c': 
                    xmem.add(action.getIndex(), action.getShape());
                    break; 
                case 's':
                case 'a':
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
