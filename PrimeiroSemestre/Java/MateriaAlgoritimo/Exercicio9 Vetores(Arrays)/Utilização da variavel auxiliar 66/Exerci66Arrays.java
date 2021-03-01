import java.util.Scanner;

public class Exerci66Arrays {
	public static void main(String[] args) {
		int i;
		int vetNum[] = new int[5];
		int auxMenor, auxPos; // var aux

		Scanner ler = new Scanner(System.in);

		for (i = 0; i < vetNum.length; i++) { // entrada dos dados no vetor
			System.out.println("Digite um n�mero para armazenar no vetor: ");
			vetNum[i] = ler.nextInt(); // variavel
		}
		auxMenor = vetNum[0]; // posi��o zero
		auxPos = 0; // Posi��o zero
		for (i = 0; i < vetNum.length; i++) { // processamento- localizar a posi��o do dado menor no vetor e qual era o
												// dado
			if (vetNum[i] < auxMenor) {
				auxMenor = vetNum[i];
				auxPos = i;
			}
			System.out.println("O menor N�mero do vetor �: " + auxMenor); // saida- imprimir o vetor resultante
			System.out.println("A sua posi��o �: " + auxPos);

		}
	}
}