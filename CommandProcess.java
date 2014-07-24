/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.yacy.embed;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author me
 */
abstract public class CommandProcess implements Runnable {

    public CommandProcess() {
        
    }
    
    public final List<String> log = new ArrayList();

    public abstract void onMessage(String m);

    public abstract void onFinished();

    public abstract void onError();
    
    
    
}
