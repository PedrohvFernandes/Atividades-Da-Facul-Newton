import java.util.Scanner;

public class AlterarDadosPessoais {

	public ContaBancaria atualizarConta(String nome, String codLetras, ContaBancaria conta) {

		String auxCodLetras;
		String auxNome;

		Scanner input = new Scanner(System.in);

		if (conta.getNome().equalsIgnoreCase(nome)) {
			System.out.println("Pra qual nome você quer mudar: ");
			conta.setNome(auxNome = input.nextLine());
			System.out.println("\nA conta com o nome: " + nome + " foi alterado para: " + auxNome + "\n");
		}

		if (conta.getCodLetras().equals(codLetras)) {
			System.out.println("Pra qual codigo de letras você quer mudar: ");
			conta.setCodLetras(auxCodLetras = input.nextLine());
			System.out.println(
					"\nA conta com o codigo de letras: " + codLetras + " foi alterado para: " + auxCodLetras + "\n");

		}

		return conta;
	}
}