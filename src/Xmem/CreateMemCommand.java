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

import java.util.Date;

/**
 *
 * @author jackh
 */
public class CreateMemCommand implements Command {

    public Vector<Xmember> xmember;
 

    public String[] split1;
    

    //Only for this command use
    private boolean count = true;

    public CreateMemCommand(Vector<Xmember> xmem) {
        this.xmember = xmem;
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
                  Date date = new Date();
                  Calendar cal = Calendar.getInstance();
                  cal.setTime(date);
                  cal.add(Calendar.YEAR, 1);

                switch (split1[1]) {
                    case "Pri":
                        
                        PrimaryMember p1 = new PrimaryMember (split1[0],date,split1[2],split1[3]);
                        MTXAdapter x1 = new MTXAdapter (p1);
                        xmember.add(x1);
                        System.out.println("New member record created. ");
                        
                        break;
                    case "Com":
                        CompanyMember p2 = new CompanyMember (split1[0],date,split1[2],split1[3]);
                        MTXAdapter x2 = new MTXAdapter (p2);
                        xmember.add(x2);
                        System.out.println("New member record created. ");
                        break;
                        
                    case "VIP":
                        int VIPid = Integer.parseInt(split1[0]);
                        
                        VIP p3 = new VIP (VIPid,split1[2],date,split1[3]);
                        CTXAdapter x3 = new CTXAdapter (p3);
                        xmember.add(x3);
                        System.out.println("New member record created. ");
                        break;
                    case "VIPF":
                         int VIPFid = Integer.parseInt(split1[0]);
                       VIP_Family p4 = new VIP_Family (VIPFid,split1[2],date,split1[3]);
                        CTXAdapter x4 = new CTXAdapter (p4);
                        xmember.add(x4);
                        System.out.println("New member record created. ");
                        break;
                    /*        if (split1[1].equals("Pri") || split1[1].equals("Com")) {

                     if (x1.validatePrimaryMember(split1[0])) {
                     Xmem x1 = new Xmem(cid, split1[1], split1[2], split1[3]);
                     xmem.add(x1);
                     System.out.println("New member record created");
                     } else if (split1[1].equals("CompanyMember")) {

                     if (x1.validateCompanyMember(split1[0])) {
                     Xmem x1 = new Xmem(cid, split1[1], split1[2], split1[3]);
                     System.out.println("New member record created");
                     xmem.add(x1);
                     }
                     }

                     } else if (split1[1].equals("VIP") || split1[1].equals("VIPF")) {
                     int vcid = Integer.parseInt(split1[0]);
                     if (x1.validateVIP(vcid)) {
                     Xmem x1 = new Xmem(vcid, split1[1], split1[2], split1[3]);
                     System.out.println("New member record created");
                     xmem.add(x1);
                     }else if (x1.validateVIPF(cid)) {
                     Xmem x1 = new Xmem(vcid, split1[1], split1[2], split1[3]);
                     System.out.println("New member record created");
                     xmem.add(x1);
                     }
                            
                     }*/
                    default:
                        System.out.println("The id not validate!!");
                    /*if ("ajcs".equals(c) || "wlts".equals(c)) {
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
                     */

                }
            } else if (c != "wlts" || c != "ajcs") {
                System.out.println("You can only type in  \"ajcs\" or \"wlts\"  ");
                System.exit(0);
            } else {
                System.out.println("Input data length wrong.");
                System.exit(0);

            }

        } catch (Exception e) {
            System.out.println("Input data length wrong.");

            e.printStackTrace();

            System.out.println(
                    "-----------------------------------------------------");
        }
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
