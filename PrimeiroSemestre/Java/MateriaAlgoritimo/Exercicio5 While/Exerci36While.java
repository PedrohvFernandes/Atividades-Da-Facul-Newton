import java.util.Scanner;

public class Exerci36While {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int Cnt, Cnt2, Anos, Anos21 = 0, Anos50 = 0, Anos22 = 0;
		Cnt = 1;
		Cnt2 = 0;

		while (Cnt2 <= 0) {

			System.out.print("Entre com uma idade: ");// primeira rodada vai come�ar daqui
			Anos = ler.nextInt();

			if (Anos != 0) {

				if (Anos < 21)
					Anos21++;
				else if (Anos > 50)
					Anos50++;
				else
					Anos22++;
			}
			Cnt2++;

		}
		while (Cnt <= 9) {

			System.out.print("Entre com outra idade: "); // o restante das rodadas aqui 1+9=10 rodadas
			Anos = ler.nextInt();

			if (Anos != 0) {

				if (Anos < 21)
					Anos21++;
				else if (Anos > 50)
					Anos50++;
				else
					Anos22++;
			}

			Cnt++;
		}
		System.out.print("Pessoas com menos de 21 anos �: " + Anos21 + "\n");
		System.out.print("Pessoas entre 21 e 50 anos �: " + Anos22 + "\n");
		System.out.print("Pessoas com mais de 50 anos �: " + Anos50);
	}
}