/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

//import del.Xmem;
import Xmem.Xmember;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author jackh
 */
public class ShowMemCommand implements Command {
    
    //Mememtor save into stack
    //public Stack <Command>s1;
    
    Vector<Xmember> xmem;
    String id;

    public ShowMemCommand(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }

    //for extends search member
    public ShowMemCommand(String id) {
        this.id = id;
    }

    public void execute() throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter id (*999 to show all): ");
        String a = br.readLine();
        String a1 = a.trim();

        try {

            switch (a1) {
                case "*999":

                    System.out.println("Member information");
                    System.out.println("Expire Date\tID\tType\t\tName\t\tAddress");
                    for (Xmember x1 : xmem) {
                        if (a1.equals("*999")) {
                            System.out.println(dateFormat.format(x1.getGoodTill()) + ",\t" + x1.getId() + ",\t" + x1.getType()
                                    + ",\t\t" + x1.getName() + ",\t\t" + x1.getPostal());

                        }
                    }
                    break;

                default:
                    //enther the id and find the id member
                    for (Xmember x1 : xmem) {
                        if (a1.equals(x1.getId())) {

                            System.out.println("\nID: " + x1.getId() + "\n" + "Type: " + x1.getType() + "" + "\n" + "Name: " + x1.getName() + "\n" + "Address: " + x1.getPostal() + "\n"
                                    + "Expire date(DD-MM-YYYY): " + dateFormat.format(x1.getGoodTill()) + "\n");
                            System.out.println();
                        }
                    }
                    break;
            }

        } catch (NullPointerException e) {
            System.out.println("Input data length or type wrong!");
            e.printStackTrace();
        }
    }
    
//for only find the id memer information
    public void execute1(String id) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (Xmember x1 : xmem) {
            if (id.equals(x1.getId())) {
                System.out.println(dateFormat.format(x1.getGoodTill()) + ",\t" + x1.getId() + ",\t" + x1.getType()
                        + ",\t\t" + x1.getName() + ",\t\t" + x1.getPostal());
                System.out.println();

                System.out.println();
            }
        }
    }
//end
    
    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
