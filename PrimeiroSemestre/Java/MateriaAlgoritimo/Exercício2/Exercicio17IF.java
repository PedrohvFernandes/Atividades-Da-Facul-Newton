import java.util.Scanner;

public class Exercicio17IF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Informe sua idade");
		idade = ler.nextInt();

		if ((idade >= 5) && (idade <= 12))
			System.out.println("A idade " + idade + " � considerada infantil");

		else if ((idade >= 13) && (idade <= 17))
			System.out.println("A idade " + idade + " � considerada juvenil");

		else if ((idade >= 18) && (idade <= 25))
			System.out.println("A idade " + idade + " � considerada profissional");

		else
			System.out.println("A idade esta fora da faixa");

	}
}