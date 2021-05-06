public class Menu {

    Estacionamento minasPark = new Estacionamento(5,"Minas Park", 0, 12f);

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

    public void cadastrarEntradaVeiculo(String placa){//
        minasPark.cadastrarEntradaCarro(placa);
    }

    public void cadastrarSaidaVeiculo(String placa){// se eu adicionar mais de um carro, so consigo remover 1, pois quando eu vou remover algum outro carro fala que ele não existe
        minasPark.cadastrarSaidaCarro(placa);
    }


    public void exibirValorAPagar(String placa){//OK
        minasPark.exibirValorAPagar(placa);
    }

    public void exibirVeiculosEstacionados(){//OK
        minasPark.exibirVeiculos();
    }

    public void exibirHistorico(){//OK
        minasPark.exibirHistorico();
    }

    public void obterTaxaDeOcupacao(){//Não esta exibindo a taxa no print
        minasPark.calcularTaxaOcupacao();
    }

    public void obterNumerTotalDeVagas(){//OK
        minasPark.obterQuantidadeVagasDisponivel();
    }

    public void obterNumeroTotalDeAutomoveis(){//OK
        minasPark.obterTotalDeAutomoveis();

    }
}
