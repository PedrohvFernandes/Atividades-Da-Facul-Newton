import javax.swing.JOptionPane;//JOptionPane é uma classe que possibilita a criação de uma caixa de dialogo padrão que ou solicita um valor para o usuário ou retorna uma informação.Com alguns metodos e parametros
//Swing é uma biblioteca
//JOptionPane so entende Strings, é preciso converter para entender outros tipos de dados.

public class SaidaNomeJOptionPane {

	public static void main(String[] args) {

		// Usando recursos do JOptionPane
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String sobreNome = JOptionPane.showInputDialog("Digite o seu sobre nome: ");
//showInputDialog ele recebe o que eu digitar Igual o Scanner, so que em forma de tela

		JOptionPane.showInternalMessageDialog(null, "Nome completo -> " + nome + " " + sobreNome);
//showInternalMessageDialog ele mostra o que foi digitado pelo o usuario em forma de tela.
		// null --> um tipo de dado, mas pra que serve ? é um parametro que determina o
		// Quadro no qual o diálogo é exibido; se nulo, ou se o parentComponent não tem
		// nenhum quadro, um quadro padrão é usado para enviar a mensagem do objeto

		JOptionPane.showConfirmDialog(null, "Deseja realmente seguir?");
		// showConfirmDialog para confirma algo...
	}

}
