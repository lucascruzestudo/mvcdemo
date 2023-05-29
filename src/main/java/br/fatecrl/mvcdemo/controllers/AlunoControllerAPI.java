package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoControllerAPI {


    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoControllerAPI() {

        alunos.add(new Aluno("111111","Lucas",10,8));
        alunos.add(new Aluno("222222","Joao",4,2));
        alunos.add(new Aluno("333333","Pedrinho",6,4));
        alunos.add(new Aluno("444444","Jefferson",9,6));
        alunos.add(new Aluno("555555","Janaina",10,10));
    }

    @GetMapping
    public List<Aluno> getAlunos(){
         return alunos;
    }

}