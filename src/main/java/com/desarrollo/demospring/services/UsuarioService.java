package com.desarrollo.demospring.services;

public interface UsuarioService {
    public boolean login(String user, String pass);
    public boolean changePassword(String user, String oldPass, String newPass);
}