import java.util.Scanner;

public class Exercici55WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, contadorPosi = 0, SomaPosi = 0;

		System.out.print("Digite 0 para encerrar a opera��o\n");

		while (num != 0) {
			System.out.println("Entre com 'X' numeros: ");
			num = ler.nextInt();

			if (num != 0) {
				if (num > 0) {
					contadorPosi++;
					SomaPosi += num;
				}
			}
		}

		System.out.println("A quantidade de numeros positivos digitados foi: " + contadorPosi);
		System.out.println("A soma entre os n�meros positivos eh: " + SomaPosi);

	}
}