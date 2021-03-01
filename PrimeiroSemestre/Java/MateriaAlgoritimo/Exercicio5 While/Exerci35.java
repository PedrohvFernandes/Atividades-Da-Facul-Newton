import java.util.Scanner;

public class Exerci35 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int I = 1, Num = 0, soma = 0, naosoma = 0;

		while (I <= 10) {

			System.out.println("Entre com 10 n�meros a baixo de 40: ");
			Num = ler.nextInt();

			if (Num < 40)
				soma = soma + Num;

			else
				naosoma = naosoma + Num;

			I++;

		}
		System.out.println("A soma desses numeros � : " + soma);

	}

}