package com.desarrollo.demospring.controllers;

import com.desarrollo.demospring.entities.Login;
import com.desarrollo.demospring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/loginrest")
    public ResponseEntity<String> login(@RequestBody Login login) {
        if(usuarioService.login(login.getUsername(), login.getPassword())){
            return new ResponseEntity<>("Usuario Encontrado!", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("ERROR!", HttpStatus.NOT_FOUND);
        }
    }
}