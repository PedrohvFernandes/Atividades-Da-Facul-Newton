import java.util.Scanner;

public class Exercicio12If {

	public static void main(String[] args) {

		int Numero;

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com um n�mero para ver se ele � negativo ou positivo");
		Numero = ler.nextInt();

		if (Numero < 0)
			System.out.println("Negativo");

		else
			System.out.println("Positivo");
	}

}