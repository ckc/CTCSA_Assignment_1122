/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJCS;

import AJCS.Commandline.*;

/**
 *
 * @author jackh
 */
public interface Command {

    public void execute();
    public void undo();
    public void redo();
}
