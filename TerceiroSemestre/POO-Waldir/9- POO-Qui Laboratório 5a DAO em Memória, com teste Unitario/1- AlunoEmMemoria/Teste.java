import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {

        // Inserindo Aluno
        Aluno aluno = new Aluno();
        LocalDate dataDeNascimento = LocalDate.of(2001, 12, 05);
        aluno.setId(1);
        aluno.setNome("Pedro Henrique Vieira Fernandes");
        aluno.setCpf("154459066-04");
        aluno.setDataDeNascimento(dataDeNascimento);
        aluno.setMatricula("001-Sistema de informação");

        System.out.println(aluno);

        AlunoDaoMemoria alunoDaoMemoria = new AlunoDaoMemoria();

        alunoDaoMemoria.save(aluno);

        // Buscando o Aluno 01

        alunoDaoMemoria.get(1);

        // Imprimindo todos os alunos na tela com um aluno no array
        alunoDaoMemoria.getAll();

        // modficando o aluno 01
        aluno.setCpf("123456789-11");
        aluno.setNome("Fulano");
        aluno.setMatricula("002- AD");
        LocalDate dataDeNascimento2 = LocalDate.of(2002, 05, 18);
        aluno.setDataDeNascimento(dataDeNascimento2);

        alunoDaoMemoria.update(aluno);

        // Deletando o aluno
        alunoDaoMemoria.delete(aluno);

        // Imprimindo todos os alunos na tela com o array vazio
        alunoDaoMemoria.getAll();

        // Pesquisando aluno com id não existente
        alunoDaoMemoria.get(1);

        // Criando novo aluno sem inserir na memoria
        Aluno aluno2 = new Aluno();
        aluno2.setId(2);
        aluno2.setNome("Ciclano");
        aluno2.setCpf("234567656-04");
        aluno2.setDataDeNascimento(dataDeNascimento);
        aluno2.setMatricula("002-Sistema de informação");
        System.out.println("Criando novo aluno, mas não adicionamos ele na memoria: \n");
        System.out.println(aluno2);
        System.out.println();

        // Tentando buscar aluno novo sem estar inserido na memoria
        alunoDaoMemoria.get(2);

        // Tentando alterar aluno novo sem estar inserido na memoria
        alunoDaoMemoria.update(aluno2);

        // Tentando buscar aluno novo inserido na memoria
        alunoDaoMemoria.get(2);

        // Imprimindo todos os alunos na tela com um aluno no array
        alunoDaoMemoria.getAll();

        // Removendo Aluno pois a faculdade/escola ficou Pobre D:
        alunoDaoMemoria.delete(aluno2);

        // Imprimindo todos os alunos na tela com o array vazio
        alunoDaoMemoria.getAll();

        // A faculado/escola ficou rica :D e teve dois alunos logo de inicio
        alunoDaoMemoria.save(aluno);
        alunoDaoMemoria.save(aluno2);

        alunoDaoMemoria.getAll();

    }
}
