import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double Valor;
		String Produto;

		System.out.print("Nome do produto: ");
		Produto = ler.nextLine();

		System.out.print("Valor do produto: ");
		Valor = ler.nextDouble();

		if (Valor < 100) {
			System.out.println("O nome do produto �: " + Produto + " O valor do produto �: " + Valor
					+ " e o valor da venda �: " + Valor * 1.7 + ".");// 1.7 porque � 100% e 70%, o 100% � o valor do
																		// produto e os 70% o lucro
		} else if ((Valor >= 100 && Valor <= 200)) {
			System.out.println("O nome do produto �: " + Produto + " O valor do produto �: " + Valor
					+ " e o valor da venda �: " + Valor * 1.5 + ".");// 1.5 porque � 100% e 50%, o 100% � o valor do
																		// produto e os 50% o lucro
		} else {
			System.out.println("O nome do produto �: " + Produto + " O valor do produto �: " + Valor
					+ " e o valor da venda �: " + Valor * 1.3 + ".");// 1.3 porque � 100% e 30%, o 100% � o valor do
																		// produto e os 30% o lucro
		}

	}
}