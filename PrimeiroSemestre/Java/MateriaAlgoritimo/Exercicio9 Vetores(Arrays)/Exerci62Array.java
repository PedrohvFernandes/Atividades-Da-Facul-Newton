import java.util.Scanner;

public class Exerci62Array {
	public static void main(String[] args) {

		int i;
		String[] vetNomes = new String[8];

		Scanner ler = new Scanner(System.in);

		for (i = 0; i < vetNomes.length; i++) {
			System.out.println("Digite um nome: ");
			vetNomes[i] = ler.nextLine();
		}
		/*
		 * for(i=0;i<vetNomes.length;i++) // normal vetNomes[i]=ler.nextLine();
		 */
		/*
		 * for(i=7;i>=0;i--){//vai vim os nome ao contrario, decremento
		 * System.out.print(vetNomes[i] + " ");
		 */
		for (i = vetNomes.length - 1; i >= 0; i--) {
			System.out.print(vetNomes[i] + " ");// decremento, mas de outra forma de fazer
		}
	}
}