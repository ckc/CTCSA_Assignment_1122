/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Command.Command;
import java.util.Stack;

import CommandCreator.Creator;
import Command.Command;
import CommandCreator.CreateMemCommandCreator;
import CommandCreator.UpdateAddressCommandCreator;
import CommandCreator.ShowMemCommandCreator;
import CommandCreator.CarryOnCommandCreator;
import CommandCreator.ExtendMemCommandCreator;

import Xmem.*;

/**
 *
 * @author jackh
 */
public class Memento {
    Stack <Command>tempCommand;

    public Memento() {
    }
   
    
    public Memento(MyCommand mycommand) {
        tempCommand = mycommand;
        
    }

    public Stack <Command>  getSavedCommand() {
        return tempCommand;
    }

}