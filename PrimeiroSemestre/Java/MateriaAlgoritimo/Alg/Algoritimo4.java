import java.util.Scanner;

public class Algoritimo4 {

	public static void main(String[] argas) {

		int valA, valB, valSoma;

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com dois n�meros para serem somados");
		valA = ler.nextInt();
		valB = ler.nextInt();

		valSoma = valA + valB;
		System.out.println("O valor da soma �: " + valSoma);

	}
}