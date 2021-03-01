import java.util.Scanner;

public class Exercicio24Decre {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num1, num2;

		System.out.print("Entre com o primeiro numero inteiro: ");
		num1 = entrada.nextInt();

		System.out.print("Entre com o segundo numero inteiro: ");
		num2 = entrada.nextInt();

		if (num1 == num2)
			System.out.println("N�o possui ordem decrescente, pois os numeros sao iguais");

		else if (num1 < num2)
			System.out.println("A ordem da numera��o � : " + num2 + " , " + num1);

		else
			System.out.println("A ordem da numera��o �: " + num1 + " , " + num2);

	}
}