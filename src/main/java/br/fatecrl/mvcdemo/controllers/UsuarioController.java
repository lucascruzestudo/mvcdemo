package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private static final List<Usuario> usuarios = new ArrayList<Usuario>();

    public UsuarioController() {
        usuarios.add(new Usuario(1,"Lucas",530));
        usuarios.add(new Usuario(2,"Joao",0));
        usuarios.add(new Usuario(3,"Pedrinho",100));
        usuarios.add(new Usuario(4,"Jefferson",52));
        usuarios.add(new Usuario(5,"Janaina",570));

    }

    @GetMapping
    public String getUsuarios(Model model)
    {
        model.addAttribute("usuarios", usuarios);
        return "usuarios";

    }
}