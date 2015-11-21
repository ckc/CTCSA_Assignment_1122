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
                        System.out.println("Expire Date ID    Type  Name   Address"); 
                        System.out.println(x1.getGoodTill()+",  "+x1.getId()+",  "+x1.getType()+
                                ",  "+x1.getName()+",  "+ dateFormat.format(x1.getGoodTill()) );    
                        

                    }
                    break;
                default:
                    //enther the id and find the id member
                     for (Xmember x1 : xmem) {
                         if(a.equals(x1.getId()))
                   
                        
                        System.out.println("ID:" + x1.getId() + "\n" + "Type: " + x1.getType() + "" + "\n" + "Name: " + x1.getName() + "Address: " + "\n" + x1.getPostal() + 
                                "Expire date(DD-MM-YYYY): " + dateFormat.format(x1.getGoodTill()) + "");
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
