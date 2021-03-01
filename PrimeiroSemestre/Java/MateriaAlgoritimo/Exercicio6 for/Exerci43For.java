import java.util.Scanner;

public class Exerci43For {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int Num = 0, soma = 0, naosoma = 0;

		for (I = 1; I <= 10; I++) {

			System.out.println("Entre com 10 n�meros a baixo de 40: ");
			Num = ler.nextInt();

			if (Num < 40)
				soma = soma + Num;

			else
				naosoma = naosoma + Num;

		}
		System.out.println("A soma desses numeros � : " + soma);

	}

}