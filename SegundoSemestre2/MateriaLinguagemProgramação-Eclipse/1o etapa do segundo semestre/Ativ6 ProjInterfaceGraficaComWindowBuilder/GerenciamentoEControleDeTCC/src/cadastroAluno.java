import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;

public class cadastroAluno {

	private JFrame frmCadastroDoAluno;
	private JTextField txtNomeAluno;
	private JTextField txtEnderecoAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroAluno window = new cadastroAluno();
					window.frmCadastroDoAluno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public cadastroAluno() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmCadastroDoAluno = new JFrame();
		frmCadastroDoAluno.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\Desktop\\Icones\\Aluno.jpg"));
		frmCadastroDoAluno.setTitle("Cadastro do Aluno");
		frmCadastroDoAluno.setBounds(100, 100, 474, 347);
		frmCadastroDoAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDoAluno.getContentPane().setLayout(null);
		frmCadastroDoAluno.setVisible(true);
		JLabel nomeAluno = new JLabel("Nome do Aluno(a):");
		nomeAluno.setBounds(38, 48, 114, 16);
		frmCadastroDoAluno.getContentPane().add(nomeAluno);
		
		JComboBox opcoesCurso = new JComboBox();
		opcoesCurso.setBounds(79, 86, 163, 22);
		opcoesCurso.addItem("Selecione o Curso");
		opcoesCurso.addItem("Curso 1");
		opcoesCurso.addItem("Curso 2");
		opcoesCurso.addItem("Curso 3");
		frmCadastroDoAluno.getContentPane().add(opcoesCurso);
		
		JLabel cursoDoAluno = new JLabel("Curso:");
		cursoDoAluno.setBounds(38, 89, 56, 16);
		frmCadastroDoAluno.getContentPane().add(cursoDoAluno);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(151, 45, 245, 22);
		frmCadastroDoAluno.getContentPane().add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
		
		JLabel endereco = new JLabel("Endere\u00E7o:");
		endereco.setBounds(38, 131, 114, 16);
		frmCadastroDoAluno.getContentPane().add(endereco);
		
		JLabel telefone = new JLabel("Telefone:");
		telefone.setBounds(38, 169, 114, 16);
		frmCadastroDoAluno.getContentPane().add(telefone);
		
		txtEnderecoAluno = new JTextField();
		txtEnderecoAluno.setBounds(100, 128, 230, 22);
		frmCadastroDoAluno.getContentPane().add(txtEnderecoAluno);
		txtEnderecoAluno.setColumns(10);
		
		JFormattedTextField txtTelefoneAluno = new JFormattedTextField(new MaskFormatter("(##)####-####"));
		txtTelefoneAluno.setColumns(10);
		txtTelefoneAluno.setBounds(100, 166, 230, 22);
		frmCadastroDoAluno.getContentPane().add(txtTelefoneAluno);
		
		JLabel celularAluno = new JLabel("Celular:");
		celularAluno.setBounds(38, 207, 114, 16);
		frmCadastroDoAluno.getContentPane().add(celularAluno);
		
		JFormattedTextField txtCelularAluno = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		txtCelularAluno.setColumns(10);
		txtCelularAluno.setBounds(86, 204, 230, 22);
		frmCadastroDoAluno.getContentPane().add(txtCelularAluno);
		
		JLabel tituloCadAluno = new JLabel("Cadastro - Aluno");
		tituloCadAluno.setHorizontalAlignment(SwingConstants.CENTER);
		tituloCadAluno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		tituloCadAluno.setBounds(133, -26, 197, 90);
		frmCadastroDoAluno.getContentPane().add(tituloCadAluno);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNomeAluno.setText("");
				txtEnderecoAluno.setText("");
				txtTelefoneAluno.setText("");
				txtCelularAluno.setText("");
				opcoesCurso.setSelectedIndex(0);
			}
		});{
		limpar.setBounds(110, 262, 97, 25);
		frmCadastroDoAluno.getContentPane().add(limpar);
		}
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(269, 262, 97, 25);
		frmCadastroDoAluno.getContentPane().add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!", "Cadastro do aluno", JOptionPane.INFORMATION_MESSAGE);
			}

		});
	}

	public void setVisible(boolean b) {
		return;
		
	}

}
