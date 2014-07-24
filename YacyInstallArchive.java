/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package yacy.embed;

import java.net.URL;
import net.yacy.embed.YacyInstall;

/**
 * Install yacy from an archive file at a URL.
 * http://www.yacy-websearch.net/wiki/index.php/En:BugfixSources
 * @author me
 */
abstract public class YacyInstallArchive extends YacyInstall {

    public YacyInstallArchive(String targetLocalPath, URL archiveFile) {
        super(targetLocalPath);
    }
    
    
}
