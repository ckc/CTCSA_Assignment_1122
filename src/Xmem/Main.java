/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

//import del.Xmem;
import CommandCreator.Creator;
import Command.Command;
import CommandCreator.CreateMemCommandCreator;
import CommandCreator.UpdateAddressCommandCreator;
import CommandCreator.ShowMemCommandCreator;
import CommandCreator.CarryOnCommandCreator;
import CommandCreator.ExtendMemCommandCreator;
import CommandCreator.ListURDOCreator;
import CommandCreator.RedoCommandCreator;
import CommandCreator.UndoCommandCreator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Memento.*;
import Memento.CareTaker;

import java.util.Stack;

import java.util.Vector;

/**
 *
 * @author jackh
 */
public class Main {
         public Stack s1;

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Vector<Xmember> xmem = new Vector<Xmember>();
        CareTaker ct = new CareTaker();

        boolean contin = true;
        boolean cont = true;

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        Command cmd;
        Creator Creators[] = {new CreateMemCommandCreator(xmem, ct),
            new ShowMemCommandCreator(xmem),
            new UpdateAddressCommandCreator(xmem),
            new CarryOnCommandCreator(contin),
            new ExtendMemCommandCreator(xmem),
            new UndoCommandCreator(ct),
            new RedoCommandCreator(ct),
            new ListURDOCreator(ct)
            };

        while (cont) {
            System.out.println("X Mem Management System");
            System.out.println("Please Enter Command: [c | s | a | e | u | r | l | X]\n"
                    + "c = create membership, s = show membership details, a = update address, e = extend membership, u\n"
                    + "= undo, r = redo, l = list undo/redo, X = eXit system");

            String line = br.readLine();
            
            switch (line) {
                case "c":
                case "C":
                    cmd = Creators[0].createCmd();
                    cmd.execute();
                    Command ccocmd = Creators[3].createCmd();
                    ccocmd.execute(); 
                    ct.saveMyCommand(cmd);
                  //ct.saveMyCommand(cmd, xmem);
                  /*  s1.push(cmd);
                    s1.push(ccocmd);
                    */
                    break;
                case "s":
                case "S":
                    cmd = Creators[1].createCmd();
                    cmd.execute();  
                    break;
                case "a":
                case "A":
                    cmd = Creators[2].createCmd();
                    cmd.execute();
                    ct.saveMyCommand(cmd);
                    break;
                case "e":
                case "E":
                    cmd = Creators[4].createCmd();
                    cmd.execute();
                    ct.saveMyCommand(cmd);
                    break;
                case "u":
                case "U":
                    cmd = Creators[5].createCmd();
                    System.out.println(" u = undo");
                    cmd.execute();
                    break;
                case "r":
                case "R":
                    cmd = Creators[6].createCmd();
                    System.out.println(" r = redo");
                    cmd.execute();
                    break;
                case "l":
                case "L":
                    cmd = Creators[7].createCmd();
                    System.out.println("l = list undo/redo");
                    cmd.execute();
                    break;
                case "X":
                case "x":
                    System.out.println("eXit system");
                    System.exit(0);
                default:
                    System.out.println("Error in the type in data");
                    break;

            }
        }

    }

}
