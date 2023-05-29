package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController() {
        alunos.add(new Aluno("111111","Lucas",10,8));
        alunos.add(new Aluno("222222","Joao",4,2));
        alunos.add(new Aluno("333333","Pedrinho",6,4));
        alunos.add(new Aluno("444444","Jefferson",9,6));
        alunos.add(new Aluno("555555","Janaina",10,10));

    }

    @GetMapping
    public String getAlunos(Model model)
    {
        model.addAttribute("alunos", alunos);
        return "alunos";

    }
}