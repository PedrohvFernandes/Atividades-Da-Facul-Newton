package br.newtonpaiva.poo.junit_demo;

import java.time.LocalDate;

public class Aluno {

    private Integer id;

    private String matricula;

    private String cpf;

    private String nome;

    private LocalDate dataDeNascimento;

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {

        return id + " Aluno: " + nome + " cpf:" + cpf + " Data de nascimento: " + dataDeNascimento
                + " Matricula do aluno: " + matricula;
    }

}