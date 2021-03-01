import java.util.Scanner;

public class Exercicio48WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, SomaNum = 0;

		System.out.print("Quando quiser finalizer precione o n�mero 0\n");

		while (num != 0) {

			System.out.println("Entre com n�meros para serem somados : ");
			num = ler.nextInt();

			if (num > 5)
				SomaNum += num;
		}
		System.out.println("A soma dos numeros maiores que 5 eh: " + SomaNum);

	}
}