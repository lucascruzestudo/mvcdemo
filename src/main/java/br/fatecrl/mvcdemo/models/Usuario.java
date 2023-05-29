package br.fatecrl.mvcdemo.models;

public class Usuario {
    private int codigo;
    private String nome;
    private float saldo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Usuario(int codigo, String nome, float saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }
}