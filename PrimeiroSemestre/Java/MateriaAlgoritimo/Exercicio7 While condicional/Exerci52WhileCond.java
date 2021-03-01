import java.util.Scanner;

public class Exerci52WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int qtAprovado = 0, qtReprovado = 0, notaTurma = 0;
		double nota1, nota2, nota3, media, somaNota = 0;
		String nomeAluno = "a";

		System.out.println("A digita��o se encerra quando precionar o <FIM>");

		while (!"FIM".equals(nomeAluno)) {

			System.out.println("Qual o nome do aluno?");
			nomeAluno = ler.nextLine();

			if (!"FIM".equals(nomeAluno)) {

				System.out.println("Entre com as tr�s notas do aluno");
				nota1 = ler.nextDouble();
				nota2 = ler.nextDouble();
				nota3 = ler.nextDouble();

				ler = new Scanner(System.in);

				somaNota = nota1 + nota2 + nota3;
				if (somaNota >= 60)
					qtAprovado++;
				else
					qtReprovado++;

				notaTurma += somaNota;
			}
		}
		media = notaTurma / (qtAprovado + qtReprovado);

		System.out.println("A media eh: " + media);
		System.out.println("A quantidade de alunos aprovados eh: " + qtAprovado);
		System.out.println("A quantidade de alunos reprovados eh: " + qtReprovado);

	}
}