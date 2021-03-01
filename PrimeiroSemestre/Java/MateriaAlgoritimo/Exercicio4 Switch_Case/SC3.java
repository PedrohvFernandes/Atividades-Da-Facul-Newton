import java.util.Scanner;

public class SC3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int Id;
		double Salario;

		System.out.print(
				"Escolha o ID relacionado ao seu cargo:\n1-Gerente\n2-Vendedor\n3-Programador\n4-Motorista\n5-Vereador\n6-Deputado.\nInsira o ID do seu cargo para saber qual sera o seu novo salario: ");
		// \n � uma quebra linha, /n j� esse nao
		Id = ler.nextInt();

		System.out.print("Isira o seu salario: ");
		Salario = ler.nextDouble();

		switch (Id) {
			case 1:
				System.out.println("A fun��o:" + Id
						+ "-Gerente irar ter um aumento de 30%, ent�o o seu novo salario ser� de R$" + (Salario * 1.3));// 1.3 porque o 100% do salario mais os 30% de aumento
																													
				break;

			case 2:
				System.out.println(
						"A fun��o:" + Id + "-Vendedor irar ter um aumento de 40%, ent�o o seu novo salario ser� de R$"
								+ (Salario * 1.4));
				break;

			case 3:
				System.out.println("A fun��o:" + Id
						+ "-Programador irar ter um aumento de 50%, ent�o o seu novo salario ser� de R$"
						+ (Salario * 1.5));
				break;

			case 4:
				System.out.println(
						"A fun��o:" + Id + "-Motorista irar ter um aumento de 60%, ent�o o seu novo salario ser� de R$"
								+ (Salario * 1.6));
				break;

			case 5:
				System.out.println("A fun��o:" + Id
						+ "-Vereador n�o irar ter um aumento, sendo assim, o cargo de Vereador tera o mesmo salario");
				break;

			case 6:
				System.out.println("A fun��o:" + Id
						+ "-Deputado n�o irar ter um aumento, sendo assim, o cargo de Deputado tera o mesmo salario");
				break;

			default:
				System.out.println("Essa Id, n�o est� registrada nos nossos dados, favor tentar novamente");

		}

	}
}