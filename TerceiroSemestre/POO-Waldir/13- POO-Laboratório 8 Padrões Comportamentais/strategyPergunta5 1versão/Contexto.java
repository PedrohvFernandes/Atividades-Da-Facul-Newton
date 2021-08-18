package poo.u8.strategy;

import javax.swing.JOptionPane;

public class Contexto {

	// 4a estratégia via interface
	private Strategy estrategia;

	public void setEstrategia(Strategy estrategia) {
		System.out.println("Setando a estratégia: " + estrategia + "\n");

		this.estrategia = estrategia;
	}

	public int executar(int a, int b) throws ExceptionValorPorZero {
		if (estrategia == null) {
			System.out.println("ERRO: estratégia não definida.");
			
			return 0;
		}if(b == 0) {
				// lançando uma excecao para ser tratada por um tratador especifico
				throw new ExceptionValorPorZero();
		}

		return estrategia.execute(a, b);
	}
}
