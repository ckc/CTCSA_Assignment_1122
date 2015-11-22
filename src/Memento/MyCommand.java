/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Command.Command;
import java.util.Stack;

/**
 *
 * @author jackh
 */
public class MyCommand {

     public Stack <Command>s1;
     int State;
     
     Stack <Command> tempCommand;

     
     
     
    public MyCommand(Stack <Command>s1) {
        this.s1 = tempCommand;
    }

    public void setState(int State) {
        this.State = State;
    }

    public int getState() {
        return State;
    }

    public void doAction() {
        State++;
    }
}
