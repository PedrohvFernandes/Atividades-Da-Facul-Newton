import java.util.Scanner;

public class Exercici53WhileCond {
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
				else
					SomaPosi += num;
			}
		}

		System.out.println("A quantidade de numeros negativos digitados foi: " + contadorNeg);
		System.out.println("A soma entre os n�meros positivos eh: " + SomaPosi);

	}
}