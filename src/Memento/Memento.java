/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Command.Command;

/**
 *
 * @author jackh
 */
public class Memento {
    private Command cmd;
    
    public Memento(Command cmd) {
    this.cmd = cmd;
       
    }

   
    public void restore() {
       cmd.undo();
    }
    
    public void redo(){
        cmd.redo();
    }

    @Override
    public String toString() {
        return cmd.toString();
    }

}
