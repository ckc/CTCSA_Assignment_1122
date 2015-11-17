/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.Date;

/**
 *
 * @author jackh
 */
public class CreateMemCommand implements Command {

    public Vector<Xmem> xmem;
    //public Vector<Client> clients;

    public String[] split1;

    public CreateMemCommand(Vector<Xmem> xmem) {
        this.xmem = xmem;
    }

    public void execute() {

        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);

            System.out.println("Enter Company Code (ajcs/wlts): ");
            String c = br.readLine();
            //create ajcs client
            if ("ajcs".equals(c) || "wlts".equals(c)) {
                System.out.println("Enter id;type;name;address:");
                //call create member class
                String Cinput = br.readLine();
                split1 = Cinput.split(";");
                if (split1.length == 4) {
                    //split[1] ->date format

                    int cid = Integer.parseInt(split1[0]);

                    Xmem x1 = new Xmem(cid, split1[1], split1[2], split1[3]);

                    System.out.println("New member record created");
                } else {
                    System.out.println("Input data length wrong.");
                    System.exit(0);

                }

            } else if (c != "wlts" || c != "ajcs") {
                System.out.println("You can only type in  \"ajcs\" or \"wlts\"  ");
                System.exit(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(
                "-----------------------------------------------------");
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
