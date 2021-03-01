package NewtonPaivaU2;

import java.util.Arrays;

public class Principal {// classe principal que vai rodar o nosso codigo.

	public static void main(String[] args) {
		
		// criar um novo objeto de TAD vetor
		var tadVetor = new TadVetor(10);//alocando 10 na memoria entrando no metodo TadVetor 
		
		//imprimir as informações(estado) de Tad vetor
		tadVetor.imprimir();// puxando o metodo do TadVetor para a class principal
		
		for (int i = 0; i < 12; i++) {
			tadVetor.inserir(i+1);
			tadVetor.imprimir();
			System.out.println("\n\n");
		}
		
	}

}
