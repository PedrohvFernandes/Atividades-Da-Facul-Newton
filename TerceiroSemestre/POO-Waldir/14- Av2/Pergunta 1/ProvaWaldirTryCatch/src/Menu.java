import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		var usuario = new Usuario();

		while (true) {

			try {

				var nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome: ");
				var idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
				var mesDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu mes de nascimento: "));
				var anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));

				usuario.criarUmUsuario(nomeCompleto, idade, mesDeNascimento, anoDeNascimento);

				JOptionPane.showMessageDialog(null, "Usuario criado com sucesso: Nome: " + usuario.getNomeCompleto() + " Idade: "
						+ usuario.getIdade() + " Mes de nascimento: " + usuario.getMesDeNascimento() + " Ano de nascimento: " + usuario.getAnoDeNascimento());

			} catch (NomeCompletoVazioExceptionException ex) {

				JOptionPane.showMessageDialog(null, ex.getMessage());

			} catch (IdadeInvalidaException ex2) {

				JOptionPane.showMessageDialog(null, ex2.getMessage());

			} catch (MesDeNascimentoInvalidoException ex3) {

				JOptionPane.showMessageDialog(null, ex3.getMessage());
			} catch (AnoDeNascimentoInvalidoException ex4) {

				JOptionPane.showMessageDialog(null, ex4.getMessage());
			} catch(NullPointerException ex5) {
				
				JOptionPane.showMessageDialog(null, "O nome esta nullo");
			}
		}
	}
}
