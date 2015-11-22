/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

//import del.Xmem;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class ShowMemCommandCreator extends Creator {

    private Vector<Xmember> xmem;    
    private String id ;

    public ShowMemCommandCreator(Vector<Xmember> xmem) {
        this.xmem = xmem;
    }
    
     public ShowMemCommandCreator(String id) {
        this.id = id;
    }
    
    @Override
    public Command createCmd() {
        Command c = new ShowMemCommand(xmem);
        return c;
      
    }
    public Command createSpecialCmd(){
        Command SEM = new ShowMemCommand(id);
        return SEM;
    }

}
