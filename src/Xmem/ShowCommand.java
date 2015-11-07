/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import java.io.*;
import java.util.*;

/**
 *
 * @author jackh
 */
public class ShowCommand implements Command {

    Vector<Member> member;
    Vector<Client> clients;

    public ShowCommand(Vector<Member> member, Vector<Client> clients) {
        this.member = member;
        this.clients = clients;
    }

    @Override
    public void execute() throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter id (*999 to show all): ");
        String a = br.readLine();
        int w = Integer.parseInt(a);
      
        switch (a) {
            case "999" :
                System.out.println("Member information");
                System.out.println("Expire Date ID  Type  Name   Address");
                //Member m1 = member.get(0);
                for (Member m1 : member) {
                    System.out.println(m1);
                }
                for (Client c1 : clients) {
                    System.out.println(c1);
                }
            default:
                Member m1;
                for (int i = 0; i < member.size(); i++) {
                    m1 = member.get(i);

                    if (m1.getId().equals(a)) {
                        System.out.println("Member information");
                        System.out.println("ID:" + m1.getId());
                        System.out.println("Type: " + m1.getType());
                        System.out.println("Name: " + m1.getName());
                        System.out.println("Address: " + m1.getPostal());
                        System.out.println("Expire date(DD-MM-YYYY): " + m1.getGoodTill());
                    }
                }
                Client c1;
                for (int j = 0; j < clients.size(); j++) {
                    c1 = clients.get(j);

                    if (c1.getCid() == w) {
                        System.out.println("Member information");
                        System.out.println("ID:" + c1.getCid());
                        System.out.println("Type: " + c1.getType());
                        System.out.println("Name: " + c1.getFullName());
                        System.out.println("Address: " + c1.getHomeAddress());
                        System.out.println("Expire date(DD-MM-YYYY): " + c1.getExpiryDate());
                    }
                }

                System.out.println("                                                    ");
        }

    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
