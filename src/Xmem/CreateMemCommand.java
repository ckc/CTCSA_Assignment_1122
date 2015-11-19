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
    public Xmem x1 = new Xmem();

    //Only for this command use
    private boolean count = true;

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

                    switch (split1[1]) {
                        case "Pri":
                            int pid = Integer.parseInt(split1[0]);
                            if (x1.validatePrimaryMember(split1[0])==true) {
                                Xmem x1 = new Xmem(pid, split1[1], split1[2], split1[3]);
                                xmem.add(x1);
                                System.out.println("New member record created");
                            } break;
                        case "Com":
                            int cid = Integer.parseInt(split1[0]);
                            if (x1.validateCompanyMember(split1[0])==true) {
                                Xmem x1 = new Xmem(cid, split1[1], split1[2], split1[3]);
                                xmem.add(x1);
                                System.out.println("New member record created");
                            } break;
                        case "VIP":
                            int VIPid = Integer.parseInt(split1[0]);
                            //System.out.println("sdadfsdfawd");
                            if (x1.validateVIP(VIPid)==true) {
                                Xmem x1 = new Xmem(VIPid, split1[1], split1[2], split1[3]);
                                xmem.add(x1);
                                System.out.println("New member record created");
                               // break;
                            } break;
                        case "VIF":
                            int VIPFid = Integer.parseInt(split1[0]);
                            if (x1.validateVIP(VIPFid)==true) {
                                Xmem x1 = new Xmem(VIPFid, split1[1], split1[2], split1[3]);
                                xmem.add(x1);
                                System.out.println("New member record created");
                                //break;
                            } break;
                      
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
