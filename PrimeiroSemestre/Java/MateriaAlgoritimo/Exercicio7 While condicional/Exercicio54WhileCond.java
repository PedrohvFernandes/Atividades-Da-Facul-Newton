import java.util.Scanner;

public class Exercicio54WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, contadorNeg = 0, SomaPosi = 0;

		System.out.print("Digite 0 para encerrar a opera��o\n");

		while (num != 0) {
			System.out.println("Entre com 'X' numeros: ");
			num = ler.nextInt();

			if (num != 0) {
				if (num < 0)
					contadorNeg++;
			}
		}

		System.out.println("A quantidade de numeros negativos digitados foi: " + contadorNeg);
	}
}