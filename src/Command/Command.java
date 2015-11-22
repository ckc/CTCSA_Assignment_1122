package Command;

import Xmem.Xmember;



/**
 *
 * @author jackh
 */
public interface Command {

    public void execute()throws Exception;
    public void undo(Xmember xmember);
    public void redo();
    
    
}
