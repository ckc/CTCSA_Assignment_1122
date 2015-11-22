package Memento;

import Command.Command;
import java.util.Stack;

/**
 *
 * @author jackh
 */
public class MyCommand {

     //public Stack <Command>s1;
     int State;
     
     Stack <Command> tempCommand;

     
     
     
    public MyCommand(Stack <Command>s1) {
        //this.s1 = tempCommand;
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
