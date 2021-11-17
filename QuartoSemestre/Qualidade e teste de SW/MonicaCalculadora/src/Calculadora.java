import javax.swing.JOptionPane;


public class Calculadora {

	public static void main(String[] args) {


		Operacao operator = new Operacao();

		String opcoes = null;
		
		while(opcoes != "6") {
			
			JOptionPane.showMessageDialog(null, "Iniciando a calculadora...\nCalculadora produzida por Pedro Henrique Vieira Fernandes :D");
			
			String numRecebido1 = JOptionPane.showInputDialog("Digite o primeiro numero");
			String numRecebido2 = JOptionPane.showInputDialog("Digite o segundo numero");
			
			//Valida se o usuario não digitou nada ou deu espaços no input
			if( numRecebido1.trim().isEmpty() || numRecebido2.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "ERRO, informe um valor por favor!!!", "ERROR !", JOptionPane.ERROR_MESSAGE);
			}
			//Valida se ele digitou algum caracter especial ou alguma letra
			else if (!numRecebido1.trim().matches("\\s*([+-]?(\\d+(\\.\\d*)?|\\.\\d+)(e[+-]?\\d+|E[+-]?\\d+)?|0x[\\da-fA-F]+)\\s*") || !numRecebido2.trim().matches("\\s*([+-]?(\\d+(\\.\\d*)?|\\.\\d+)(e[+-]?\\d+|E[+-]?\\d+)?|0x[\\da-fA-F]+)\\s*") ) {   
				JOptionPane.showMessageDialog(null, "Error! Digite somente numeros", "ERROR !", JOptionPane.ERROR_MESSAGE);
			}
			//Passou dessas validações ele pode calcular
			else {
			opcoes = JOptionPane.showInputDialog(
					"Qual operação deseja realizar: 1 - Soma, 2 - Multiplicar\n3 - Subtrair, 4 - Dividir, 5 - Tirar o resto, 6 - Para finalizar o programa");
			
			
			switch(opcoes) {
			case "1":

				double numConvertido1 = Double.parseDouble(numRecebido1);

				double numConvertido2 = Double.parseDouble(numRecebido2);
				

				double result = operator.Somar(numConvertido1, numConvertido2);
				JOptionPane.showMessageDialog(null, "O resultado da soma foi " + result);
				break;
				
			case "2":

				numConvertido1 = Double.parseDouble(numRecebido1);
				numConvertido2 = Double.parseDouble(numRecebido2);

				result = operator.Multiplicar(numConvertido1, numConvertido2);
				JOptionPane.showMessageDialog(null, "O resultado da multiplicação foi: " + result);
				break;
				
			case "3":

				numConvertido1 = Double.parseDouble(numRecebido1);
				numConvertido2 = Double.parseDouble(numRecebido2);

				result = operator.Subtrair(numConvertido1, numConvertido2);
				JOptionPane.showMessageDialog(null, "O resultado da subtração foi: " + result);
				break;
			
			case "4":

				numConvertido1 = Double.parseDouble(numRecebido1);
				numConvertido2 = Double.parseDouble(numRecebido2);
				
				if(numConvertido2 == 0) {
					JOptionPane.showMessageDialog(null, "Error! Não é possivel dividir por 0", "ERROR !", JOptionPane.ERROR_MESSAGE);	
				}else if(numConvertido2 > 0 || numConvertido2 < 0) {
					
				result = operator.Dividir(numConvertido1, numConvertido2);

				JOptionPane.showMessageDialog(null, "O resultado da divisão foi: " + result);
				}
				break;
				
			case "5":

				numConvertido1 = Double.parseDouble(numRecebido1);
				numConvertido2 = Double.parseDouble(numRecebido2);

				result = operator.Resto(numConvertido1, numConvertido2);
				JOptionPane.showMessageDialog(null, "Resto da divisão foi: " + result);
				break;
				
			case "6":
				JOptionPane.showMessageDialog(null, "Obrigado por usar o nosso software\nClick em OK para sair :D");
				return;
				
				
            default:
            	JOptionPane.showMessageDialog(null, "Esta operação "+ opcoes + " não existe, por favor inserir uma opção existente");
            	
			}
		}

	}
}
}