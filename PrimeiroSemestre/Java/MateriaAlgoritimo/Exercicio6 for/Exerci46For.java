import java.util.Scanner;

public class Exerci46For {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int i, num = 0, numPositivos = 0, numNegativos = 0, soma, SomaPositivos = 0, SomaNegativos = 0;

		for (i = 1; i <= 15; i++) {

			System.out.println(
					"Digite 15 numeros para identificar se � positivo ou negativo, e no final obeter a soma: ");
			num = ler.nextInt();

			if (num != 0) {

				if (num > 0) {
					numPositivos++;
					SomaPositivos = SomaPositivos + num;// SomaPositivos+=num;
				}

				else {
					numNegativos++;
					SomaNegativos = SomaNegativos + num;

				}

			}

		}

		System.out.println("quantidade de n�meros positivos: " + numPositivos);
		System.out.println("quantidade de n�meros negativos: " + numNegativos);
		System.out.println("soma de todos os valores positivos: " + SomaPositivos);
		System.out.println("soma de todos os valores negativos: " + SomaNegativos);

	}

}