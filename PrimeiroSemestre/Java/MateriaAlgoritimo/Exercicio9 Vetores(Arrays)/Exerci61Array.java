import java.util.Scanner;

public class Exerci61Array {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int i;
		int[] vetNum1 = new int[10];
		int[] vetNum2 = new int[10];
		int[] vetSoma = new int[10];

		for (i = 0; i < vetNum1.length; i++) {
			System.out.println("Digite um n�mero para preencher os dados do primeiro Vetor: ");
			vetNum1[i] = ler.nextInt();
		}
		for (i = 0; i < vetNum2.length; i++) {
			System.out.println("Digite um n�mero para preecher os dados do segundo Vetor: ");
			vetNum2[i] = ler.nextInt();
		}
		for (i = 0; i < vetSoma.length; i++) {
			vetSoma[i] = vetNum1[i] + vetNum2[i];
		}
		for (i = 0; i < vetSoma.length; i++) {
			System.out.print(vetSoma[i] + " ");
		}
	}

}