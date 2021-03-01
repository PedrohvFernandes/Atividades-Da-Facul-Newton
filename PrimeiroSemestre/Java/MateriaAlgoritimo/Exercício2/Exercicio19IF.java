import java.util.Scanner;

public class Exercicio19IF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Informe sua idade");
		idade = ler.nextInt();

		if (idade < 16)
			System.out.println(+idade + " Anos, Com essa idade a pessoa n�o pode se tornar um eleitor");

		else if ((idade > 18) && (idade < 66))
			System.out.println(+idade + " Anos, Eleitores com esse idade s�o considerados obrigatorios");

		else if (idade == 18)
			System.out.println(+idade + " Anos, Eleitores com essa idade � considerado facultativos e obrigatoios");

		else if ((idade >= 16) && (idade < 18))
			System.out.println(+idade + " Anos, Eleitores com essa idade � considerados5 facultativos");

		else
			System.out.println(+idade + " Anos, Eleitores com essa idade � considerados facultativos");

	}
}
