/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS.Commandline;

import java.io.*;
import java.util.*;

/**
 *
 * @author jackh
 */
public class ShowCommand implements Command {

    @Override
    public void execute() {
        try{
        
        InputStreamReader is = new InputStreamReader(System.in);
        
        
        BufferedReader br = new BufferedReader(is);
       
        System.out.println("Enter id (*999 to show all): ");
        String s = br.readLine();

            if("*999".equals(s)){
                System.out.println("Member information");
                System.out.println("Expire Date ID    Type  Name   Address");
               // Systme.out.println(m1.goodTill() +",  " + m1.getType() +",  "+m1.getName()+",  "+m1.getAddress())
                        
            }else if("123".equals(s)){
                
            }
        }catch(IOException e){
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
