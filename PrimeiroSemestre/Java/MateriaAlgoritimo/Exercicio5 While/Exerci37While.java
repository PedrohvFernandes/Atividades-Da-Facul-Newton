import java.util.Scanner;

public class Exerci37While {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cnt, cnt2, num, numImp = 0, numPar = 0;
		cnt = 1;
		cnt2 = 0;

		while (cnt2 <= 0) {

			System.out.print("Entre com um n�mero: ");// primeira rodada vai come�ar daqui
			num = ler.nextInt();
			if (num != 0) {
				if (num % 2 == 0)
					numPar++;
				else
					numImp++;

			}
			cnt2++;
		}

		while (cnt <= 9) {

			System.out.print("Entre com um outro n�mero: "); // o restante das rodas aqui 1+9=10 rodadas
			num = ler.nextInt();

			if (num != 0) {
				if (num % 2 == 0)
					numPar++;
				else
					numImp++;

			}
			cnt++;
		}
		System.out.print("Total de n�meros Pares: " + numPar + "\n");
		System.out.print("Total de n�meros Impares: " + numImp);

	}

}