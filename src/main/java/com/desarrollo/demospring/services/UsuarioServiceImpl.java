package com.desarrollo.demospring.services;

import com.desarrollo.demospring.entities.Usuario;
import com.desarrollo.demospring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository userRepository;


    public boolean login(String user, String pass){
        boolean result = false;
        List<Usuario> listUsuario =userRepository.findAll();
        Usuario usuario = listUsuario.get(0);
        if(usuario != null){
            if ( usuario.getPassword().equals(pass)){
                result = true;
            }
        }
        return result;
    }





}
