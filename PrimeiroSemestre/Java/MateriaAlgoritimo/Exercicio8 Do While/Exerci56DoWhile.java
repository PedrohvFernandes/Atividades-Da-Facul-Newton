import java.util.Scanner;

public class Exerci56DoWhile {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, SomaNum = 0, contadorNum = 0;
		double media;

		System.out.print("Quando quiser finalizer precione o n�mero 0\n");

		do {

			System.out.println("Entre com um n�mero para obter a media: ");
			num = ler.nextInt();

			if (num != 0) {
				SomaNum += num;
				contadorNum++;
			}

		} while (num != 0);

		media = (SomaNum / contadorNum);
		System.out.println("A m�dia eh: " + media);
	}
}