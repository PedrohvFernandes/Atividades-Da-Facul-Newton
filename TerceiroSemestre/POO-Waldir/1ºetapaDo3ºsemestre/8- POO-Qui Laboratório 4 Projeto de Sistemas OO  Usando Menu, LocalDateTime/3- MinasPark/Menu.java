public class Menu {

    Estacionamento minasPark = new Estacionamento(10,"Minas Park", 0, 12f);

    public static void Menu(){
        System.out
				.println("\n###               \033[0;34m Minas Park controle de estacionamento \033[0m       ###");
		System.out.println("\n                     ==============================");
		System.out.println("                  |     1 - Cadastrar entrada veiculo    |");
		System.out.println("                  |     2 - Cadastrar saida veiculo      |");
        System.out.println("                  |     3 - Exibir o valor a pagar       |");
		System.out.println("                  |     4 - Exibir todos os veiculos     |");
        System.out.println("                  |     5 - Exibir historico veiculos    |");
		System.out.println("                  |     6 - Exibir a taxa de ocupação    |");
		System.out.println("                  |     7 - Exbir o total de vagas       |");
        System.out.println("                  |     8 - Exbir o total de veiculos    |");
		System.out.println("                  |     9 - Sair                         |");
		System.out.println("                      ==============================\n");

    }

    public void cadastrarEntradaVeiculo(String placa){
        minasPark.cadastrarEntradaCarro(placa);
    }

    public void cadastrarSaidaVeiculo(String placa){
        minasPark.cadastrarSaidaCarro(placa);
    }


    public void exibirValorAPagar(String placa){
        minasPark.exibirValorAPagar(placa);
    }

    public void exibirVeiculosEstacionados(){
        minasPark.exibirVeiculos();
    }

    public void exibirHistorico(){
        minasPark.exibirHistorico();
    }

    public void obterTaxaDeOcupacao(){
        minasPark.calcularTaxaOcupacao();
    }

    public void obterNumerTotalDeVagas(){
        minasPark.calcularQuantidadeVagasDisponivel();
    }

    public void obterNumeroTotalDeAutomoveis(){
        minasPark.obterTotalDeAutomoveis();

    }
}
