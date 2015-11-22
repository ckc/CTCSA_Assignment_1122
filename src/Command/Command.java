package Command;

import Xmem.Xmember;



/**
 *
 * @author jackh
 */
public interface Command {

    public void execute()throws Exception;
    public void undo();
    public void redo();
    
    
}
