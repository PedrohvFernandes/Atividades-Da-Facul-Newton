import java.util.Scanner;

public class Exerci45For {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cnt, cnt2, num, numImp = 0, numPar = 0;

		for (cnt2 = 0; cnt2 <= 0; cnt2++) {

			System.out.print("Entre com um n�mero: ");// primeira rodada vai come�ar daqui
			num = ler.nextInt();
			if (num != 0) {
				if (num % 2 == 0)
					numPar++;
				else
					numImp++;

			}
		}

		for (cnt = 1; cnt <= 9; cnt++) {
			System.out.print("Entre com um outro n�mero: ");
			num = ler.nextInt();

			if (num != 0) {
				if (num % 2 == 0)
					numPar++;
				else
					numImp++;

			}
		}
		System.out.print("Total de n�meros Pares: " + numPar + "\n");
		System.out.print("Total de n�meros Impares: " + numImp);

	}

}