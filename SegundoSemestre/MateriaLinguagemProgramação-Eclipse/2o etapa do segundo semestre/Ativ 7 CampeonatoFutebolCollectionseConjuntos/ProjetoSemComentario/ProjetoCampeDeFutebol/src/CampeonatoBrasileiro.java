import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import javax.swing.JOptionPane;

public class CampeonatoBrasileiro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Time Atletico_MineroMap = new Time();
		Atletico_MineroMap.nome = "Atletico Mineiro";
		Atletico_MineroMap.cor = "Preto e Branco";

		Time CruzeiroMap = new Time();
		CruzeiroMap.nome = "Cruzeiro";
		CruzeiroMap.cor = "Azul e Branco";

		Time FluminenseMap = new Time();
		FluminenseMap.nome = "Fluminense";
		FluminenseMap.cor = "Verde e Vermelho";

		Time CoritibaMap = new Time();
		CoritibaMap.nome = "Coritiba";
		CoritibaMap.cor = "Verde e Branco";

		Time SantosMap = new Time();
		SantosMap.nome = "Santos";
		SantosMap.cor = "Preto e Branco";

		Time EC_VitoriaMap = new Time();
		EC_VitoriaMap.nome = "EC_Vitoria";
		EC_VitoriaMap.cor = "Preto e Vermelho";

		Time Sao_PauloMap = new Time();
		Sao_PauloMap.nome = "São Paulo";
		Sao_PauloMap.cor = "Preto, Vermelho e Branco";

		Time CorinthiansMap = new Time();
		CorinthiansMap.nome = "Corinthians";
		CorinthiansMap.cor = "Preto e Branco";

		Time BotafogoMap = new Time();
		BotafogoMap.nome = "Botafogo";
		BotafogoMap.cor = "Preto e Branco";

		Time CearaMap = new Time();
		CearaMap.nome = "Ceará";
		CearaMap.cor = "Peeto e Branco";

		Estado e1 = new Estado();
		e1.nome = "MG";
		Estado e2 = new Estado();
		e2.nome = "RJ";
		Estado e3 = new Estado();
		e3.nome = "PR";
		Estado e4 = new Estado();
		e4.nome = "SP";
		Estado e5 = new Estado();
		e5.nome = "ES";
		Estado e6 = new Estado();
		e6.nome = "CE";

		Map<Time, Estado> timesEstadosMap = new HashMap<>();

		timesEstadosMap.put(Atletico_MineroMap, e1);
		timesEstadosMap.put(CruzeiroMap, e1);
		timesEstadosMap.put(FluminenseMap, e2);
		timesEstadosMap.put(CoritibaMap, e3);
		timesEstadosMap.put(SantosMap, e4);
		timesEstadosMap.put(EC_VitoriaMap, e5);
		timesEstadosMap.put(Sao_PauloMap, e4);
		timesEstadosMap.put(CorinthiansMap, e4);
		timesEstadosMap.put(BotafogoMap, e2);
		timesEstadosMap.put(CearaMap, e6);

		System.out.println(
				"Lista do tipo map com os times e estados de cada time registrado na tabela implementado com o Switch:");
		System.out.println("Informe a sigla do estado do seu time ou Digite 'Sair' para fechar o programa :D ");
		String nomeEstados = "a";

		while (!"Sair".equalsIgnoreCase(nomeEstados)) {
			nomeEstados = input.nextLine();
			if (!"Sair".equalsIgnoreCase(nomeEstados)) {
				switch (nomeEstados) {

				case "MG":
					System.out.println("\nSeu time é: " + Atletico_MineroMap.nome + " | Possuindo as cores: "
							+ Atletico_MineroMap.cor + "\nOu " + CruzeiroMap.nome + " | Possuindo as cores: "
							+ CruzeiroMap.cor + "\nO estado dos dois é: " + e1.nome);
					System.out.println("Qual é o seu time? ");
					nomeEstados = input.nextLine();
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "RJ":
					System.out.println("\nSeu time é: " + FluminenseMap.nome + " | Possuindo as cores: "
							+ FluminenseMap.cor + "\nOu " + BotafogoMap.nome + " | Possuindo as cores: "
							+ BotafogoMap.cor + "\nO estado dos dois é: " + e2.nome);
					System.out.println("\nQual é o seu time? ");
					nomeEstados = input.nextLine();
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "PR":
					System.out.println("\nSeu time é: " + CoritibaMap.nome + " | Possuindo as cores: " + CoritibaMap.cor
							+ "\nO estado desse time é: " + e3.nome);
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "SP":
					System.out.println("\nSeu time é: " + SantosMap.nome + " | Possuindo as cores: " + SantosMap.cor
							+ "\nOu " + Sao_PauloMap.nome + " | Possuindo as cores: " + Sao_PauloMap.cor + "\nOu "
							+ CorinthiansMap.nome + " | Possuindo as cores: " + CorinthiansMap.cor
							+ "\nO estado dos três é: " + e4.nome);
					System.out.println("\nQual é o seu time? ");
					nomeEstados = input.nextLine();
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "BA":
					System.out.println("\nSeu time é: " + EC_VitoriaMap.nome + " | Possuindo as cores: "
							+ EC_VitoriaMap.cor + "\nO estado desse time é: " + e5.nome);
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				case "CE":
					System.out.println("\nSeu time é: " + CearaMap.nome + " | Possuindo as cores: " + CearaMap.cor
							+ "\nO estado desse time é: " + e6.nome);
					System.out.println("Vaiiiiiiiii com tudoooooooo " + nomeEstados + "\n");
					System.out.println(
							"Digite 'Sair' caso queira fechar o programa ou Apenas continue informando a sigla do estado de outro time: ");
					break;

				default:
					System.out.println("\nNão possui time com esse estado, informe outro estado, que não seja o mesmo: "
							+ nomeEstados + "\nOu digite 'Sair' para fechar o programa");
				}
			}
			if (nomeEstados.equalsIgnoreCase("Sair")) {
				System.out.println("\nFechando o Switch...");
			}
		}

		System.out.println("\nEntrando no modo JOptionPane...\n");

		List<String> colocacaoTimesList = new ArrayList<String>();

		Time Atletico_MineiroList = new Time();
		Atletico_MineiroList.nome = "Atletico Mineiro";
		Atletico_MineiroList.colocacao = 1;
		colocacaoTimesList.add(Atletico_MineiroList.nome + Atletico_MineiroList.colocacao);

		Time CruzeiroList = new Time();
		CruzeiroList.nome = "Cruzeiro";
		CruzeiroList.colocacao = 2;
		colocacaoTimesList.add(CruzeiroList.nome + CruzeiroList.colocacao);

		Time FluminenseList = new Time();
		FluminenseList.nome = "Fluminense";
		FluminenseList.colocacao = 3;
		colocacaoTimesList.add(FluminenseList.nome + FluminenseList.colocacao);

		Time CoritibaList = new Time();
		CoritibaList.nome = "Coritiba";
		CoritibaList.colocacao = 4;
		colocacaoTimesList.add(CoritibaList.nome + CoritibaList.colocacao);

		Time SantosList = new Time();
		SantosList.nome = "Santos";
		SantosList.colocacao = 5;
		colocacaoTimesList.add(SantosList.nome + SantosList.colocacao);

		Time EC_VitoriaList = new Time();
		EC_VitoriaList.nome = "EC Vitória";
		EC_VitoriaList.colocacao = 6;
		colocacaoTimesList.add(EC_VitoriaList.nome + EC_VitoriaList.colocacao);

		Time Sao_PauloList = new Time();
		Sao_PauloList.nome = "São Paulo";
		Sao_PauloList.colocacao = 7;
		colocacaoTimesList.add(SantosList.nome + Sao_PauloList.colocacao);

		Time CorinthiansList = new Time();
		CorinthiansList.nome = "Corinthians";
		CorinthiansList.colocacao = 8;
		colocacaoTimesList.add(CorinthiansList.nome + CorinthiansList.colocacao);

		Time BotafogoList = new Time();
		BotafogoList.nome = "Botafogo";
		BotafogoList.colocacao = 9;
		colocacaoTimesList.add(BotafogoList.nome + BotafogoList.colocacao);

		Time CearaList = new Time();
		CearaList.nome = "Ceará";
		CearaList.colocacao = 10;

		String digitaTime = JOptionPane.showInputDialog("Qual é o seu time do coração: \n" + Atletico_MineiroList.nome
				+ " - MG\n" + CruzeiroList.nome + " - MG\n" + FluminenseList.nome + " - RJ\n" + CoritibaList.nome
				+ " - PR\n" + SantosList.nome + " - SP\n" + EC_VitoriaList.nome + " - ES\n" + Sao_PauloList.nome
				+ " - SP\n" + CorinthiansList.nome + " - SP\n" + BotafogoList.nome + " - RJ\n" + CearaList.nome
				+ " - CE\n");

		if (digitaTime.equalsIgnoreCase("Atletico Mineiro")) {
			colocacaoTimesList.get(0);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + Atletico_MineiroList.nome
					+ " esta na colocação: " + Atletico_MineiroList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Cruzeiro")) {
			colocacaoTimesList.get(1);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + CruzeiroList.nome + " esta na colocação: "
					+ CruzeiroList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Fluminense")) {
			colocacaoTimesList.get(2);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + FluminenseList.nome + " esta na colocação: "
					+ FluminenseList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Coritiba")) {
			colocacaoTimesList.get(3);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + CoritibaList.nome + " esta na colocação: "
					+ CoritibaList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Santos")) {
			colocacaoTimesList.get(4);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + SantosList.nome + " esta na colocação: "
					+ SantosList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("EC Vitória")) {
			colocacaoTimesList.get(5);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + EC_VitoriaList.nome + " esta na colocação: "
					+ EC_VitoriaList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("São Paulo")) {
			colocacaoTimesList.get(6);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + Sao_PauloList.nome + " esta na colocação: "
					+ Sao_PauloList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Corinthians")) {
			colocacaoTimesList.get(7);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + CorinthiansList.nome + " esta na colocação: "
					+ CorinthiansList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Botafogo")) {
			colocacaoTimesList.get(8);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + BotafogoList.nome + " esta na colocação: "
					+ BotafogoList.colocacao + "° lugar da tabela");
		} else if (digitaTime.equalsIgnoreCase("Ceará")) {
			colocacaoTimesList.get(9);
			JOptionPane.showMessageDialog(null, "O seu time de coração " + CearaList.nome + " esta na colocação: "
					+ CearaList.colocacao + "° lugar da tabela");
		}
		else {
			JOptionPane.showMessageDialog(null, "Time não participando do Brasileirão!!!");
		}
		JOptionPane.showMessageDialog(null, "Obrigado por usar o nosso software\nClick em OK para sair :D");

		// 4.4) Criar uma coleção de torcedores -> Utilizar a interface List ->
		// Implementação ArrayList
		List colecaoTorcedorList = new ArrayList();

		// Incluir 5 torcedores
		Torcedor pedroTorcedor = new Torcedor();
		pedroTorcedor.nome = "Pedro";
		pedroTorcedor.idade = 18;
		colecaoTorcedorList.add(pedroTorcedor);

		Torcedor rodrigoTorcedor = new Torcedor();
		rodrigoTorcedor.nome = "Rodrigo";
		rodrigoTorcedor.idade = 24;
		colecaoTorcedorList.add(rodrigoTorcedor);

		Torcedor josueTorcedor = new Torcedor();
		josueTorcedor.nome = "Josue";
		josueTorcedor.idade = 18;
		colecaoTorcedorList.add(josueTorcedor);

		Torcedor samuelTorcedor = new Torcedor();
		samuelTorcedor.nome = "Samuel";
		samuelTorcedor.idade = 19;
		colecaoTorcedorList.add(samuelTorcedor);

		Torcedor rafaelaTorcedor = new Torcedor();
		rafaelaTorcedor.nome = "Rafaela";
		rafaelaTorcedor.idade = 30;
		colecaoTorcedorList.add(rafaelaTorcedor);

		// Incluir dois times para cada torcedor e Imprimir na tela os torcedores que
		// torcem pelo time Santos
		
		//outra maneira para incluir os dois times para cada Torcedor:
		
		//tirando a lista set torcedor do metodo timeSet é possivel puxar ela em outra classe, com isso é so passar o time em forma de objeto para a lista.
		//Time santos = new time();
		//santos.nome = "Santos";
		//pedroTorcedor.timesTorcedorSet.add(Atletico_MineiroList.nome ou CorinthiansMap.nome ou atleticoMineiroSet.nome ou santos.nome);
		
		System.out.println(
				"Lista tipo list(Os torcedores) e lista tipo set(Lista na classe Torcedores dos times) com o pessoal que torce para o Corinthians\n");
		System.out.println("Torcedores que torce para o Santos:");
		System.out.println("O " + pedroTorcedor.nome + " tem " + pedroTorcedor.idade + " anos e torce para o time: "
				+ pedroTorcedor.timeSet("Santos") + " e " + pedroTorcedor.timeSet("Atletico Mineiro") + "\n");
		System.out.println("O " + rodrigoTorcedor.nome + " tem " + rodrigoTorcedor.idade + " anos e torce para o time: "
				+ rodrigoTorcedor.timeSet("Santos") + " e " + rodrigoTorcedor.timeSet("Ceara") + "\n");

		// Imprimir na tela os torcedores que não torcem pelo time Santos
		System.out.println("Torcedores que não torce para o Santos:");
		System.out.println("O " + josueTorcedor.nome + " tem " + josueTorcedor.idade + " anos e torce para o time: "
				+ josueTorcedor.timeSet("Cruzeiro") + " e " + josueTorcedor.timeSet("Coritiba") + "\n");
		System.out.println("O " + samuelTorcedor.nome + " tem " + samuelTorcedor.idade + " anos e torce para o time: "
				+ samuelTorcedor.timeSet("Corinthians") + " e " + samuelTorcedor.timeSet("EC Vitoria") + "\n");
		System.out.println("A " + rafaelaTorcedor.nome + " tem " + rafaelaTorcedor.idade + " anos e torce para o time: "
				+ rafaelaTorcedor.timeSet("Fluminense") + " e " + pedroTorcedor.timeSet("Corinthians") + "\n");

		// Retirar da lista os torcedores que torcem para o Corinthians
		System.out.println("Lista tipo list dos torcedores sem o pessoal que torce para o Corinthians: ");
		colecaoTorcedorList.remove(samuelTorcedor);
		colecaoTorcedorList.remove(rafaelaTorcedor);

		// Imprimir na tela os torcedores que não torcem para o Corinthians
		for (int i = 0; i < colecaoTorcedorList.size(); i++) {

			Torcedor aux = (Torcedor) colecaoTorcedorList.get(i);

			System.out.println(
					aux.nome + " tem " + aux.idade + " anos e não torce para o " + aux.timeSet("Corinthians\n"));
		}

		Set<String> colecaoTimesSet = new HashSet<>();

		Time atleticoMineiroSet = new Time();
		atleticoMineiroSet.nome = "Atlético Mineiro";
		colecaoTimesSet.add(atleticoMineiroSet.nome);

		Time cruzeiroSet = new Time();
		cruzeiroSet.nome = "Cruzeiro";
		colecaoTimesSet.add(cruzeiroSet.nome);

		Time fluminenseSet = new Time();
		fluminenseSet.nome = "Fluminense";
		colecaoTimesSet.add(fluminenseSet.nome);

		Time coritibaSet = new Time();
		coritibaSet.nome = "Coritiba";
		colecaoTimesSet.add(coritibaSet.nome);

		Time santosSet = new Time();
		santosSet.nome = "Santos";
		colecaoTimesSet.add(santosSet.nome);

		System.out.println("Lista do tipo set dos times sem remover o ultimo da colocação: \n");
		Iterator<String> auxTimes = colecaoTimesSet.iterator();
		while (auxTimes.hasNext()) {
			String time = auxTimes.next();
			System.out.println(time);
			System.out.println("");
		}
		atleticoMineiroSet.ganhar(35);
		atleticoMineiroSet.perder(1);
		atleticoMineiroSet.empatar(2);

		cruzeiroSet.ganhar(0);
		cruzeiroSet.perder(1);
		cruzeiroSet.empatar(17);

		fluminenseSet.ganhar(25);
		fluminenseSet.perder(6);
		fluminenseSet.empatar(0);

		coritibaSet.ganhar(13);
		coritibaSet.perder(2);
		coritibaSet.empatar(12);

		santosSet.ganhar(13);
		santosSet.perder(0);
		santosSet.empatar(4);

		System.out.println("Colocação da lista do tipo set dos times: \n");
		atleticoMineiroSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + atleticoMineiroSet.ganhar(0));
		System.out.println("");

		cruzeiroSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + cruzeiroSet.ganhar(0));
		System.out.println("");

		fluminenseSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + fluminenseSet.ganhar(0));
		System.out.println("");

		coritibaSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + coritibaSet.ganhar(0));
		System.out.println("");

		santosSet.colocacao();
		System.out.println("Tendo como pontos ganhos: partidas ganhas e empates: " + santosSet.ganhar(0));

		colecaoTimesSet.remove(cruzeiroSet.nome);
		colecaoTimesSet.remove(santosSet.nome);

		System.out.println("\nLista do tipo set dos times sem o ultimo da colocação: \n");
		auxTimes = colecaoTimesSet.iterator();
		while (auxTimes.hasNext()) {
			String time = auxTimes.next();
			System.out.println(time);
			System.out.println("");
		}

	}

}