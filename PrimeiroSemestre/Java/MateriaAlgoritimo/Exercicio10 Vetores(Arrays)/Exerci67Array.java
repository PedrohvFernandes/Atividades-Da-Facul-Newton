import java.util.Scanner;

public class Exerci67Array {
	public static void main(String[] args) {

		int[] vetNumeros = new int[5]; // significa que vai de 0 a 4

		Scanner leitura = new Scanner(System.in);

		// entrada
		for (int i = 0; i < vetNumeros.length; i++) {
			System.out.println("Digite um n�mero para ser armazenado no vetor: ");
			vetNumeros[i] = leitura.nextInt();
		}

		// processamento
		for (int i = 0; i < vetNumeros.length; i++) {
			if (i % 2 == 1) { // if (i%2!=0) - est� certo tamb�m
				vetNumeros[i] *= 10; // vetNumeros[i]=vetNumeros[i]*10; - est� certo tamb�m
			}
		}

		// sa�da
		System.out.println("Imprimindo os n�meros no vetor");
		System.out.println();
		for (int i = 0; i < vetNumeros.length; i++) {
			System.out.print(vetNumeros[i] + " ");
		}

	}
}