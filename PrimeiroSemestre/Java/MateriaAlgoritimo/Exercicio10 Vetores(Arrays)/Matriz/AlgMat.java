import java.util.Scanner;

public class AlgMat {
	public static void main(String[] args) {

		int[][] matrizNum = new int[2][3];

		Scanner leitura = new Scanner(System.in);

		// entrada
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("Digite mumero ser armazenado: ");
				matrizNum[i][j] = leitura.nextInt();
			}
		}

		// processamento
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++) {
				matrizNum[i][j] += 10;
			}
		}

		// sa�da
		System.out.println();
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matrizNum[i][j] + " ");
			}
			System.out.println();// pula primeira linha depois da impre��o da primeira linha
		}
	}
}