package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControllerAPI {


    private static final List<Usuario> usuarios = new ArrayList<Usuario>();

    public UsuarioControllerAPI() {

        usuarios.add(new Usuario(1,"Lucas",530));
        usuarios.add(new Usuario(2,"Joao",0));
        usuarios.add(new Usuario(3,"Pedrinho",100));
        usuarios.add(new Usuario(4,"Jefferson",52));
        usuarios.add(new Usuario(5,"Janaina",570));
    }

    @GetMapping
    public List<Usuario> getUsuarios(){
         return usuarios;
    }

}