import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num1, num2, resultadoSoma, result;

		System.out.print("Insira o primeiro numero: ");
		num1 = entrada.nextInt();

		System.out.print("Insira o segundo numero: ");
		num2 = entrada.nextInt();

		if (num1 == num2)
			result = num1 + num2;
		else
			result = num1 * num2;

		resultadoSoma = result;
		System.out.println("O resultado da soma �: " + resultadoSoma);

	}
}