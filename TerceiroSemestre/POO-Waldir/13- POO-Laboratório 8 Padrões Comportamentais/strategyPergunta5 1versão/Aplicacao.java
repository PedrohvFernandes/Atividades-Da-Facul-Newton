package poo.u8.strategy;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) throws ExceptionValorPorZero {
		var contexto = new Contexto();

		while (true) {

			int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1o número:"));
			int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2o número:"));

			var acao = JOptionPane.showInputDialog(null, "Selecione a ação (+, -, *, /, -1)");

			// 1 define estratégia de execução
			switch (acao) {
				case "+":
					contexto.setEstrategia(new Soma());
					break;
				case "-":
					contexto.setEstrategia(new Subtracao());
					break;
				case "*":
					contexto.setEstrategia(new Multiplicacao());
					break;
				case "/":
					contexto.setEstrategia(new Divisao());
					break;
				case "-1":
					System.exit(0); // saindo do sistema
					break;
			}

			try {// tentativa de execução que pode lançar uma exceção

				// Executando a estrategia definida
				var resultado = contexto.executar(a, b);

				System.out.println("Resultado: " + resultado);

				JOptionPane.showInternalMessageDialog(null, "Resultado: " + resultado);

			} catch (ExceptionValorPorZero ex) {// capturar as excecoes
				// exibir a mensagem na tela
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		}
	}
}
