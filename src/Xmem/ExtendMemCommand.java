/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class ExtendMemCommand implements Command {

    public Vector<Xmember> xmem;
    Xmember x1;

    public ExtendMemCommand(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }

    public void execute() throws Exception {
        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String u2 = br.readLine();
            for (Xmember x1 : xmem) {
                 if (u2.equals(x1.getId())) {

                        System.out.println("Enter id: ");
                        x1.setGoodTill(1);
                        System.out.println("Membership extended: ");
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("Some unexcepted.");
            e.printStackTrace();
        }

    }

    public void undo() {

    }

    public void redo() {

    }

}
