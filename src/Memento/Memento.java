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
public class Memento {
    Stack <Command>tempCommand;
  

    public Memento(Stack <Command> CommandToSave) {
        tempCommand = CommandToSave;
    }

    public Stack <Command>  getSavedCommand() {
        return tempCommand;
    }

}
