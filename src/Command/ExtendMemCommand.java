package Command;

import Command.Command;
import Xmem.Xmember;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;
import java.util.Vector;


/**
 *
 * @author jackh
 */
public class ExtendMemCommand implements Command {

    //Mememtor save into stack
    //public Stack <Command>s1;
    
    public Vector<Xmember> xmember;
    private Date date;
    Xmember x1;
    public ExtendMemCommand(Vector<Xmember> xmem) {
        this.xmember = xmem;
    }

    public void execute() throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

          System.out.println("Enter id: ");
          String u2 = br.readLine();
          
          switch (u2) {
            
                
            default:
                for (Xmember x1 : xmember) {
                            if (u2.equals( x1.getId())) {
                               
                                this.date = x1.getGoodTill();
                                Date goodTill = x1.getGoodTill();
        Calendar cal = Calendar.getInstance();
    cal.setTime(goodTill);
        cal.add(Calendar.YEAR, 1);


        java.util.Date expirationDate = cal.getTime();

                               x1.setGoodTill(expirationDate);
                                System.out.println("Membership extended: ");
                                
                                System.out.println(dateFormat.format(x1.getGoodTill())+"\t"+x1.getId()+"\t"+x1.getType()+"\t"+x1.getPostal());
                                this.x1 = x1;
                                
                                break;
                            }else{
                                System.out.println("Some Unexpected error");
                            }
                }
        }
    }

    @Override
    public void undo() {
        x1.setGoodTill(this.date);
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Extend " + x1.getId();
    }

}
