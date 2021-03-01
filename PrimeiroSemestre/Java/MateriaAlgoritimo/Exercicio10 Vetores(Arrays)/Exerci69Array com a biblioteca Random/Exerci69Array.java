import java.util.Random; //biblioteca random gera numeros aleatorios
import java.util.Scanner;

public class Exerci69Array {
	public static void main(String[] args) { // metodo ou funcao esta entre parenteses

		int[] vetNumeros = new int[5]; // significa que vai de 0 a 4
		Scanner leitura = new Scanner(System.in);
		Random gera = new Random();
		int numPes, posPes = -1;

		// entrada
		for (int i = 0; i < vetNumeros.length; i++) {
			vetNumeros[i] = gera.nextInt(1000); // limita��o de 0 a 999
		}

		System.out.println("Imprimindo os n�meros no vetor"); // vai imprimir os numeros gerados pelo random
		System.out.println();
		for (int i = 0; i < vetNumeros.length; i++) {
			System.out.print(vetNumeros[i] + " ");

		}

		System.out.println();
		System.out.println("Digite um n�mero para verificar se o mesmo se encontra no vetor: ");
		numPes = leitura.nextInt();

		// processamento
		for (int i = 0; i < vetNumeros.length; i++) {
			if (vetNumeros[i] == numPes)
				posPes = i;
		}

		if (posPes != -1)// vai substituir o -1 pelo indice que foi verificado se � encontrado no vetor
			System.out.println(numPes + " foi encontrado no vetor. Ele esta no indice: " + posPes);
		else
			System.out.println(" N�mero n�o foi encontrado no vetor");

	}
}
