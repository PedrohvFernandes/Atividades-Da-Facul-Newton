import java.util.Scanner;

public class Exerci70Array {
	public static void main(String[] args) {

		double[] vetPreco = new double[5]; // significa que vai de 0 a 4
		String[] vetProduto = new String[5]; // significa que vai de 0 a 4

		Scanner leitura = new Scanner(System.in);

		// entrada
		for (int i = 0; i < vetPreco.length; i++) {
			leitura = new Scanner(System.in);

			System.out.println("Digite a descri��o do produto para ser armazenado no vetor: ");
			vetProduto[i] = leitura.nextLine();

			System.out.println("Digite o pre�o do produtopara ser armazenado no vetor: ");
			vetPreco[i] = leitura.nextDouble();
		}

		// processamento
		for (int i = 0; i < vetPreco.length; i++) { // todas as linhas abaixo s�o equivalentes
			vetPreco[i] = vetPreco[i] * 1.10; // 1.10 => 1 + 0.10) // 1 vez ele que o 100% + 0.10 � o percentual de
												// reajuste
			// vetPreco[i]+=vetPreco[i]*0.10;
			// vetPreco[i]=vetPreco[i]+vetPreco[i]*0.10; // mais simples
		}

		// sa�da
		System.out.println("Imprimindo oss produtos e seus pre�os do vetor");
		System.out.println();
		for (int i = 0; i < vetPreco.length; i++) {
			System.out.print(vetProduto[i] + " ");
			System.out.printf("%.2f \n ", vetPreco[i]);
		}

	}
}