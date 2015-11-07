/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;


import AJCS.*;
import WLTS.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.Date;

/**
 *
 * @author jackh
 */
public class CreateCommand implements Command {

    public Vector<Member> member;
    public Vector<Client> clients;
    public CreateCommand(Vector<Member> member,Vector<Client> clients) {
        this.member = member;
        this.clients =clients;
    }

    public void execute() {

        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            
            System.out.println("Enter Company Code (ajcs/wlts): ");
            String c = br.readLine();
            //create ajcs client
            if ("ajcs".equals(c)) {
                System.out.println("Enter id;type;name;address:");
                //call create member class
                String Cinput = br.readLine();
                String[] split = Cinput.split(";");
                if (split.length == 4) {
                    
                    Member m1 = new CompanyMember(split[0], split[1], split[2], split[3]);
                    member.add(m1);
                    System.out.println("New member record created");
                } else {
                    System.out.println("Input data length wrong.");
                    System.exit(0);
                }
            //create wlts client
            } else if ("wlts".equals(c)) {
                System.out.println("Enter id;type;name;address:");
                //create method
                String Cinput = br.readLine();
                String[] split = Cinput.split(";");

                if (split.length == 4) {

                        Client c1 = new VIP(Integer.parseInt(split[0]), split[1], split[2], split[3]);
                        //put the c to vector client
                        clients.add(c1);
                        System.out.println("New member record created");
                    
                } else if (split.length != 4) {
                    System.out.println("Input data length wrong.");
                    System.exit(0);
                }

            } else if (c != "wlts" || c != "ajcs") {
                System.out.println("You can only type in  \"ajcs\" or \"wlts\"  ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
