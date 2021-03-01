import java.util.Scanner;

public class Exerci33While {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double num, Soma = 0, Media = 0, Dobro = 0;
		int cnt = 1;

		while (cnt <= 5) {
			System.out.print("Entre com cinco n�meros para serem somados: ");
			num = ler.nextDouble();

			Soma = Soma + num;

			Dobro = Soma * 2;

			Media = Soma / 5;

			cnt++;

		}

		System.out.printf("A soma de todos os numeros digitados � : %.2f\n", Soma);
		System.out.printf("A m�dia de todos os numeros �: %.2f\n", Media);
		System.out.printf("O dobro de todos os n�meros �: %.2f\n", Dobro);

	}
}