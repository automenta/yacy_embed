/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.yacy.embed;

import java.io.File;
import java.net.URL;
import static net.yacy.embed.YacyServer.YacyServerState.*;

/**
 * Interface for Yacy start, stop, update, logs & status monitor, & automatic install.
 * @author me
 */
public class YacyServer {
    public enum YacyServerState {
        STOPPED, STARTING, STARTED, STOPPING, ERROR
    }

    public final File path;
    public final int port;
    
    

    /**
     * 
     * @param yacypath
     * @param port to override the configuration with, or -1 to use the supplied configuration in yacypath installation
     */
    public YacyServer(String yacypath, int port) {
        this.path = new File(yacypath);
        this.port = port;
    }
    
    
    public YacyClient newClient() {
        return new YacyClient("localhost", port);
    }
    
    public YacyServerState getState() {
        return ERROR;
    }
    
    public CommandProcess start() {
        return null;
    }
    public CommandProcess stop() {
        return null;
    }
    public CommandProcess update() {
        return null;
    }
    
    /** size of yacy directory */
    public long getDiskBytes() {        
        return 0;
    }
    
    /** size of yacy in memory, while running */
    public long getMemoryBytes() {
        return 0;
    }
    
    /** yacy server uptime in milliseconds, or -1 if not running */
    public long getUptimeMS() {
        return 0;
    }
    
    public File getLogPath() {
        return null;
    }
    public File getConfigPath() {
        return null;
    }
    
    public URL getPublicWebURL() {
        return null;
    }
    public URL getAdminWebURL() {
        return null;
    }
}
