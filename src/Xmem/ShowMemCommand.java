/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

//import del.Xmem;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author jackh
 */
public class ShowMemCommand implements Command {

    Vector<Xmember> xmem;
    Xmember x1;

    public ShowMemCommand(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }

    public void execute() throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        
        
        System.out.println("Enter id (*999 to show all): ");
        String a = br.readLine();

        try {
            switch (a) {
                case "*999":
                    System.out.println("Member information");
                    System.out.println("Expire Date                       ID        Type Name            Address");

                    for (Xmember x1 : xmem) {
                        System.out.println();
                        System.out.println();
                        System.out.println("Member information");
                        System.out.println("Expire Date\tID\t\tType\t\tName\t\tAddress");   //using tab split
                        System.out.println(dateFormat.format(x1.getGoodTill())+",\t"+x1.getId()+",\t"+x1.getType()+
                                ",\t"+x1.getName()+",\t" + x1.getPostal());    
                        

                    }
                    break;
                default:
                    //enther the id and find the id member
                     for (Xmember x1 : xmem) {
                         if(a.equals(x1.getId()))
                   
                        
                        System.out.println("\nID: " + x1.getId() + "\n" + "Type: " + x1.getType() + "" + "\n" + "Name: " + x1.getName() + "\n" + "Address: " + x1.getPostal() + "\n" + 
                                "Expire date(DD-MM-YYYY): " + dateFormat.format(x1.getGoodTill()) + "\n");
                    }

                    break;
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
