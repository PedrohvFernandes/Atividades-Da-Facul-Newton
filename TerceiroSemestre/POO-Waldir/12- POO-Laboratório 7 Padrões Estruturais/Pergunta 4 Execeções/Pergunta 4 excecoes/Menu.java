import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		var conta1 = new ContaBancaria(200, "3- cancelada");

		while (true) {
			
			try { // tentativa de execução que pode lançar uma exceção

				var valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para saque: "));
				// tentar efetuar o saque
				conta1.efetuarSaque(valor);

				JOptionPane.showMessageDialog(null,
						"Saque efetuado com sucesso: " + valor + "\nSaldo: " + conta1.getSaldo());

			} catch (ValorSaqueInvalidoException ex) { // capturar as excecoes
				// exibir a mensagem na tela
				JOptionPane.showMessageDialog(null, ex.getMessage());
			} 
			catch (SaldoIndisponivelException ex2) {
				JOptionPane.showMessageDialog(null, ex2.getMessage());
			}
			catch (EstadoDaContaInvalidaException ex3) {
				JOptionPane.showMessageDialog(null, ex3.getMessage());
			}
			finally {
				// encerra qualquer operação realizada no bloco try
				System.out.println("Sempre executa");
				conta1.incrementarContadorOperacoes();
			}
		}
	}
}
