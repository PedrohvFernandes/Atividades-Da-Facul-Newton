import java.util.Scanner;

public class Exerci57DoWhile {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 1, SomaNum = 0;

		System.out.print("Quando quiser finalizer precione o n�mero 0\n");

		do {

			System.out.println("Entre com n�meros para serem somados : ");
			num = ler.nextInt();

			if (num > 5)
				SomaNum += num;
		} while (num != 0);

		System.out.println("A soma dos numeros maiores que 5 eh: " + SomaNum);

	}
}