import java.util.Scanner;

public class Exercicio47WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, SomaNum = 0, media, contadorNum = 0;

		System.out.print("Quando quiser finalizer precione o número 0\n");

		while (num != 0) {

			System.out.println("Entre com um número para obter a media: ");
			num = ler.nextInt();

			if (num != 0) {
				SomaNum += num;
				contadorNum++;
			}

		}

		media = (SomaNum / contadorNum);
		System.out.println("A média eh: " + media);
	}
}