import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class cadastroCurso {

	private JFrame frmCadastroDoCurso;
	private JTextField txtNome;
	private JTextField textDuracao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroCurso window = new cadastroCurso();
					window.frmCadastroDoCurso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cadastroCurso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDoCurso = new JFrame();
		frmCadastroDoCurso.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\Desktop\\Icones\\Curso.png"));
		frmCadastroDoCurso.setTitle("Cadastro do Curso");
		frmCadastroDoCurso.setBounds(100, 100, 450, 300);
		frmCadastroDoCurso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDoCurso.getContentPane().setLayout(null);
		frmCadastroDoCurso.setVisible(true);
		
		JLabel lblCadastroCurso = new JLabel("Cadastro - Curso");
		lblCadastroCurso.setBounds(0, 0, 432, 34);
		lblCadastroCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroCurso.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		frmCadastroDoCurso.getContentPane().add(lblCadastroCurso);
		
		JLabel nomeCurso = new JLabel("Nome");
		nomeCurso.setBounds(35, 64, 56, 16);
		frmCadastroDoCurso.getContentPane().add(nomeCurso);
		
		JLabel duraçãoCurso = new JLabel("Dura\u00E7\u00E3o:");
		duraçãoCurso.setBounds(35, 109, 56, 16);
		frmCadastroDoCurso.getContentPane().add(duraçãoCurso);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				textDuracao.setText("");
			}
		});{
		limpar.setBounds(106, 215, 97, 25);
		frmCadastroDoCurso.getContentPane().add(limpar);
		}
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(254, 215, 97, 25);
		frmCadastroDoCurso.getContentPane().add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!", "Cadastro do Curso", JOptionPane.INFORMATION_MESSAGE);
			}
		});
			
		txtNome = new JTextField();
		txtNome.setText("");
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNome.setColumns(10);
		txtNome.setBounds(80, 61, 167, 22);
		frmCadastroDoCurso.getContentPane().add(txtNome);
		
		textDuracao = new JTextField();
		textDuracao.setText("");
		textDuracao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textDuracao.setColumns(10);
		textDuracao.setBounds(93, 106, 167, 22);
		frmCadastroDoCurso.getContentPane().add(textDuracao);
	}

	public void setVisible(boolean b) {
		return;
	
	}
}

