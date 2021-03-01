import java.util.Scanner;

public class Exerci65Array {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int i;
		double[] Preco = new double[3];
		double[] PrecoSoma = new double[3];

		for (i = 0; i < Preco.length; i++) {
			System.out.println("Digite 10 pre�os dos produto para serem atualizados para <10%>: ");
			Preco[i] = ler.nextDouble();
		}
		for (i = 0; i < PrecoSoma.length; i++) {
			PrecoSoma[i] = Preco[i] * 1.10;
		}
		for (i = 0; i < PrecoSoma.length; i++) {
			System.out.printf("%.2f ", PrecoSoma[i]);

		}
	}
}