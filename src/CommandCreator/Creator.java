/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandCreator;

import Command.Command;

/**
 *
 * @author jackh
 */
public abstract class Creator {
    public abstract Command createCmd();
        
    public abstract Command createSpecialCmd();

}
