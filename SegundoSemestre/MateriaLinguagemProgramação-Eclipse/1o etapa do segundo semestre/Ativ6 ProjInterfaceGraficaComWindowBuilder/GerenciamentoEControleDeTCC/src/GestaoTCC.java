import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import java.awt.List;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoTCC {

	private JFrame frmGestoTcc;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestaoTCC window = new GestaoTCC();
					window.frmGestoTcc.setVisible(true);
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
	public GestaoTCC() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmGestoTcc = new JFrame();
		frmGestoTcc.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\Desktop\\Icones\\tcc-completpo.jpg"));
		frmGestoTcc.setTitle("Gest\u00E3o - TCC");
		frmGestoTcc.setBounds(100, 100, 450, 300);
		frmGestoTcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestoTcc.getContentPane().setLayout(null);
		frmGestoTcc.setVisible(true);
		JLabel lblNewLabel = new JLabel("Gest\u00E3o - TCC");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(133, -20, 167, 90);
		frmGestoTcc.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aluno:");
		lblNewLabel_1.setBounds(65, 53, 56, 16);
		frmGestoTcc.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Curso:");
		lblNewLabel_2.setBounds(65, 91, 56, 16);
		frmGestoTcc.getContentPane().add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBounds(166, 107, 56, -20);
		frmGestoTcc.getContentPane().add(list);
		
		JComboBox aluno = new JComboBox();
		aluno.setBounds(106, 49, 163, 22);
		aluno.addItem("Selecione o(a) Aluno(a)");
		aluno.addItem("Aluno(a) 1");
		aluno.addItem("Aluno(a) 2");
		aluno.addItem("Aluno(a) 3");
		frmGestoTcc.getContentPane().add(aluno);
		
		JComboBox opcoesCurso = new JComboBox();
		opcoesCurso.setBounds(106, 88, 163, 22);
		opcoesCurso.addItem("Selecione o Curso");
		opcoesCurso.addItem("Curso 1");
		opcoesCurso.addItem("Curso 2");
		opcoesCurso.addItem("Curso 3");
		frmGestoTcc.getContentPane().add(opcoesCurso);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tema Trabalho:");
		lblNewLabel_2_1.setBounds(65, 123, 101, 16);
		frmGestoTcc.getContentPane().add(lblNewLabel_2_1);
		
		
		
		JTextField temaTrabalho = new JTextField();
		temaTrabalho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		temaTrabalho.setText("");
		temaTrabalho.setBounds(160, 120, 167, 22);
		frmGestoTcc.getContentPane().add(temaTrabalho);
		temaTrabalho.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de entrega:");
		lblNewLabel_3.setBounds(65, 167, 101, 16);
		frmGestoTcc.getContentPane().add(lblNewLabel_3);
		
		JFormattedTextField dataFormat = new JFormattedTextField(new MaskFormatter("##/##/####"));
		dataFormat.setText(" /  /");
		dataFormat.setBounds(166, 164, 77, 22);
		frmGestoTcc.getContentPane().add(dataFormat);
		dataFormat.setColumns(10);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataFormat.setText("");
				temaTrabalho.setText("");
				opcoesCurso.setSelectedIndex(0);
				aluno.setSelectedIndex(0);
			}
		});{
		limpar.setBounds(106, 215, 97, 25);
		frmGestoTcc.getContentPane().add(limpar);
		}
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(280, 215, 97, 25);
		frmGestoTcc.getContentPane().add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "TCC cadastrado com sucesso!", "GestãoTCC", JOptionPane.INFORMATION_MESSAGE);
			}

		});
	
	}

	public void setVisble(boolean b) {
	return;
		
	}
}
