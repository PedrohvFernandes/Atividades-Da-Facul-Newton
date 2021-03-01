import java.util.Scanner;

public class Exercicio18IF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float salario, NovoSalario, ValorReajuste;
		float porcen = 15;
		porcen = 10;
		porcen = 5;

		System.out.println("Esecreva o salario, para o reajuste");
		salario = ler.nextFloat();

		if (salario < 500)
			System.out.println("O reajuste do salario " + salario + " sera de 15%");
		else if ((salario >= 500) && (salario < 1001))
			System.out.println("O reajuste do salario " + salario + " sera de 10%");
		else
			System.out.println("O reajuste do salario " + salario + " sera de 5%");

		NovoSalario = salario + (salario * porcen) / 100;
		System.out.println("O salario novo �: " + NovoSalario);
		ValorReajuste = NovoSalario - salario;
		System.out.println("O valor dos reajuste �: " + ValorReajuste);

	}
}