package com.desarrollo.demospring.entities;

public class ChangePassword {

    String username;
    String oldPass;
    String newPass;

    public ChangePassword(String username, String oldPass, String newPass) {
        this.username = username;
        this.oldPass = oldPass;
        this.newPass = newPass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

}
