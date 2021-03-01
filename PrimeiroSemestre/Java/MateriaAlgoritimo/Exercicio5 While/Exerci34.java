import java.util.Scanner;

public class Exerci34 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num, Numpos = 0, Numneg = 0, I = 1;

		while (I <= 10) {

			System.out.println("Entre com 10 numeros para serem somados: ");
			num = ler.nextInt();

			if (num == 0) {
				System.out.println("Usuario voc� digitou o numero 0");

				if (num > 0)
					Numpos = Numpos + num; // ou Numpos+=num;

				else
					Numneg = Numneg + num; // ou Numneg+=num;

				I++;

			}

		}

		System.out.println("A soma dos numeros positivos somados �: ");
		System.out.println("A soma do numeros negativos somados �: ");

	}

}