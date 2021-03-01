import java.util.Scanner;

public class Exercici50WhileCond {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int qtdeProduto;
		double valorProduto, valorCompra = 0, valorItem;
		String descProduto;
		descProduto = "a";// No tipo string se starta com uma letra "variavel" = "xxxx"

		System.out.println("Digite <FIM> para para parar");

		// while(descProduto!="FIM") // PARAR A REPETIÇÃO DO TIPO STRING - ERRADO!!!

		while (!"FIM".equals(descProduto))// (!descProduto.equals("FIM"); //(While)enquanto a "varivel" não for igual a
											// fim é para continuar rodando
		// equals(igual) // o equals so serve pra tratar dados do tipo string
		{
			// NÃO IGUAL - ESTOU FALANDO QUE É DIFERENTE // !FIM(Exemplo)
			// PARA SER IGUAL - FIM(Exemplo)

			System.out.println("Entre com a descrição do produto");
			descProduto = ler.nextLine(); // o usuario interage aqui, entao o comando FIM vem pra ca

			if (!"FIM".equals(descProduto))// if(se)a "variavel" Não for igual a fim é para continuar rodando
			{
				System.out.println("Entre com o valor unitário do produto");
				valorProduto = ler.nextDouble();

				System.out.println("Entre com o quantidade a ser comprada do produto");
				qtdeProduto = ler.nextInt();

				valorItem = qtdeProduto * valorProduto;
				valorCompra += valorItem;

			}
		}

		System.out.println("O valor da compra eh: " + valorCompra);
	}
}