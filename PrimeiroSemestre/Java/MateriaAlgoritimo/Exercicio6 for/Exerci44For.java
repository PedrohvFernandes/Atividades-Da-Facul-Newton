import java.util.Scanner;

public class Exerci44For {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int Cnt, Cnt2, Anos, Anos21 = 0, Anos50 = 0, Anos22 = 0;

		for (Cnt2 = 0; Cnt2 <= 0; Cnt2++) {

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

		}
		for (Cnt = 1; Cnt <= 9; Cnt++) {

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

		}
		System.out.print("Pessoas com menos de 21 anos �: " + Anos21 + "\n");
		System.out.print("Pessoas entre 21 e 50 anos �: " + Anos22 + "\n");
		System.out.print("Pessoas com mais de 50 anos �: " + Anos50);
	}
}