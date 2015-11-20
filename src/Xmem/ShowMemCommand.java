/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.*;
import java.text.SimpleDateFormat;
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
                    System.out.println("Expire Date                       ID        Type Name            Address");

                    for (Xmem x1 : xmem) {

                        System.out.println(x1);
                    }

                default:

                   
                        /*if (a.equals(sx1.getCid())) {
                            System.out.println("Member information");
                            System.out.println("ID:" + sx1.getCid());
                            System.out.println("Type: " + sx1.getType());
                            System.out.println("Name: " + sx1.getFullName());
                            System.out.println("Address: " + sx1.getHomeAddress());
                               SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
                            System.out.println("Expire date(DD-MM-YYYY): " + dateFormat.format(sx1.getExpiryDate()));

                            System.out.println("                                                    ");
                        }*/
                         for (Xmem x1 : xmem) {

                        System.out.println(x1.toString1());
                    }
                    

            }
        } catch (NullPointerException e) {
            System.out.println("Input data length or type wrong!");
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
