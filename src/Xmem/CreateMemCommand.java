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
    private boolean contin = true;

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
         if(split1.length ==4){       
                Date date = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.YEAR, 1);

                switch (split1[1]) {
                  
                    case "Pri":

                        PrimaryMember p1 = new PrimaryMember(split1[0], date, split1[2], split1[3]);
                        //uper.XMember x1 = new MTXAdapter(p1);
                        xmember.add(new MTXAdapter(p1));
                        System.out.println("New member record created. ");
                        System.out.println();
                        
                          
                        break;
                    case "Com":
                        CompanyMember p2 = new CompanyMember(split1[0], date, split1[2], split1[3]);
                        MTXAdapter x2 = new MTXAdapter(p2);
                        xmember.add(x2);
                        System.out.println("New member record created. ");
                        System.out.println();
                        
                        
                        break;

                    case "VIP":
                        int VIPid = Integer.parseInt(split1[0]);
                        VIP p3 = new VIP(VIPid, split1[2], date, split1[3]);
                        CTXAdapter x3 = new CTXAdapter(p3);
                        xmember.add(x3);
                        System.out.println("New member record created. ");
                        System.out.println();
                        break;
                    case "VIPF":
                        int VIPFid = Integer.parseInt(split1[0]);
                        VIP_Family p4 = new VIP_Family(VIPFid, split1[2], date, split1[3]);
                        CTXAdapter x4 = new CTXAdapter(p4);
                        xmember.add(x4);
                        System.out.println("New member record created. ");
                        System.out.println();
                        break;

                    default:
                        System.out.println("Input data length wrong.");
                    
                }
            
         }else{ System.out.println("Input data length wrong."); };
         }
       } catch (Exception e) {
            System.out.println("Input data length wrong.");
            System.exit(0);
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
