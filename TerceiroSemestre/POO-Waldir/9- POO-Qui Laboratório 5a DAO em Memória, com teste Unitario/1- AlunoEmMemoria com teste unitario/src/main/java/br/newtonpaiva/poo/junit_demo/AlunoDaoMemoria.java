package br.newtonpaiva.poo.junit_demo;

import java.util.List;
import java.util.ArrayList;

public class AlunoDaoMemoria implements Dao<Aluno> {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    @Override
    public Aluno get(long id) {
        for (var a : alunos) {
            if (a.getId() == id) {

                return a;
            }
        }
        System.out.println("Aluno do id: " + id + " não existe\n");
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        System.out.println("\nTodos os alunos da lista: " + alunos + "\n");
        return alunos;
    }

    @Override
    public void save(Aluno t) {
        this.alunos.add(t);

    }

    @Override
    public void update(Aluno t) {
        var existeAluno = get(t.getId());

        if (existeAluno != null) {

            existeAluno.setNome(t.getNome());
            existeAluno.setCpf(t.getCpf());

            System.out.println("\nMudanças feitas: " + existeAluno + "\n");
            return;

        } else {
            System.out.println("Aluno não existente");
            System.out.println("Por isso adicionamos ele na lista como novo na lista");
            this.alunos.add(t);
            return;
        }

    }

    @Override
    public void delete(Aluno t) {
        var existeAluno = get(t.getId());

        if (existeAluno != null) {
            System.out.println("Aluno existente do id: " + t.getClass().getSimpleName() + "." + t.getId()
                    + " removido com sucesso\n");
            this.alunos.remove(t);

        } else {

            System.out.println(
                    "ERROR: Aluno não existente do id: " + t.getClass().getSimpleName() + "." + t.getId() + "\n");
        }

    }

}
