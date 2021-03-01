import java.util.Scanner;

public class Exercicio49WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, contadorPar = 0, Somaimpar = 0;

		System.out.print("Digite -1 para encerrar a opera��o\n");

		while (num != -1) {
			System.out.println("Entre com 'X' numeros: ");
			num = ler.nextInt();

			if (num != -1) {
				if (num == 0) {
					System.out.println("N�mero invalido");
				} else if (num % 2 == 0)
					contadorPar++;
				else
					Somaimpar += num;
			}
		}

		System.out.println("A quantidade de numeros pares digitados foi: " + contadorPar);
		System.out.println("A soma entre os n�meros impares eh: " + Somaimpar);

	}
}