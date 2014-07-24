/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.yacy.embed;

/**
 * Install Yacy from git
 * https://git.gitorious.org/yacy/rc1.git
 * @author me
 */
abstract public class YacyInstallGit extends YacyInstall {

    public YacyInstallGit(String path, String gitCloneURL) {
        super(path);
    }
    
}
