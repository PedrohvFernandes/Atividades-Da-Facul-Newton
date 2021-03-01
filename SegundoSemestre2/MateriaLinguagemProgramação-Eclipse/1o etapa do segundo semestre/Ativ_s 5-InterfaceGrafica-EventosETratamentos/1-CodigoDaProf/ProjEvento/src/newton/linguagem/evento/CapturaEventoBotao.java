package newton.linguagem.evento;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;//javax.swing.*-->A ide intende que vou importar tudos os componentes do swing


/*
 * 1 -> Implementar a interface de ActionListener
 * 
 * 
 */
public class CapturaEventoBotao implements ActionListener {//implementando(implements) uma classe ActionListener(interface do java)
	
	private JButton botao;//criando um botao JButton
	
	//metodo janela
	public void janela() {
		JFrame frame = new JFrame();//uma janela, um quadrado
		botao = new JButton();//instanciando o botao
		
		//incluindo o ouvinte
		botao.addActionListener(this);//Registra o evento, nesse caso a a��o vai ser do mouse
		botao.setSize(100, 50);//tamanho do botao
		
		frame.getContentPane().add(botao);//para incluir o botao dentro do frame, incluir algo no frame, colocando a janelo do botao dentro do frame
		frame.setSize(300, 100);//tamanho do frame(tela)
		frame.setVisible(true);//deixando visivel o frame(tela)
		
	}
	
	
	@Override//Para eu conseguir sobrescrever(definir)que que eu quero que implemente de acordo com a minha classe no metodo
	public void actionPerformed(ActionEvent evento) {//actionPerformed->metodo que � implementando dentro da classe ActionListener(interface)	
		//Ex:Colocando uma mensagem no botao
		botao.setText("Bot�o foi clicado!!!!");	
		
		//Ex:Alterando a fonte da mensagem
		botao.setFont(new Font("SansSerif", Font.BOLD, 20));
	}
	

	public static void main(String[] args) {//para executar o programa		
		CapturaEventoBotao captura = new CapturaEventoBotao();
		captura.janela();

	}	

}
