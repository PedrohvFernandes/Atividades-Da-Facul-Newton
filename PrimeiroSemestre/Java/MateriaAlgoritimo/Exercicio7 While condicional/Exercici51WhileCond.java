import java.util.Scanner;

public class Exercici51WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade = 0, idadeM = 0;
		double peso = 0, pesoF = 0, MediaIda = 0, MediaPeso = 0, SexoM = 0, SexoF = 0;
		String Sexo = "a";

		System.out.println("A digita��o se encerra quando precionar o <-1> <-um>");

		while (idade != -1) {

			System.out.println("Qual � a sua idade?");
			idade = ler.nextInt();// Intera��o com o usuario

			if (idade != -1) {

				System.out.println("Qual � o seu peso?");
				peso = ler.nextDouble();

				ler = new Scanner(System.in);

				System.out.println("Qual � o seu sexo?");
				System.out.println(
						"Para definir o seu sexo basta precionar a tecla <M ou m> para homem e <F ou f> para mulher");
				Sexo = ler.nextLine();

				if ("F".equals(Sexo) || "f".equals(Sexo))// feminino
				{
					System.out.println("Voc� escolheu a op��o Feminino");
					SexoF++;
					pesoF += peso;
				} else if ("M".equals(Sexo) || "m".equals(Sexo))// MASCULINO
				{
					System.out.println("Voc� escolheu a op��o Masculino");
					SexoM++;
					idadeM += idade;
				}

				else {
					System.out.println("Sexo invalido");
				}
				MediaPeso = pesoF / SexoF;
				MediaIda = idadeM / SexoM;
			}
		}
		System.out.println("Total de homens: " + SexoM);
		System.out.println("Total de mulheres: " + SexoF);
		System.out.println("M�dia das idades dos homens: " + MediaIda);
		System.out.println("M�dia dos pesos das mulheres: " + MediaPeso);
	}
}