import java.util.Scanner;

public class Exerci58DoWhile {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int qtdeProduto;
		double valorProduto, valorCompra = 0, valorItem;
		String descProduto;
		descProduto = "a";// No tipo string se starta com uma letra "variavel" = "xxxx"

		System.out.println("Digite <FIM> para para parar");

		do {

			System.out.println("Entre com a descri��o do produto");
			descProduto = ler.nextLine(); // o usuario interage aqui, entao o comando FIM vem pra ca

			if (!"FIM".equals(descProduto))// if(se)a "variavel" N�o for igual a fim � para continuar rodando
			{
				System.out.println("Entre com o valor unit�rio do produto");
				valorProduto = ler.nextDouble();

				System.out.println("Entre com o quantidade a ser comprada do produto");
				qtdeProduto = ler.nextInt();

				valorItem = qtdeProduto * valorProduto;
				valorCompra += valorItem;

			}
		}
		// while(descProduto!="FIM") // PARAR A REPETI��O DO TIPO STRING - ERRADO!!!
		while (!"FIM".equals(descProduto)); // (!descProduto.equals("FIM"); //(While)enquanto a "varivel" n�o for igual
											// a fim � para continuar rodando
		// equals(igual) // o equals so serve pra tratar dados do tipo string
		// N�O IGUAL - ESTOU FALANDO QUE � DIFERENTE // !FIM(Exemplo)
		// PARA SER IGUAL - FIM(Exemplo)

		System.out.println("O valor da compra eh: " + valorCompra);
	}
}