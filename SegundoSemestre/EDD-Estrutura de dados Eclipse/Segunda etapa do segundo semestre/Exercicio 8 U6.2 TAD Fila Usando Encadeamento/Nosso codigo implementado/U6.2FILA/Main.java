import java.util.Scanner;

public class Main {

	public static void exibirMenu() {
		System.out.println("======================================");
		System.out.println("EdD - TAD Fila\n");

		System.out.println("1. Criar uma fila vazia");
		System.out.println("2. Enfileirar novo item");
		System.out.println("3. Desenfileirar item");
		System.out.println("4. Exibir fila");
		System.out.println("5. Está cheia?");
		System.out.println("6. Está vazia?");
		System.out.println("7. Exibir o elemento na frente");
		System.out.println("8. Exibir o elemento de trás");
		System.out.println("9. Pesquisar por uma chave na fila");
		System.out.println("10. Inverter a fila");
		System.out.println("11. Frente para trás");
		System.out.println("12. Trás pra frente");
		System.out.println("13. Inserir fura-fila");
		System.out.println("14. Alterar valor na fila");
		System.out.println("15. Sair do programa\n");

		System.out.print("Escolha uma das opções acima (1-15): ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		TadFila fila = null;

		int opcoes = 0;

		boolean resultado;

		while (opcoes != 15) {
			exibirMenu();
			opcoes = input.nextInt();

			switch (opcoes) {
				case 1:
					System.out.print("Digite a capacidade desejada: ");
					int capacidade = input.nextInt();

					fila = new TadFila(capacidade);

					break;
				case 2:
					System.out.println("Digite o valor para inserir: ");
					fila.enfileirar(input.nextInt());

					break;
				case 3:
					fila.desenfileirar();
					fila.exibir();
					break;
				case 4:
					fila.exibir();
					break;
				case 5:
					if (fila.estahCheia()) {
						System.out.println("A fila está cheia.");
						fila.exibir();
					} else if (fila.tamanho == 0) {
						System.out.println("Está vazia a fila.");
						fila.exibir();
					} else {
						System.out.println("Ainda tem espaço na fila.");
						fila.exibir();
					}
					break;
				case 6:
					if (fila.estahVazia()) {
						System.out.println("A fila está vazia.");
						fila.exibir();
					} else if (fila.tamanho != fila.capacidade) {
						System.out.println("A fila ainda tem espaço.");
						fila.exibir();
					} else {
						System.out.println("Não tem espaço na fila.");
						fila.exibir();
					}
					break;
				case 7:
					fila.obterFrente();
					break;
				case 8:
					fila.obterTras();
				case 9:
					if (fila.estahVazia()) {
						System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
					} else {
						System.out.println("Digite o valor que deseja pesquisar: ");
						fila.pesquisar(input.nextInt());
					}
					break;
				case 10:
					fila.inverter();
					System.out.println("Fila invertida: ");
					fila.exibir();
					break;
				case 11:
					fila.exibir();
					if (fila.jogarFrenteParaTras()) {
						System.out.println("Frente movida para Trás com sucesso");
					} else {
						System.out.println("Não foi possível mover a Frente para trás");
					}

					break;

				case 12:
					fila.exibir();
					if (fila.jogarTrasParaFrente()) {
						System.out.println("Trás movida para Frente com sucesso");
					} else {
						System.out.println("Não foi possível mover a Trás para trás");
					}

					break;
				case 13:
					resultado = fila.furarFila(4);

					if (resultado) {
						System.out.println("Esperto!");
					} else {
						System.out.println("Não conseguiu furar fila.");
					}
					break;
				case 14:
					fila.alterarValor(input.nextInt(), input.nextInt());
					fila.exibir();
			}
		}

		System.out.println("Obrigado por usar o nosso programa :D\n");
	}

}
