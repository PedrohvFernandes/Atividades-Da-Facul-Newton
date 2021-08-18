import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        var menu = new Menu();

        do {
            menu.Menu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    input.nextLine();
                    System.out.println("Digite o numero da placa do veiculo, para realiazar o cadastro de entrada: ");
                    String placa = input.nextLine();
                    menu.cadastrarEntradaVeiculo(placa);
                    break;

                case 2:
                    input.nextLine();
                    System.out.println("Digite o numero da placa do veiculo, para realizar o cadastro de saida: ");
                    placa = input.nextLine();
                    menu.cadastrarSaidaVeiculo(placa);

                    break;

                case 3:
                    input.nextLine();
                    System.out.println("Digite o numero da placa do veiculo, para exibir o valor a pagar: ");
                    placa = input.nextLine();
                    menu.exibirValorAPagar(placa);
                    break;

                case 4:
                    menu.exibirVeiculosEstacionados();
                    break;

                case 5:
                    menu.exibirHistorico();
                    break;

                case 6:
                    menu.obterTaxaDeOcupacao();
                    break;

                case 7:
                    menu.obterNumerTotalDeVagas();
                    break;

                case 8:
                    menu.obterNumeroTotalDeAutomoveis();
                    break;

                case 9:
                    System.out.println("Obrigado por usar o nosso software,\033[0;34m Minas Park\033[0m agradece😎");
                    break;

                default:
                    System.out.println("\033[0;31mERRO: Opção inválida.\033[0m");
            }
        } while (opcao != 9);
    }

}