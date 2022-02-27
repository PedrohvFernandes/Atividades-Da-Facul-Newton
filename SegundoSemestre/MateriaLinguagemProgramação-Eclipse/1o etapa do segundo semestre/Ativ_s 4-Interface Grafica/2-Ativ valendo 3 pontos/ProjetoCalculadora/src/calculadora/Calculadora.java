package calculadora;

import javax.swing.JOptionPane;

import operacao.Operacao;

public class Calculadora {// parte 2 criar a classe calculadora e o pacote

	public static void main(String[] args) {

		// parte 5 interaзгo com o usuario:
		Operacao operator = new Operacao();// objeto. instancia usando a variavel "operator" como referencia

		JOptionPane.showMessageDialog(null, "Iniciando a calculadora...\nCalculadora produzida pela empresa Darks :D");

		String numRecebido1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String numRecebido2 = JOptionPane.showInputDialog("Digite o segundo numero");

		String opcoes = JOptionPane.showInputDialog(
				"Qual operaзгo deseja realizar: 1 - Soma, 2 - Multiplicar\n3 - Subtrair, 4 - Dividir, 5 - Tirar o resto, 6 - Para finalizar o programa");

		if (opcoes.equals("1")) {// equals(igual) a 1, com o "=" nгo esta funcionando por isso do equals

			double numConvertido1 = Double.parseDouble(numRecebido1);// o parse ele altera o tipo da variavel, um
																		// conversor de tipos, por que? porque o
																		// JOptionPane so aceita string e a soma й
																		// preciso de um tipo "Numero"
			double numConvertido2 = Double.parseDouble(numRecebido2);

			double result = operator.Somar(numConvertido1, numConvertido2);
			JOptionPane.showMessageDialog(null, "O resultado da soma foi " + result);
			// Outras maneiras:
			// JOptionPane.showInternalMessageDialog(null, "O resultado da operação foi => "
			// + operator.Somar(numero1Convertido, numero2Convertido));
			// JOptionPane.showInternalMessageDialog(null, "O resultado da operação foi => "
			// + operetor.Somar(Double.parseDouble(numeroRecebi
			// ),Double.parseDouble(numeroRecebido2)));
		} else if (opcoes.equals("2")) {

			double numConvertido1 = Double.parseDouble(numRecebido1);
			double numConvertido2 = Double.parseDouble(numRecebido2);

			double result = operator.Multiplicar(numConvertido1, numConvertido2);
			JOptionPane.showMessageDialog(null, "O resultado da multiplicaзгo й " + result);
		} else if (opcoes.equals("3")) {

			double numConvertido1 = Double.parseDouble(numRecebido1);
			double numConvertido2 = Double.parseDouble(numRecebido2);

			double result = operator.Subtrair(numConvertido1, numConvertido2);
			JOptionPane.showMessageDialog(null, "O resultado da subtraзгo й " + result);
		} else if (opcoes.equals("4")) {

			double numConvertido1 = Double.parseDouble(numRecebido1);
			double numConvertido2 = Double.parseDouble(numRecebido2);

			double result = operator.Dividir(numConvertido1, numConvertido2);

			JOptionPane.showMessageDialog(null, "O resultado da divisгo й " + result);
		} else if (opcoes.equals("5")) {

			double numConvertido1 = Double.parseDouble(numRecebido1);
			double numConvertido2 = Double.parseDouble(numRecebido2);

			double result = operator.Resto(numConvertido1, numConvertido2);
			JOptionPane.showMessageDialog(null, "Resto da divisгo" + result);

		} else if (opcoes.equals("6")) {

		} else {
			JOptionPane.showMessageDialog(null, "Estб opзгo nгo existe, por favor inserir uma opзгo existente");
		}
		JOptionPane.showMessageDialog(null, "Obrigado por usar o nosso software\nClick em OK para sair :D");

	}

}
