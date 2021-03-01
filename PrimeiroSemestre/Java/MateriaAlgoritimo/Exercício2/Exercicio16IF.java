import java.util.Scanner;

public class Exercicio16IF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int Numero;

		System.out.println("Entre com um numero para ver se ele � divisivel por 5");
		Numero = ler.nextInt();

		if (Numero % 5 == 0)
			System.out.println("O numero " + Numero + " � divisil por 5");

		else
			System.out.println("O numero " + Numero + " n�o � divisivel por 5");

	}
}