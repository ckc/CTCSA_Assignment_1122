/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.*;
import java.util.*;

/**
 *
 * @author jackh
 */
public class ShowMemCommand implements Command {

    Vector<Xmem> xmem;
    Xmem x1;

    public ShowMemCommand(Vector<Xmem> xmem) {
        this.xmem = xmem;
    }

    public void execute() throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter id (*999 to show all): ");
        String a = br.readLine();

        try {
            switch (a) {
                case "*999":
                    System.out.println("Member information");
                    System.out.println("Expire Date ID  Type  Name   Address");

                    for (Xmem x1 : xmem) {

                        System.out.println(x1);
                    }

                default:

                    for (int i = 0; i < xmem.size(); i++) {

                        Xmem x1 = xmem.get(i);

                        if ((a.equals(x1.cid))) {
                            System.out.println("Member information");
                            System.out.println("ID:" + x1.cid);
                            System.out.println("Type: " + x1.type);
                            System.out.println("Name: " + x1.fullName);
                            System.out.println("Address: " + x1.homeAddress);
                            System.out.println("Expire date(DD-MM-YYYY): " + x1.expiryDate);

                        } else {
                            System.out.println("Your input id no exist or del");
                        }

                        System.out.println("                                                    ");

                    }
            }
        } catch (NullPointerException e) {
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
