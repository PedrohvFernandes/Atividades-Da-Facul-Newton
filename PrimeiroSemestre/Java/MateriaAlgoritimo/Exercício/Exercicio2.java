import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double num, quadrado;

		System.out.println("Entre com um n�mero para calcular seu quadrado");
		num = entrada.nextDouble();

		quadrado = Math.pow(num, 2);
		System.out.println("O quadrado do n�mero " + num + " �: " + quadrado);

	}
}