import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class SistemaDeGerenciamentoeControledeTCC {

	private JFrame frmSistemaAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaDeGerenciamentoeControledeTCC window = new SistemaDeGerenciamentoeControledeTCC();
					window.frmSistemaAluno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SistemaDeGerenciamentoeControledeTCC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*
	 * Nome:Pedro Henrique Vieira Fernandes RA:12108683
		Grupo:
		Josué Martins Beda Silva->12108550
		
		Pedro Henrique Vieira Fernandes(EU)->12108683
		
		Rodrigo Augusto Girodo Andrade->12108096
		
		Samuel Marques Abreu Pereira->12106775
		
		Estou enviando via Rar o codigo e junto com ele estou enviando a pasta de icones
		que eu utilizei

	 */
	private void initialize() {
		frmSistemaAluno = new JFrame();
		frmSistemaAluno.setTitle("Sistema de Gerenciamento e Controle de TCC");
		frmSistemaAluno.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\Desktop\\Icones\\Sistema.png"));
		frmSistemaAluno.setBounds(100, 100, 450, 300);
		frmSistemaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		frmSistemaAluno.setJMenuBar(menuBar);
		
		JMenu cadastro = new JMenu("Cadastro");
		menuBar.add(cadastro);
		
		JMenuItem aluno = new JMenuItem("Aluno");
		aluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					cadastroAluno cadAluno = new cadastroAluno();
					cadAluno.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
				
			}
		});
		cadastro.add(aluno);
		
		
		JMenuItem curso = new JMenuItem("Curso");
		curso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastroCurso cadCurso = new cadastroCurso();
				cadCurso.setVisible(true);
				
			}
		});
		cadastro.add(curso);
	
		JMenuItem tcc = new JMenuItem("TCC");
		cadastro.add(tcc);
		tcc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "A funcionalida TCC está em desenvolvimento ainda, favor aguardar..." ,"ABA EM DESENVOLVIMENTO", JOptionPane.WARNING_MESSAGE);
			}

		});
		
		JMenu menuGestao = new JMenu("Gestão");
		menuBar.add(menuGestao);
		
		JMenuItem gestaoTCC = new JMenuItem("Gestão de TCC");
		gestaoTCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					GestaoTCC gestaoTcc = new GestaoTCC();
					gestaoTcc.setVisble(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		menuGestao.add(gestaoTCC);
		
		JMenu relatorios = new JMenu("Relatorios");
		menuBar.add(relatorios);
		
		JMenuItem tccEntregue = new JMenuItem("TCC entregues");
		relatorios.add(tccEntregue);
		tccEntregue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Os trabalhos da data 25/10/2020 foram entregues!", "TCC ENTREGUES", JOptionPane.INFORMATION_MESSAGE);
			}

		});
		
		JMenuItem tccAtrasado = new JMenuItem("TCC atrasados");
		relatorios.add(tccAtrasado);
		tccAtrasado.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Os trabalhos dos aluno(a)s Aluno(a) 1 e Aluno(a) 2 estão atrasados!", "TCC ATRASADOS", JOptionPane.WARNING_MESSAGE);
			}

		});
		
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		frmSistemaAluno.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empresa DARKS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(135, 0, 199, 56);
		frmSistemaAluno.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de Gerenciamento e controle");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(101, -40, 256, 189);
		frmSistemaAluno.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Dell\\Desktop\\Icones\\Sistema escolar2.png"));
		lblNewLabel_2.setBounds(163, 107, 108, 120);
		frmSistemaAluno.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("De");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(200, 13, 180, 137);
		frmSistemaAluno.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TCC");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(200, 38, 180, 137);
		frmSistemaAluno.getContentPane().add(lblNewLabel_1_1_1);
	}

	protected static void add(cadastroAluno cadAluno) {
		// TODO Auto-generated method stub
		
	}
	
}
