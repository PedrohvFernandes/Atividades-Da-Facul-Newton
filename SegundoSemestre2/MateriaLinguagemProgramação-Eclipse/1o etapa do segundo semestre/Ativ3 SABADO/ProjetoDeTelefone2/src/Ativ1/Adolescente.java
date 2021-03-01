package Ativ1;

import br.com.newton.linguagem.aula05.Contato;

public class Adolescente {

	public static void main(String[] args) {
		// objetos tel 1 e tel 2:
		Telefone tel1 = new Telefone();
		Telefone tel2 = new Telefone();

		// caracteristicas
		tel1.marca = "YPhone";
		tel1.cor = "Prata";

		// 4 parte: passando os contatos para vetor contato que esta sendo definido pelo
		// tipo
		// Contato(classe)
		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.numero = "31989878547";
		tel1.contato[0] = contato1;

		Contato contato2 = new Contato();
		contato2.nome = "Pedro";
		contato2.numero = "31989873030";
		tel1.contato[1] = contato2;

		Contato contato3 = new Contato();
		contato3.nome = "Maria";
		contato3.numero = "31989871010";
		tel1.contato[2] = contato3;

		Contato contato4 = new Contato();
		contato4.nome = "Carla";
		contato4.numero = "31989870202";
		tel1.contato[3] = contato4;

		Contato contato5 = new Contato();
		contato5.nome = "Amanda";
		contato5.numero = "31989871568";
		tel1.contato[4] = contato5;
		tel1.Ligar(contato5);

		tel2.marca = "S10";
		tel2.cor = "Preta";

		// 5 parte
		// lembrando que variavel é so uma referencia.
		// exemplo: contatoCarmen usar os nomes especificos das pessoas nas variaveis ou
		// usar o "Contato contato = new Contato();" e usar somente contato pra definer os
		// contatos, tendo o beneficio de limpar por conta do "new"
		
		//usando uma variavel ja definida
		contato1 = new Contato();// pra limpar
		contato1.nome = "Carmen";
		contato1.numero = "31989871147";
		tel2.contato[0] = contato1;

		contato2 = new Contato();
		contato2.nome = "Juliana";
		contato2.numero = "31933373030";
		tel2.contato[1] = contato2;
		tel2.Ligar(contato2);// Parte 7

		// outra maneira de aloca os contatos "Contato contato = new Contato();"
		Contato contato = new Contato();
		contato.nome = "Augusto";
		contato.numero = "31544871010";
		tel2.contato[2] = contato;

		contato = new Contato();
		contato.nome = "Felipe";
		contato.numero = "31454870202";
		tel2.contato[3] = contato;

		contato = new Contato();
		contato.nome = "Caio";
		contato.numero = "31658871568";
		tel2.contato[4] = contato;

		// parte 6
		/*
		 * primeiro forma de implementar: so vai tocar se ele for prata if(tel1.cor ==
		 * "Prata") tel1.TocarMusica();
		 * 
		 * if(tel2.cor == "Prata") tel2.TocarMusica();
		 */
		// segunda maneira seria colocar a responsabilidade para o metodo parte 6 e
		// 9(Estilo)
		tel1.TocarMusica("Pagode");
		tel2.TocarMusica("Rock");
		System.out.println("");
		tel1.LigarParaTodos();
		System.out.println("");
		tel2.LigarParaTodos();
	}

}
