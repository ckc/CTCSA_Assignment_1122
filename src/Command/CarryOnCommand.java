package Command;

import Xmem.Xmember;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class CarryOnCommand implements Command {
    
     //Mememtor save into stack
    //public Stack <Command>s1;
    
    private boolean contin = true;
    
    public CarryOnCommand(boolean contin) {
        this.contin = contin;
    }


    public void execute() throws Exception {
         InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);

        System.out.println("Do you want to carry on Use Xmember?? y/n");
        String question = br.readLine();
        if (question.equals("y")) {
            contin = true;
        } else if(question.equals("n")){
            contin = false;
            System.exit(0);
        }else{
            System.out.println("Unexpected data type.");
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
