import java.util.Scanner;

public class SC {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int Mes;

		System.out.print("Insira o numero do m�s: ");
		Mes = ler.nextInt();

		switch (Mes) { // o switch permite executar uma entre m�ltiplas escolhas de a��es.Sendo assim,
						// � poss�vel substituir m�ltiplos �ifs� encadeados por um c�digo mais simples
						// de criar.
			// switch (Mes) dentro do parentese se coloca o nome da varivel, na qual o
			// switch irar trabalhar
			case 1: // o case em portugues seria o caso, com isso ele irar trabalhar com o caso 1,
					// ou A, depende do tipo da variavel, se ela � um Int ou um Single. O case pode
					// trabalhar com varios casos e quando o usuario coloca o dado especifico do
					// caso, ele ira dar Verdade, e finalmente sendo executado.
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Janeiro");
				break; // O comando break, quando executado, encerra a execu��o da estrutura(linha do
						// codigo) onde ele se encontra.Sendo assim ele encerra o codigo, apartir do
						// momento que der verdade
			case 2:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Fevereiro");
				break;
			case 3:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Mar�o");
				break;
			case 4:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Abril");
				break;
			case 5:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Maio");
				break;
			case 6:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Junho");
				break;
			case 7:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Julho");
				break;
			case 8:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Agosto");
				break;
			case 9:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Setembro");
				break;
			case 10:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Outubro");
				break;
			case 11:
				System.out.println("O m�s " + Mes + ", � denomiando como o m�s de Novembro");
				break;
			case 12:
				System.out.println("O m�s " + Mes + ", � denominado como o m�s de Dezembro");
				break;
			default:
				System.out.println("M�s invalido");
				// o default em portugues padrao.Caso todos os cases forem testados e todos
				// derem falsos, sera executado o default, dizendo que n�o foi encontrado o caso
				// inserido pelo usuario. Neste caso, n�o � necess�rio acrescentar o comando
				// break, pois este � sempre o �ltimo
				// comando da estrutura switch.

		} // Final do comando switch fechado com as chaves

	}

}
