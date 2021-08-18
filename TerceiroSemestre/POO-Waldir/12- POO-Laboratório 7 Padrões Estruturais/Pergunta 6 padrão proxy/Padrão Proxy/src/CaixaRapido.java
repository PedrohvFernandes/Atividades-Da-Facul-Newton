import java.util.Calendar;
import java.util.Scanner;

public class CaixaRapido {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		CartaoDeCredito cartao = new CartaoDeCredito();

		System.out.println("================ Seja bem vindo(a) no banco Newton ================");

		System.out.println("Digite seu nome e o codigo de letras para realizar o seu cadastro:");
		String nomeCliente = input.nextLine();
		String codLetrasCliente = input.nextLine();

		System.out.println("Digite a senha do seu cartão: ");
		String senhaCartaoCliente = input.nextLine();
		cartao.setSenha(senhaCartaoCliente);

		ContaBancaria contaBancaria = new ContaBancaria(nomeCliente, codLetrasCliente, cartao);

		ValidarCliente valCliente = new ValidarCliente();

		Calendar c = Calendar.getInstance();
		int min = c.get(Calendar.MINUTE);

		System.out.println("Valide o codigo de letras da sua conta "
				+ "e a senha do seu cartão para realizar as transações no banco Newton");

		String codLetrasAux = input.nextLine();
		String senhaCartaoAux = input.nextLine();

		if (valCliente.validarContaBancaria(contaBancaria, codLetrasAux, senhaCartaoAux)) {

      
      System.out.println("INFO: A SESSÃO INICIOU: "+ c.getTime());
	
    
    	int i = 0;

			// Enquanto os minutos forem menor que tres o usuario podera executar as
			// transa�es no banco
			while ((c.get(Calendar.MINUTE) - min) < 3 && i != 5) {

				c = Calendar.getInstance();

				// Se for maior ou igual a tres o usuario tera que colocar o codLetras e a senha
				// do cart�o novamente
				if ((c.get(Calendar.MINUTE) - min) >= 3) {

					// Novo tempo
					min = c.get(Calendar.MINUTE);

					System.out.println("\nSessão encerrada por limite de tempo");

					System.out.println("Entre novamente com o seu codigo de letras e a senha do seu cartão");

					codLetrasAux = input.nextLine();
					senhaCartaoAux = input.nextLine();

					boolean validadorCliente = valCliente.validarContaBancaria(contaBancaria, codLetrasAux,
							senhaCartaoAux);

					if (validadorCliente == false) {

						System.out.println("Codigo de letras ou senha do cartão incorreto, reinicie a aplicaão");
						return;

					}
				} else {

					System.out.print("||=============================||\n");
					System.out.print("| 1 - Saque       	        |\n");
					System.out.print("| 2 - Deposito                |\n");
					System.out.print("| 3 - Tranferencia            |\n");
					System.out.print("| 4 - Alterar dados pessoais  |\n");
					System.out.print("| 5 - Sair	                |\n");
					System.out.print("||=============================||\n");

					i = input.nextInt();

					if (i == 1) {
						System.out.println("Valor que deseja sacar: ");

						float valor = input.nextFloat();

						System.out.println("A senha do seu cartão de credito: ");

						input.nextLine();// consome uma linha
						String senhaAux = input.nextLine();

						var saque = new Saque();

						System.out.println(saque.transacao(valor, senhaAux, cartao));

						continue;
					}
					if (i == 2) {
						System.out.println("Valor que deseja depositar: ");

						float valor = input.nextFloat();

						System.out.println("A senha do seu cartão de credito: ");

						input.nextLine();// consome uma linha
						String senhaAux = input.nextLine();

						var deposito = new Deposito();

						System.out.println(deposito.transacao(valor, senhaAux, cartao));

						continue;
					}
					if (i == 3) {
						System.out.println("Valor que deseja realizar a transferencia: ");

						float valor = input.nextFloat();

						System.out.println("A senha do seu cartão de credito: ");

						input.nextLine();// consome uma linha
						String senhaAux = input.nextLine();

						var transferencia = new Transferencia();

						System.out.println(transferencia.transacao(valor, senhaAux, cartao));

						continue;
					}
					if (i == 4) {
						
						System.out.print("||=============================||\n");
						System.out.print("| 1 - Alterar o nome     	        |\n");
						System.out.print("| 2 - Alterar o codigo de letras  |\n");
						System.out.print("||=============================||\n");
						
						i = input.nextInt();
						
						var alterarDados = new AlterarDadosPessoais();

						if (i == 1) {
							input.nextLine();// consome uma linha
							System.out.println("Qual o nome da sua conta: ");
							String nomeAux = input.nextLine();
							alterarDados.atualizarConta(nomeAux, null, contaBancaria);
							

						}
						if (i == 2) {
							
							input.nextLine();// consome uma linha
							System.out.println("Qual é o seu codigo de letras: ");
							codLetrasAux = input.nextLine();
							alterarDados.atualizarConta(null, codLetrasAux, contaBancaria);

						}

						

						continue;
					}
					System.out.println(
							"Sr(a) " + contaBancaria.getNome() + " nos da Newton agradecemos pela preferencia");
				}

			}

		} else {
			System.out.println("Codigo de letras ou senha do cartão incorreto, reinicie a aplicação");
		}

	}
}
