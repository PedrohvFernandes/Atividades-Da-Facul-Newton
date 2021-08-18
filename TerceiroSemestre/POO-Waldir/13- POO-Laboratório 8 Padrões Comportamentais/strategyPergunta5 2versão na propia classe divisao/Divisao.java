package poo.u8.strategy;

import javax.swing.JOptionPane;

public class Divisao implements Strategy {

	@Override
	public int execute(int a, int b) {
		
		try {// tentativa de execução que pode lançar uma exceção
			if (b == 0) {
				// lançando uma excecao para ser tratada por um tratador especifico
				throw new ExceptionValorPorZero();
			}

		} catch(ExceptionValorPorZero ex) {// capturar as excecoes
			// exibir a mensagem na tela
			JOptionPane.showMessageDialog(null, ex.getMessage());
			return 0;
		}
		
		return a / b;
	}
	

}
