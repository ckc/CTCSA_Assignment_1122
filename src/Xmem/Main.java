/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

//import del.Xmem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Vector;

/**
 *
 * @author jackh
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Vector<Xmember> xmem = new Vector<Xmember>();
        boolean contin = true;
        boolean cont = true;

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        Command cmd;
        Creator Creators[] = {new CreateMemCommandCreator(xmem),
            new ShowMemCommandCreator(xmem),
            new UpdateAddressCommandCreator(xmem),
            new CarryOnCommandCreator(contin),
            new ExtendMemCommandCreator(xmem),};

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
                    break;
                case "e":
                case "E":
                    cmd = Creators[4].createCmd();
                    cmd.execute();
                    break;
                case "u":
                case "U":
                    System.out.println(" u = undo");
                    break;
                case "r":
                case "R":
                    System.out.println(" r = redo");
                    break;
                case "l":
                case "L":
                    System.out.println("l = list undo/redo");
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
