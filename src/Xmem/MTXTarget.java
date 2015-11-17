/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Date;

/**
 *
 * @author jackh
 */
public interface MTXTarget {

    abstract public void request() throws Exception;

    public void request(String string, Date date, Date date0, String string0, String string1);

}
