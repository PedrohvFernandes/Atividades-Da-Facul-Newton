import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float nota1, nota2, nota3, media;

		System.out.println("Entre com as notas do aluno");
		nota1 = ler.nextFloat();
		nota2 = ler.nextFloat();
		nota3 = ler.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.printf("O valor de M�dia �: %.2f", media);

	}
}