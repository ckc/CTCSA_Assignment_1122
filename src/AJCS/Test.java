/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Vector AJCS_mem = new Vector();
        boolean cont = true;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("X Mem Management System");
        System.out.println("Please Enter Command: [c | s | a | e | u | r | l | X]\n"
                + "c = create membership, s = show membership details, a = update address, e = extend membership, u\n"
                + "= undo, r = redo, l = list undo/redo, X = eXit system");

        String line = br.readLine();
        switch (line) {
            case "c":
                System.out.println("Enter Company Code (ajcs/wlts): ");
                String c = br.readLine();
                    if ("ajcs".equals(c)) {
                        System.out.println("Enter id;type;name;address:");
                        //call member class
                        String Cinput = br.readLine() ;
                        String []split = Cinput.split(";");
                        Member m1 = new CompanyMember(split[0],split[1],split[2],split[3]);
                      
                       
                        System.out.println("New member record created");
                            
                    } else if ("wlts".equals(c)) {
                        System.out.println("Enter id;type;name;address:");
                        //create method

                        System.out.println("New member record created");

                    } else if (c != "wlts" || c != "ajcs") {
                        System.out.println("You can only type in  \"ajcs\" or \"wlts\"  ");
                    }

                break;
            case "s":
                System.out.println("s= show membership detail");
                break;
            case "a":
                System.out.println(" a = update address");
                break;
            case "e":
                System.out.println(" e = extend membership");
                break;
            case "u":
                System.out.println(" u = undo");
                break;
            case "r":
                System.out.println(" r = redo");
                break;
            case "l":
                System.out.println("l = list undo/redo");
                break;
            default:
                System.out.println("assignment");
                break;
        }
        
        
    }

}
