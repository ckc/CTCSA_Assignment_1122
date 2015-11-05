/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import AJCS.Commandline.*;
import java.io.*;
import java.util.*;


/**
 *
 * @author jackh
 */
public class ShowCommand implements Command{

    Vector<Member> member;

    public ShowCommand(Vector<Member> member) {
        this.member = member;
    }

    @Override
    public void execute() {
        try {

            InputStreamReader is = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(is);

            System.out.println("Enter id (*999 to show all): ");
            String s = br.readLine();

            if ("*999".equals(s)) {
                System.out.println("Member information");
                System.out.println("Expire Date ID  Type  Name   Address");
                //Member m1 = member.get(0);
                for (Member m1 : member) {
                    System.out.println(m1);
                }
                
            } else {
               
                Member m1;
                for (int i = 0; i < member.size(); i++) {
                    m1 = member.get(i);
                    
                    if (m1.getId().equals(s)) {
                        System.out.println("Member information");
                        System.out.println("ID:" + m1.getId());
                        System.out.println("Type: " + m1.getType());
                        System.out.println("Name: " + m1.getName());
                        System.out.println("Address: " + m1.getPostal());
                        System.out.println("Expire date(DD-MM-YYYY): " + m1.getGoodTill());

                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("                                                    ");
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

}
