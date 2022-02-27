package Ativ1;

import br.com.newton.linguagem.aula05.Contato;//importando a class Contato

public class Telefone {
	// atributos(características) nome de atributos minusculos:
	// atributos é padrão colocar aqui em cima, mas pode colocar em outro lugar
	String cor;
	// 3 parte
	Contato[] contato = new Contato[5];// contato do tipo da classe Contato
	String marca;

	/*
	 * public= publico, pode ser acessado pela classe principal ou outras classes.
	 * void=Como não precisa de resposta, então usa o void pra não ter retorno de
	 * resposta nem uma. Por exemplo Boolean no lugar do void.
	 */
	// metodo sempre no infinito e com letra maiuscula no inicio
	// Metodos são nossas ações, funcionalidades
	public void Ligar(Contato cont) {/* metodo(comportamento) Ligar //variavel(Cont(parametro que o metodo ta
										 recebendo) de contato) qualquer, pra o telefone ligar ele precisa do contato
										 */
		
		// pode atribuir atributo com o paramentro: mas se quisesse usar logo o parametro podia 

		// parte 7(ligar somente pro celular preto) e 8(Somente para Juliana)
		if (cor == "Preta"  && cont.nome == "Juliana") {
			System.out.println("Ligando..." + cont.nome + "\n" + cont.numero);
		}
		if (cor == "Prata" && cont.nome == "Amanda") {
			System.out.println("Ligando..." + cont.nome + "\n" + cont.numero);
		}

	}

	// parte 6(Somente tocara para a cor parata) e 9(estilo)
	public void TocarMusica(String estilo) { // parametro estilo
		if (cor == "Prata" && estilo == "Pagode") {
			System.out.println("Tocar musica do celular cor " + cor + "..." + "\nTocando " + estilo);
		} else if (cor == "Preta" && estilo == "Rock") {
			System.out.println("Tocar musica do celular cor " + cor + "..." + "\nTocando " + estilo);
		}
	}

	public void LigarParaTodos() { // em vez de ser so pra juliana

		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ligando para ->" + contato[i].nome + ":" + contato[i].numero);
		}
	}
}
