import java.util.Scanner;

public class FrasesVogalvet {
	public static void main(String[] args) {

		int vogal = 0, naovogais = 0;
		// boolean dados = false;
		String[] vogais = new String[1];

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < vogais.length; i++) {
			System.out.println("Digite uma frase: ");
			vogais[i] = ler.nextLine();
		}
		for (int i = 0; i < vogais[0].length(); i++) {// length() com par�ntese se usa quando se usar o metodo chars
			if (String.valueOf(vogais[0].charAt(i)).equalsIgnoreCase("a")
					|| String.valueOf(vogais[0].charAt(i)).equalsIgnoreCase("e")
					|| String.valueOf(vogais[0].charAt(i)).equalsIgnoreCase("i")
					|| String.valueOf(vogais[0].charAt(i)).equalsIgnoreCase("o")
					|| String.valueOf(vogais[0].charAt(i)).equalsIgnoreCase("u")) {
				// dados = true;
				vogal++;
				System.out.print("\nQuantidade de vogal: " + vogal);

			}

		}

	}
}

/*
 * "equalsIgnoreCase" quando quer comparar uma String, sem fazer distin��o entre
 * letras "maiusculas" ou "minusculas". Ele nao faz a verifica��o entre
 * maiusculo e minusculo, so verifica se as letras sao as mesmas. metodo
 * "ValueOf"--> ele retorna uma String que represente o valor que voc� passar.
 * metodo "charAt" --> extraindo chars, com esse metodo conseguimos acessar cada
 * caracter que esta dentro da string. (i)--> indice para interar cada caracter
 * que possui na string.
 */
