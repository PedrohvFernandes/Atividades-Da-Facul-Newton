package br.newtonpaiva.poo.junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoDaoMemoriaTeste {

    AlunoDaoMemoria alunoDaoMemoria;// Unidade de teste que eu estou testando

    @BeforeEach
    void setUp() throws Exception {// Incialização dos testes

        alunoDaoMemoria = new AlunoDaoMemoria();// Objeto a ser testado

    }

    @Test
    public void test_GetExistir() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        alunoDaoMemoria.save(aluno);// Armazenando aluno na "Memoria/lista" com o Id 1

        var resultado = alunoDaoMemoria.get(aluno.getId());// Obtendo o resultado da pesquisa(Get) passando o Id desse
                                                           // aluno

        assertEquals(aluno, resultado);// Aluno tem que ter o mesmo ID do aluno do resultado, no caso 1

    }

    @Test
    public void test_GetNaoExistir() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2002, 12, 05);
        aluno.setId(2);
        aluno.setNome("Fulano");
        aluno.setCpf("123456789-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("002- AD");

        // Esse aluno não foi armazenado na "Memoria/lista"
        // alunoDaoMemoria.save(aluno);

        var resultado = alunoDaoMemoria.get(aluno.getId());

        assertNull(resultado);// Certificar que o resultado retornado é de fato nulo

    }

    @Test
    public void test_GetAll() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        // Criando uma lista aqui para comparar com o resultado que usa o metodo que
        // lista todos os alunos da lista de AlunoDaoMemoria
        List<Aluno> alunos = new ArrayList<Aluno>();
        // Adicionando um aluno nessa lista
        alunos.add(aluno);

        // Adicionando um aluno na lista de AlunoDaoMemoria
        alunoDaoMemoria.save(aluno);

        var resultado = alunoDaoMemoria.getAll();

        assertEquals(alunos, resultado);

    }

    @Test
    public void test_SeFoiSalvoSave() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        // Aluno inserido na memoria
        alunoDaoMemoria.save(aluno);

        var resultado = alunoDaoMemoria.get(aluno.getId());

        // Pra ver se de fato ele foi adicionado
        assertEquals(aluno, resultado);

    }

    @Test
    public void test_SeNaoFoiSalvoSave() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        // Não foi adicionado
        // alunoDaoMemoria.save(aluno);

        var resultado = alunoDaoMemoria.get(aluno.getId());

        // Pra ver se de fato ele foi adicionado
        assertNull(resultado);

    }

    @Test
    public void test_AlunoExisteUpdate() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        alunoDaoMemoria.save(aluno);

        // Pesquisando aluno salvo na memoria para sofrer alterações futuras
        var resultado = alunoDaoMemoria.get(aluno.getId());

        dataDeNascimento = LocalDate.of(2002, 12, 05);
        aluno.setId(1);
        aluno.setNome("Fulano");
        aluno.setCpf("123456789-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("002- AD");

        alunoDaoMemoria.update(aluno);

        assertEquals(aluno, resultado);

    }

    @Test
    public void test_AlunoNaoExisteUpdate() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        // Aluno não existe na memoria
        // alunoDaoMemoria.save(aluno);

        // Pesquisando aluno salvo na memoria para sofrer alterações futuras
        var resultado = alunoDaoMemoria.get(aluno.getId());

        dataDeNascimento = LocalDate.of(2002, 12, 05);
        aluno.setId(1);
        aluno.setNome("Fulano");
        aluno.setCpf("123456789-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("002- AD");

        alunoDaoMemoria.update(aluno);

        assertNull(resultado);

    }

    @Test
    public void test_ExisteAlunoDelete() {
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        alunoDaoMemoria.save(aluno);

        // Pesquisando aluno salvo na memoria para ser deletado posteriormente
        var resultado = alunoDaoMemoria.get(aluno.getId());

        alunoDaoMemoria.delete(aluno);

        assertEquals(aluno, resultado);

    }

    @Test
    public void test_NaoExisteAlunoDelete() {

        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        // Aluno não existente na memoria
        // alunoDaoMemoria.save(aluno);

        // Pesquisando aluno salvo na memoria para ser deletado posteriormente
        var resultado = alunoDaoMemoria.get(aluno.getId());

        alunoDaoMemoria.delete(aluno);

        assertNull(resultado);

    }

}