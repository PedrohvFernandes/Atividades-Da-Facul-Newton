import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Idade;

		System.out.print("Insiria a sua idade, para saber qual a classe que voc� se insere: ");
		Idade = entrada.nextInt();

		if ((Idade >= 0 && Idade < 18))
			System.out.println("Essa idade " + Idade + " anos est� na classe de menores de idade");
		else if ((Idade >= 18 && Idade < 65))
			System.out.println("Essa idade " + Idade + " anos est� na classe de maior de idade");
		else
			System.out.println("Essa idade " + Idade + " anos est� na classe dos idosos");

	}
}