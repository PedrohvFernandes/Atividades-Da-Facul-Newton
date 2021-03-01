import java.util.Scanner;

public class Exerci63Array {
	public static void main(String[] args) {

		int i, auxiliar = 7;
		String[] vetNomes1 = new String[8];
		String[] vetNomes2 = new String[8];

		Scanner ler = new Scanner(System.in);

		for (i = 0; i < vetNomes1.length; i++) {
			System.out.println("Digite um nome: ");
			vetNomes1[i] = ler.nextLine();
		}
		for (i = 0; i < vetNomes2.length; i++) {
			vetNomes2[i] = vetNomes1[auxiliar];
			auxiliar--;
		}
		/*
		 * outra maneira de fazer o decremento nao segundo array:
		 * for(i=vetNomes1.length-1;i>=0;i--){ vetNomes2[auxiliar] = vetNomes1[i];
		 * auxiliar++; nao esquecer de alterar o star da variavel auxilixar para 0.
		 */
		for (i = 0; i < vetNomes2.length; i++) {
			System.out.print(vetNomes2[i] + " ");
		}
	}
}